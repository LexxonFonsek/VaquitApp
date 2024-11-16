package arturo.fonseca.vaquitapp.ui.theme.login.ui


import androidx.compose.runtime.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.ui.*

import androidx.compose.ui.graphics.*
import androidx.compose.ui.platform.LocalContext

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import androidx.navigation.NavController
import arturo.fonseca.vaquitapp.R
import arturo.fonseca.vaquitapp.navigation.appScreens
import arturo.fonseca.vaquitapp.ui.theme.menuAgregar.ui.BtnAniadir


@Composable
fun Login1(navController: NavController, modifier: Modifier = Modifier) {
    var usuario by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp), // Added padding
        horizontalAlignment = Alignment.CenterHorizontally, // Center content horizontally
        verticalArrangement = Arrangement.Center // Center content vertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "LogoVaquitApp",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(20.dp)) // Add space

        Text(
            text = "Bienvenido a VaquitApp",color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp
        )

        Spacer(modifier = Modifier.height(10.dp)) // Add space

        Text(
            text = "Una aplicación pensada en la productividad bovina",
            color = Color.Black,
            fontStyle = FontStyle.Italic,
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp)) // Add space

        // Input fields (usuario, password)
        OutlinedTextField(
            value = usuario,
            onValueChange = { usuario = it },
            label = { Text("Usuario") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(10.dp)) // Add space

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Contraseña") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp)) // Add space

        // Buttons (Acceder, Registrarse)
        Button(
            onClick = { navController.navigate(appScreens.MenuSecundarioScreen) },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text("Acceder", color = Color.White)
        }

        Spacer(modifier = Modifier.height(10.dp)) // Add space

        TextButton(onClick = { /*TODO*/ }) { // Replace with registration navigation
            Text("¿No tienes cuenta? Regístrate aquí.", color = Color(0xFF2D54E1))
        }
    }
}


@Preview(widthDp = 412, heightDp = 917)
@Composable
fun Login1Preview() {
    Login1(navController = NavController(LocalContext.current))
}
