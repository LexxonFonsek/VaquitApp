package arturo.fonseca.vaquitapp.ui.theme.registro.ui

import androidx.compose.runtime.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import arturo.fonseca.vaquitapp.ui.theme.login.ui.Login1
import coil3.compose.AsyncImage

@Composable
fun Registro(modifier: Modifier = Modifier) {
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
                            .padding(horizontal = 29.dp,)
                            .clip(shape = RoundedCornerShape(20.dp))
                            .fillMaxWidth()
                            .background(
                                color = Color(0xB0D9D9D9),
                                shape = RoundedCornerShape(20.dp)
                            )
                            .padding(top = 18.dp,bottom = 18.dp,)
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
//                            TextField(value = text, onValueChange = {text = it},
//                                label = {Text("Correo")},
//                                //modifier = modifier.fillMaxSize(),
//                                placeholder = {Text("Ejemplo: Lola")},
//                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Tipo de edit text
//                                singleLine = true, //No se amplia al darle enter en eñl e teclado
//                                maxLines = 1,
//                                colors = TextFieldDefaults.colors(Color(0xFF000000),
//                                    focusedIndicatorColor = Color.Transparent,
//                                    unfocusedIndicatorColor = Color.Transparent
//                                    )
                            //)
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
@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun RegistroPreview() {
    Registro(Modifier)
}