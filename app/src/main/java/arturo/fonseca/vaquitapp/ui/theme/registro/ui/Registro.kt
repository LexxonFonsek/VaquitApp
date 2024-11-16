package arturo.fonseca.vaquitapp.ui.theme.registro.ui

import androidx.compose.runtime.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button

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


@Composable
fun Registro(navController: NavController, modifier: Modifier = Modifier) {
    var correo by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var usuario by remember { mutableStateOf("") }
    var telefono by remember { mutableStateOf("") }
    var estado by remember { mutableStateOf("") }
    var municipio by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(
                color = Color(0xFFFFFFFF),
            )
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(
                    color = Color(0xFFFFFFFF),
                )
                .verticalScroll(rememberScrollState())
        ){
            Box{
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .padding(top = 26.dp,bottom = 55.dp)
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(horizontal = 34.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .fillMaxWidth()

                            .background(
                                color = Color(0xFFD9D9D9),
                                shape = RoundedCornerShape(10.dp)
                            )
                            .padding(vertical = 17.dp)
                    ){
                        Text("Regístrate",
                            color = Color(0xFF2C2C2C),
                            fontSize = 24.sp,
                        )
                    }
                    Image(
                    painter = painterResource(id = arturo.fonseca.vaquitapp.R.drawable.logo), //Imagen del logo Vaquitapp
                    contentDescription = "LogoVaquitApp",
                    modifier = Modifier
                        .offset(
                            x = 130.dp,
                            y = 10.dp
                        )
                        .requiredSize(size = 150.dp)
                )
                    Column(
                        modifier = Modifier
                            .padding(horizontal = 29.dp)
                            .clip(shape = RoundedCornerShape(20.dp))
                            .fillMaxWidth()
                            .height(660.dp)

                            .background(
                                color = Color(0xB0D9D9D9),
                                shape = RoundedCornerShape(20.dp)
                            )
                            .padding(top = 18.dp,bottom = 18.dp)
                    ){
                        Text("Correo electrónico",
                            color = Color(0xFF000000),
                            fontSize = 14.sp,
                            modifier = Modifier.offset(x=47.dp)
                        )
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 27.dp,start = 45.dp,end = 45.dp)
                                .border(
                                    width = 1.dp,
                                    color = Color(0xFFCAC4D0),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .clip(shape = RoundedCornerShape(8.dp))
                                .fillMaxWidth()
                                .background(
                                    color = Color(0xFFFFFFFF),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .padding(vertical = 0.dp)
                        ){
                            TextField(
                                value = correo,
                                singleLine = true,
                                modifier = Modifier.height(35.dp),
                                onValueChange = { correo= it },
                                label = { Text("Correo electrónico") }
                            )
                        }
                        Text("Contraseña",
                            color = Color(0xFF000000),
                            fontSize = 14.sp,
                            modifier = Modifier.offset(x=47.dp)
                        )
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 18.dp,start = 45.dp,end = 45.dp)
                                .border(
                                    width = 1.dp,
                                    color = Color(0xFFCAC4D0),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .clip(shape = RoundedCornerShape(8.dp))
                                .fillMaxWidth()
                                .background(
                                    color = Color(0xFFFFFFFF),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .padding(vertical = 0.dp)
                        ){
                            TextField(
                                value = password,
                                singleLine = true,
                                modifier = Modifier.height(35.dp),
                                onValueChange = { password = it },
                                label = { Text("Contraseña") },
                                visualTransformation = PasswordVisualTransformation(),
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                            )
                        }
                        Text("Confirmar Contraseña",
                            color = Color(0xFF000000),
                            fontSize = 14.sp,
                            modifier = Modifier.offset(x=47.dp)
                        )
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 18.dp,start = 45.dp,end = 45.dp)
                                .border(
                                    width = 1.dp,
                                    color = Color(0xFFCAC4D0),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .clip(shape = RoundedCornerShape(8.dp))
                                .fillMaxWidth()
                                .background(
                                    color = Color(0xFFFFFFFF),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .padding(vertical = 0.dp)
                        ){
                            TextField(
                                value = confirmPassword,
                                singleLine = true,
                                modifier = Modifier.height(35.dp),
                                onValueChange = { confirmPassword = it },
                                label = { Text("Confirmar contraseña") },
                                visualTransformation = PasswordVisualTransformation(),
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                            )
                        }
                        Text("Usuario",
                            color = Color(0xFF000000),
                            fontSize = 14.sp,
                            modifier = Modifier.offset(x=47.dp)
                        )
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 18.dp,start = 45.dp,end = 45.dp)
                                .border(
                                    width = 1.dp,
                                    color = Color(0xFFCAC4D0),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .clip(shape = RoundedCornerShape(8.dp))
                                .fillMaxWidth()
                                .background(
                                    color = Color(0xFFFFFFFF),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .padding(vertical = 0.dp)
                        ){
                            TextField(
                                value = usuario,
                                singleLine = true,
                                modifier = Modifier.height(35.dp),
                                onValueChange = { usuario = it },
                                label = { Text("Usuario") }
                            )
                        }
                        Text("Telefono",
                            color = Color(0xFF000000),
                            fontSize = 14.sp,
                            modifier = Modifier.offset(x=47.dp)
                        )
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 18.dp,start = 45.dp,end = 45.dp)
                                .border(
                                    width = 1.dp,
                                    color = Color(0xFFCAC4D0),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .clip(shape = RoundedCornerShape(8.dp))
                                .fillMaxWidth()
                                .background(
                                    color = Color(0xFFFFFFFF),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .padding(vertical = 0.dp)
                        ){
                            TextField(
                                value = telefono,
                                singleLine = true,
                                modifier = Modifier.height(35.dp),
                                onValueChange = { telefono = it },
                                label = { Text("Telefono") }
                            )
                        }
                        Text("Estado",
                            color = Color(0xFF000000),
                            fontSize = 14.sp,
                            modifier = Modifier.offset(x=47.dp)
                        )
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 18.dp,start = 45.dp,end = 45.dp)
                                .border(
                                    width = 1.dp,
                                    color = Color(0xFFCAC4D0),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .clip(shape = RoundedCornerShape(8.dp))
                                .fillMaxWidth()
                                .background(
                                    color = Color(0xFFFFFFFF),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .padding(vertical = 0.dp)
                        ){
                            TextField(
                                value = estado,
                                singleLine = true,
                                modifier = Modifier.height(35.dp),
                                onValueChange = { estado = it },
                                label = { Text("Estado") }
                            )
                        }
                        Text("Municipio",
                            color = Color(0xFF000000),
                            fontSize = 14.sp,
                            modifier = Modifier
                                .offset(x=47.dp)
                                )
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 45.dp,start = 45.dp,end = 45.dp)
                                .border(
                                    width = 1.dp,
                                    color = Color(0xFFCAC4D0),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .clip(shape = RoundedCornerShape(8.dp))
                                .fillMaxWidth()
                                .background(
                                    color = Color(0xFFFFFFFF),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .padding(vertical = 0.dp)
                        ){

                            TextField(
                                value = municipio,
                                modifier = Modifier.height(35.dp),
                                singleLine = true,
                                onValueChange = { municipio = it },
                                label = { Text("Municipio") }
                            )
                        }
                        Text("Ya tengo una cuenta.",
                            color = Color(0xFF2D54E1),
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(bottom = 24.dp,start = 103.dp)
                        )
//                        Column(
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                            modifier = Modifier
//                                .padding(horizontal = 98.dp,)
//                                .clip(shape = RoundedCornerShape(10.dp))
//                                .fillMaxWidth()
//                                .background(
//                                    color = Color(0xFF1D1B20),
//                                    shape = RoundedCornerShape(10.dp)
//                                )
//                                .padding(vertical = 22.dp,)
//                        ){
                            Button(onClick = { /* Acción para botón Atrás */ }) {
                                Text("Crear cuenta",
                                    color = Color(0xFFFFFFFF),

                                    fontSize = 24.sp,
                                )
                                }

                        }
                    }
                }
            }
        }
    }

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun RegistroPreview() {
    Registro(navController = NavController(LocalContext.current))
}