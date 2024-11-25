package arturo.fonseca.vaquitapp.Presentacion.Registro

import android.util.Log
import android.util.Patterns
import androidx.compose.runtime.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.ui.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import androidx.navigation.NavController
import arturo.fonseca.vaquitapp.R
import arturo.fonseca.vaquitapp.navigation.appScreens
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import com.google.firebase.auth.ktx.auth


@Composable
fun Registro(auth: FirebaseAuth, navController: NavController) {
    var correo by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var usuario by remember { mutableStateOf("") }
    var registrationError by remember { mutableStateOf("") }
    val isEmailValid = correo.isNotBlank() && Patterns.EMAIL_ADDRESS.matcher(correo).matches()
    var isLoading by remember { mutableStateOf(false) }


    Column(
        modifier= Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp) // Add padding for better spacing
            .verticalScroll(rememberScrollState()), // Make content scrollable
        horizontalAlignment = Alignment.CenterHorizontally // Center content horizontally
    ) {
        Text(
            text = "Regístrate",
            color = Color(0xFF2C2C2C),
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "LogoVaquitApp",
            modifier = Modifier
                .size(150.dp)
                .padding(bottom = 16.dp)
        )

        // Input fields
        OutlinedTextField(
            value = correo,
            onValueChange = { correo = it },
            label = { Text("Correo electrónico") },
            isError = !isEmailValid,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Contraseña") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )
        OutlinedTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            label = { Text("Confirmar contraseña") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )
        OutlinedTextField(
            value = usuario,
            onValueChange = { usuario = it },
            label = { Text("Usuario") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        // "Ya tengo una cuenta" text
        Text(
            text = "Ya tengo una cuenta.",
            color = Color(0xFF2D54E1),
            fontSize = 14.sp,
            modifier = Modifier.clickable {
                // Handle navigation to login screen
                navController.navigate(appScreens.Login1.route)
            }
        )
        Spacer(modifier = Modifier.height(16.dp)) // Add spacing

        Button(
            onClick = {
                isLoading = true
                if (password == confirmPassword) { // Check if passwords match
                    auth.createUserWithEmailAndPassword(correo, password)
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                // Sign in success, update UI with the signed-in user's information
                                Log.d("Registro", "createUserWithEmail:success")
                                val user = auth.currentUser// You can add user details to Firestore or Realtime Database here
                                navController.navigate(appScreens.Login1.route) // Navigate to login screen
                            } else {
                                // If sign in fails, display a message to the user.
                                Log.w(
                                    "Registro",
                                    "createUserWithEmail:failure",
                                    task.exception
                                )
                                registrationError =
                                    "Error de registro" // Update error state
                                                }
                                            }
                                    } else {
                                        registrationError =
                                            "Las contraseñas no coinciden" // Update error state
                                    }
                                },
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                if (isLoading) {
                                    CircularProgressIndicator()
                                } else {
                                    Text("Crear cuenta", color = Color.White)
                                }
                            }

                            // Display registration error if any
                            if (registrationError.isNotEmpty()) {
                                Text(text = registrationError, color = Color.Red,modifier = Modifier.padding(top = 8.dp))
                            }

    }
}



