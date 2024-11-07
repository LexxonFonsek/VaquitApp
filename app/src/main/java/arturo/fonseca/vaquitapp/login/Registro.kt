package arturo.fonseca.vaquitapp.login

import androidx.compose.runtime.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.text.*
import androidx.compose.material.*
import androidx.compose.material3.Text
import androidx.compose.ui.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.*
import androidx.compose.ui.layout.*
import coil3.compose.AsyncImage

@Composable
fun Registro() {
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
                AsyncImage(
                    model = {"https://i.imgur.com/1tMFzp8.png"},
                    contentDescription = null,
                    modifier = Modifier
                        .height(917.dp)
                        .fillMaxWidth()
                )
                Column(
                    modifier = Modifier
                        .height(917.dp)
                        .fillMaxWidth()
                        .padding(top = 26.dp,bottom = 55.dp,)
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(horizontal = 34.dp,)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .fillMaxWidth()
                            .background(
                                color = Color(0xFFD9D9D9),
                                shape = RoundedCornerShape(10.dp)
                            )
                            .padding(vertical = 17.dp,)
                    ){
                        Text("Regístrate",
                            color = Color(0xFF2C2C2C),
                            fontSize = 24.sp,
                        )
                    }
                    AsyncImage(
                    model = {"https://i.imgur.com/1tMFzp8.png"},
                    contentDescription = null,
                    modifier = Modifier
                        .height(917.dp)
                        .fillMaxWidth()
                )
                    Column(
                        modifier = Modifier
                            .padding(horizontal = 29.dp,)
                            .clip(shape = RoundedCornerShape(20.dp))
                            .fillMaxWidth()
                            .background(
                                color = Color(0xB0D9D9D9),
                                shape = RoundedCornerShape(20.dp)
                            )
                            .padding(top = 38.dp,bottom = 58.dp,)
                    ){
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 27.dp,start = 45.dp,end = 45.dp,)
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
                                .padding(vertical = 14.dp,)
                        ){
                            Text("Correo",
                                color = Color(0xFF49454F),
                                fontSize = 14.sp,
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 18.dp,start = 45.dp,end = 45.dp,)
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
                                .padding(vertical = 14.dp,)
                        ){
                            Text("Contraseña",
                                color = Color(0xFF49454F),
                                fontSize = 14.sp,
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 18.dp,start = 45.dp,end = 45.dp,)
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
                                .padding(vertical = 14.dp,)
                        ){
                            Text("Ingrese contraseña",
                                color = Color(0xFF49454F),
                                fontSize = 14.sp,
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 18.dp,start = 45.dp,end = 45.dp,)
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
                                .padding(vertical = 14.dp,)
                        ){
                            Text("Usuario",
                                color = Color(0xFF49454F),
                                fontSize = 14.sp,
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 18.dp,start = 45.dp,end = 45.dp,)
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
                                .padding(vertical = 14.dp,)
                        ){
                            Text("Teléfono",
                                color = Color(0xFF49454F),
                                fontSize = 14.sp,
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 18.dp,start = 45.dp,end = 45.dp,)
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
                                .padding(vertical = 14.dp,)
                        ){
                            Text("Estado",
                                color = Color(0xFF49454F),
                                fontSize = 14.sp,
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(bottom = 46.dp,start = 45.dp,end = 45.dp,)
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
                                .padding(vertical = 14.dp,)
                        ){
                            Text("Municipio",
                                color = Color(0xFF49454F),
                                fontSize = 14.sp,
                            )
                        }
                        Text("Ya tengo una cuenta.",
                            color = Color(0xFFFFFFFF),
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(bottom = 24.dp,start = 103.dp,)
                        )
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(horizontal = 98.dp,)
                                .clip(shape = RoundedCornerShape(10.dp))
                                .fillMaxWidth()
                                .background(
                                    color = Color(0xFF1D1B20),
                                    shape = RoundedCornerShape(10.dp)
                                )
                                .padding(vertical = 22.dp,)
                        ){
                            Text("Crear cuenta",
                                color = Color(0xFFFFFFFF),
                                fontSize = 14.sp,
                            )
                        }
                    }
                }
            }
        }
    }
}