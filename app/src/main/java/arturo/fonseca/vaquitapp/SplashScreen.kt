
package arturo.fonseca.vaquitapp

import arturo.fonseca.vaquitapp.R

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import arturo.fonseca.vaquitapp.navigation.appScreens
import kotlinx.coroutines.delay
import org.checkerframework.checker.units.qual.C

@Preview
@Composable
fun SplashScreen() {
    // Estructura principal
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Tarjeta que contiene la imagen y el texto
        Card(
            modifier = Modifier
                .size(280.dp)
                .padding(16.dp), // Espaciado alrededor
            shape = RoundedCornerShape(130.dp)
        ) {
            // Contenedor vertical para imagen y texto
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                // Imagen del logo
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo VaquitApp",
                    modifier = Modifier
                        .size(150.dp)
                        .padding(bottom = 16.dp) // Espaciado entre imagen y texto
                )

                // Texto de bienvenida
                Text(
                    text = "Bienvenid@s",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Box{
                    Modifier.size(30.dp)
                    CircularProgressIndicator()

                }
            }
        }
    }
}
