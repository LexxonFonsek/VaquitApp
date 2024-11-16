package arturo.fonseca.vaquitapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import arturo.fonseca.vaquitapp.navigation.AppNavigation
import arturo.fonseca.vaquitapp.ui.theme.AltaVacas.ui.AltaVacasScreen
import arturo.fonseca.vaquitapp.ui.theme.VaquitappTheme
import arturo.fonseca.vaquitapp.ui.theme.login.ui.Login1
import arturo.fonseca.vaquitapp.ui.theme.menuSecundarioAniadir.ui.MenuSecundarioScreen
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val analytics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString("message", "Integración de Firebase completa")
        analytics.logEvent("InitScreen", bundle)
        setContent {
            VaquitappTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Login1(navController = NavController(LocalContext.current))
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VaquitappTheme {
        Greeting("Android")
    }
}