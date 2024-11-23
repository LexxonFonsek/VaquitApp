package arturo.fonseca.vaquitapp.ui.theme.recuperar.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import arturo.fonseca.vaquitapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecuperarContrasena(modifier: Modifier = Modifier) {
    var correo by remember { mutableStateOf("") }
    var telefono by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color(0xFFFFFFFF),
            )
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .requiredHeight(height = 917.dp)
                .requiredWidth(width = 412.dp)
                .padding(20.dp)
        ) {
            Spacer(modifier = Modifier.height(16.dp))

            // Título
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .background(Color.LightGray, shape = RoundedCornerShape(8.dp)) // Fondo gris con bordes redondeados
                    .padding(16.dp)
                    .width(310.dp)
                    .height(25.dp)
            ) {
                Text(
                    text = "Recuperar contraseña",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logotipo",
                    modifier = Modifier
                        .height(170.dp),
                    contentScale = ContentScale.Crop
                )}

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(550.dp)
                        .padding(16.dp)
                        .padding(bottom = 16.dp)
                        .background(
                            color = Color(0xFFC5C6CC),
                            shape = RoundedCornerShape(12.dp)
                        )
                ) {
                    
                    Column(
                        modifier = Modifier

                            .clip(shape = RoundedCornerShape(5.dp))
                            .width(270.dp)
                    ){
                        Text(
                            text = "Ingresa",
                            fontSize = 18.sp,
                            modifier = Modifier.fillMaxWidth(), // Ocupa todo el ancho del contenedor
                            textAlign = TextAlign.Center // Centra el texto horizontalmente
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        OutlinedTextField(
                            value = "",
                            onValueChange = {correo = it},
                            label = { Text("Correo") },
                            modifier = Modifier.width(270.dp),
                            singleLine = true,
                            shape = RoundedCornerShape(10.dp),
                            visualTransformation = PasswordVisualTransformation(),
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                containerColor = Color.White // Fondo blanco dentro de los bordes
                            )
                        )
                    }



                    Spacer(modifier = Modifier.height(8.dp))

                    Text("ó", fontSize = 18.sp,)

                    OutlinedTextField(
                        value = "",
                        onValueChange = {telefono = it},
                        label = { Text("Teléfono") },
                        modifier = Modifier.width(270.dp),
                        singleLine = true,
                        shape = RoundedCornerShape(10.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = Color.White
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))


                    Button(
                        onClick = { /* Acción de recuperación */ },
                        modifier = Modifier
                            .padding(top = 30.dp)
                            .width(250.dp)
                            .height(50.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                    ) {
                        Text(text = "Restablecer Contraseña", color = Color.White, fontSize = 16.sp)
                    }
                }
            }
        }
    }



@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun RecuperarContrasenaPreview(modifier: Modifier = Modifier) {
    RecuperarContrasena(Modifier)
}
