package arturo.fonseca.vaquitapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import arturo.fonseca.vaquitapp.ui.theme.VaquitappTheme
import arturo.fonseca.vaquitapp.navigation.AppNavigation
import arturo.fonseca.vaquitapp.navigation.appScreens
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : ComponentActivity() {
    private lateinit var navController: NavController
    private lateinit var auth: FirebaseAuth
    private lateinit var db: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth
        db = Firebase.firestore // Initialize Firestore instance

        setContent {
            navController = rememberNavController()

            VaquitappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation(navController, auth, db)
                }
            }
        }}

    override fun onStart() {
        super.onStart()
        if (this::db.isInitialized) {
            // db is initialized, fetch data
            db.collection("vaquitapp").get()
                .addOnSuccessListener { documents ->
                    for (document in documents) {
                        Log.d("Vaquitapp", "${document.id} => ${document.data}")
                    }
                }
                .addOnFailureListener { exception ->
                    Log.w("Vaquitapp", "Error getting documents.", exception)

                }
        } else {
            val currentUser = auth.currentUser
            if (currentUser != null) {
                navController.navigate(appScreens.Home.route) // Assuming 'appScreens.Home.route' is your home screen route
                Log.i("Vaquitapp", "Login Exitoso!!!!!")
            } else {
                // Navigate to the login screen if the user is not logged in
                navController.navigate(appScreens.Login1.route) // Assuming 'appScreens.Login1Screen.route' is your login screen route
            }
            // Consider removing auth.signOut() if you want the user to stay logged in
            // auth.signOut()
        }
    }
}