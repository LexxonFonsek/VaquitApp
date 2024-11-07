package arturo.fonseca.vaquitapp.ui.theme.login.ui


import androidx.compose.runtime.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*

import androidx.compose.material3.Text
import androidx.compose.ui.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import androidx.navigation.NavController
import coil3.compose.AsyncImage


@Composable
    fun Login1 (modifier: Modifier = Modifier) {
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
                    Image(
                    painter = painterResource(id = arturo.fonseca.vaquitapp.R.drawable.logo), //Imagen del logo Vaquitapp
                    contentDescription = "LogoVaquitApp",
                    modifier = Modifier
                        .offset(
                            x = 80.dp,
                            y = 50.dp
                        )
                        .requiredSize(size = 250.dp)
                                            )
                    Column(
                        modifier = Modifier
                            .height(917.dp)
                            .fillMaxWidth()
                            .padding(top = 65.dp,bottom = 39.dp,)
                    ){
                        Box(
                            modifier = Modifier
                                .padding(bottom = 34.dp,start = 123.dp,end = 123.dp,)
                        ){
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ){
//                                Image(
//                                    model = {"https://i.imgur.com/1tMFzp8.png"},
//                                    contentDescription = null,
//                                    modifier = Modifier
//                                        .height(917.dp)
//                                        .fillMaxWidth()
//                                )
                            }
                            Text("Bienvenido a VaquitApp",
                                color = Color(0xFF000000),
                                fontWeight = FontWeight(700),
                                fontSize = 30.sp,
                                modifier = Modifier
                                    .offset(x = 0.dp, y = 272.dp)
                                    .align(Alignment.Center)
                                    .padding(bottom = 23.dp)
                            )
                        }
                        Text("Una aplicacion pensada en la productividad bovina",
                            color = Color(0xFF000000),
                            fontStyle = FontStyle(value = 1),
                            fontWeight = FontWeight(500),
                            fontSize = 24.sp,
                            modifier = Modifier
                                .offset(x = 80.dp, y = 262.dp)
                                .width(260.dp)
                                .padding(bottom = 23.dp)
                        )
                        Column(
                            modifier = Modifier
                                .padding(horizontal = 25.dp,)
                                .offset(x = 0.dp, y = 300.dp)
                                .clip(shape = RoundedCornerShape(20.dp))
                                .fillMaxWidth()
                                .background(
                                    color = Color(0xCFD9D9D9),
                                    shape = RoundedCornerShape(20.dp)
                                )
                                .padding(top = 21.dp,bottom = 10.dp,)
                        ){
                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier
                                    .padding(bottom = 24.dp,start = 24.dp,end = 24.dp,)
                                    .fillMaxWidth()
                            ){
//                                Image(
//                                    model = {"https://i.imgur.com/1tMFzp8.png"},
//                                    contentDescription = null,
//                                    modifier = Modifier
//                                        .height(917.dp)
//                                        .fillMaxWidth()
//                                )
                                Box{
                                    Column(
                                        modifier = Modifier
                                            .width(260.dp)
                                    ){
                                        Column(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .shadow(
                                                    elevation = 4.dp,
                                                    spotColor = Color(0x40000000),
                                                )
                                        ){
                                            Column(
                                                modifier = Modifier
                                                    .padding(top = 23.dp,)
                                                    .border(
                                                        width = 1.dp,
                                                        color = Color(0xFF050303),
                                                        shape = RoundedCornerShape(12.dp)
                                                    )
                                                    .clip(shape = RoundedCornerShape(12.dp))
                                                    .fillMaxWidth()
                                                    .padding(18.dp)
                                            ){
                                                Text("Ej.: luis.aceves",
                                                    color = Color(0xFF000000),
                                                    fontSize = 14.sp,
                                                )
                                            }
                                        }
                                    }
                                    Text("Usuario",
                                        color = Color(0xFF000000),
                                        fontSize = 12.sp,
                                        modifier = Modifier
                                            .offset(x = -3.dp, y = 2.dp)
                                            .align(Alignment.TopStart)
                                            .padding(bottom = 2.dp)
                                    )
                                }
                            }
                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier
                                    .padding(bottom = 2.dp,start = 22.dp,end = 22.dp,)
                                    .fillMaxWidth()
                            ){
//                                AsyncImage(
//                                    model = {"https://i.imgur.com/1tMFzp8.png"},
//                                    contentDescription = null,
//                                    modifier = Modifier
//                                        .height(917.dp)
//                                        .fillMaxWidth()
//                                )
                                Box{
                                    Column(
                                        modifier = Modifier
                                            .width(260.dp)
                                    ){
                                        Column(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .shadow(
                                                    elevation = 4.dp,
                                                    spotColor = Color(0x40000000),
                                                )
                                        ){
                                            Column(
                                                modifier = Modifier
                                                    .padding(top = 23.dp,)
                                                    .border(
                                                        width = 1.dp,
                                                        color = Color(0xFF050303),
                                                        shape = RoundedCornerShape(12.dp)
                                                    )
                                                    .clip(shape = RoundedCornerShape(12.dp))
                                                    .fillMaxWidth()
                                                    .padding(start = 228.dp,end = 16.dp,)
                                            ){
//                                                AsyncImage(
//                                                    model = {"https://i.imgur.com/1tMFzp8.png"},
//                                                    contentDescription = null,
//                                                    modifier = Modifier
//                                                        .height(917.dp)
//                                                        .fillMaxWidth()
//                                                )
                                            }
                                        }
                                    }
                                    Text("Contraseña",
                                        color = Color(0xFF000000),
                                        fontSize = 12.sp,
                                        modifier = Modifier
                                            .offset(x = -3.dp, y = 2.dp)
                                            .align(Alignment.TopStart)
                                            .padding(bottom = 2.dp)
                                    )
                                }
                            }
                            Text("No recuerdo la contraseña",
                                color = Color(0xFF2D54E1),
                                fontSize = 10.sp,
                                modifier = Modifier
                                    .padding(bottom = 31.dp,start = 76.dp,end = 76.dp,)
                            )
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .padding(bottom = 26.dp,start = 91.dp,end = 91.dp,)
                                    .clip(shape = RoundedCornerShape(10.dp))
                                    .width(161.dp)
                                    .height(42.dp)
                                    .background(
                                        color = Color(0xFF000000),
                                        shape = RoundedCornerShape(10.dp)
                                    )
                                    .shadow(
                                        elevation = 4.dp,
                                        spotColor = Color(0x40000000),
                                    )
                                    .padding(vertical = 15.dp,)
                            ){
                                Text("Acceder",
                                    color = Color(0xFFFFFFFF),
                                    fontSize = 14.sp,
                                )
                            }
                            Text("¿No tienes cuenta? Regístrate aquí.",
                                color = Color(0xFF2D54E1),
                                fontSize = 14.sp,
                                modifier = Modifier
                                    .padding(horizontal = 27.dp,)
                            )
                        }
                    }
                }
            }
        }
    }

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun Login1Preview() {
    Login1(Modifier)
   }