package arturo.fonseca.vaquitapp.ui.theme.AltaBecerros.ui

import android.content.res.Configuration
import androidx.compose.runtime.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.text.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberBottomAppBarState
import androidx.compose.ui.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.*
import androidx.compose.ui.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import arturo.fonseca.vaquitapp.R

@Composable
fun AltaBecerros(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .requiredWidth(width = 412.dp)
            .requiredHeight(height = 917.dp)
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
                .padding(top = 38.dp, start = 32.dp, end = 32.dp,)
                .verticalScroll(rememberScrollState())
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 10.dp,)
                    .height(50.dp)
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFFFFFFFF),
                    )
            ){
//                CoilImage(
//                    imageModel = {"https://i.imgur.com/1tMFzp8.png"},
//                    imageOptions = ImageOptions(contentScale = ContentScale.Crop),
//                    modifier = Modifier
//                        .width(18.dp)
//                        .height(12.dp)
//                )
                Column(
                    modifier = Modifier
                        .weight(1f)
                ){
                }
                Text("Alta Becerros",
                    color = Color.Black,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .padding(end = 32.dp,)
                )
                Image(
                    painter = painterResource(id = R.drawable.logo), //Imagen del logo Vaquitapp
                    contentDescription = "LogoVaquitApp",
                    modifier = Modifier
                        .offset(
                            x = 2.dp,
                            y = 0.dp
                        )
                        .requiredSize(size = 50.dp)
                )
            }

            Text("Nombre",
                color = Color(0xFF2E3036),
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(bottom = 4.dp,)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 4.dp,)
                    .fillMaxWidth()
            ){
                Column(
                    modifier = Modifier
                        .padding(end = 10.dp,)
                        .width(256.dp)
                ){
                    Column(
                        modifier = Modifier
                            .border(
                                width = 1.dp,
                                color = Color(0xFFC5C6CC),
                                shape = RoundedCornerShape(5.dp)
                            )
                            .clip(shape = RoundedCornerShape(5.dp))
                            .width(200.dp)
                    ){
                        TextField(
                            value = "",
                            onValueChange = {},
                            placeholder = { Text("E.j: Juan Perez") },
                            modifier = Modifier
                                .height(50.dp)
                        )


                    }
                    Text("Sexo",
                        color = Color(0xFF2E3036),
                        fontSize = 12.sp,
                        modifier = Modifier
                            .padding(bottom = 4.dp,)
                    )
                    Column(
                        modifier = Modifier
                            .border(
                                width = 1.dp,
                                color = Color(0xFFC5C6CC),
                                shape = RoundedCornerShape(5.dp)
                            )
                            .clip(shape = RoundedCornerShape(5.dp))
                            .width(200.dp)
                    ){
                        TextField(
                            value = "",
                            onValueChange = {},
                            placeholder = { Text("E.j: Blanco") },
                            modifier = Modifier
                                .height(50.dp)
                        )
                    }
                }

                Column(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(10.dp))
                        .width(10.dp)
                        .background(
                            color = Color(0xFFEAF2FF),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(horizontal = 24.dp,)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.becerro),
                        contentDescription = "Becerros",
                        modifier = Modifier
                            .padding(top = 20.dp,)
                           .height(31.dp)
                           .fillMaxWidth()
                           .requiredSize(size = 50.dp)
                   )
                    Text("Foto",
                        color = Color(0xFF000000),
                        fontSize = 14.sp
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Text("Fecha de Nacimiento",
                    color = Color(0xFF2E3036),
                    fontSize = 12.sp,
                    modifier = Modifier
                        .padding(bottom = 4.dp,)
                )
            }

            Column(
                modifier = Modifier
                    .padding(bottom = 21.dp,)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFC5C6CC),
                        shape = RoundedCornerShape(5.dp)
                    )
                    .clip(shape = RoundedCornerShape(5.dp))
                    .fillMaxWidth()
                    .padding(vertical = 19.dp, horizontal = 17.dp,)
            ){
                Text("Ej.: Blanco",
                color = Color(0xFF8F9098), //Fecha
                fontSize = 10.sp,
                )
            }
            Text("Peso al nacer",
                color = Color(0xFF2E3036),
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(bottom = 7.dp,)
            )
            Column(
                modifier = Modifier
                    .padding(bottom = 18.dp,)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFC5C6CC),
                        shape = RoundedCornerShape(5.dp)
                    )
                    .clip(shape = RoundedCornerShape(5.dp))
                    .fillMaxWidth()
            ){
                TextField(
                    value = "",
                    onValueChange = {},
                    placeholder = { Text("E.j: Juan Perez") },
                    modifier = Modifier
                            .fillMaxWidth()
                )

            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 7.dp,)
                    .fillMaxWidth()
            ){
                Text("Madre",
                    color = Color(0xFF2E3036),
                    fontSize = 12.sp,
                    modifier = Modifier
                        .padding(end = 150.dp,)
                )
                Text("Padre",
                    color = Color(0xFF2E3036),
                    fontSize = 12.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 12.dp,)
                    .fillMaxWidth()
            ){
                Column(
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFFC5C6CC),
                            shape = RoundedCornerShape(5.dp)
                        )
                        .clip(shape = RoundedCornerShape(5.dp))
                        .width(163.dp)
                ){
                    TextField(
                        value = "",
                        onValueChange = {},
                        placeholder = { Text("E.j: XXXXXX") },
                        modifier = Modifier.fillMaxWidth()
                    )

                }
                Column(
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFFC5C6CC),
                            shape = RoundedCornerShape(5.dp)
                        )
                        .clip(shape = RoundedCornerShape(5.dp))
                        .width(162.dp)
                ){
                    TextField(
                        value = "",
                        onValueChange = {},
                        placeholder = { Text("E.j: Padre") },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 5.dp,)
                    .fillMaxWidth()
            ){
//                CoilImage(
//                    imageModel = {"https://i.imgur.com/1tMFzp8.png"},
//                    imageOptions = ImageOptions(contentScale = ContentScale.Crop),
//                    modifier = Modifier
//                        .padding(end = 9.dp,)
//                        .width(20.dp)
//                        .height(20.dp)
//                )
                var state by remember { mutableStateOf(true) }


                RadioButton(
                    selected = state,
                    onClick = { state = true },
                    modifier = Modifier.semantics { contentDescription = "Localized Description" }
                )
                Text("Inseminación artificial",
                    color = Color(0xFF000000),
                    fontSize = 12.sp,
                    modifier = Modifier
                        .padding(end = 4.dp,)
                )

                RadioButton(
                    selected = !state,
                    onClick = { state = true },
                    modifier = Modifier.semantics { contentDescription = "Localized Description" }
                )

                Text("Desconozco Padres",
                    color = Color(0xFF000000),
                    fontSize = 12.sp,
                    modifier = Modifier
                        .padding(end = 1.dp,)
                )
            }
            Text("Información del semen/embrión",
                color = Color(0xFF2E3036),
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(bottom = 8.dp,)
            )
            Column(
                modifier = Modifier
                    .padding(bottom = 20.dp,)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFC5C6CC),
                        shape = RoundedCornerShape(5.dp)
                    )
                    .clip(shape = RoundedCornerShape(5.dp))
                    .fillMaxWidth()
            ){
                TextField(
                    value = "",
                    onValueChange = {},
                    placeholder = { Text("E.j: Rancho La Loma, Guachinango,Jal") },
                    modifier = Modifier.fillMaxWidth()
                )

            }
            Text("Procedencia",
                color = Color(0xFF2E3036),
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(bottom = 8.dp,)
            )
            Column(
                modifier = Modifier
                    .padding(bottom = 20.dp,)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFC5C6CC),
                        shape = RoundedCornerShape(5.dp)
                    )
                    .clip(shape = RoundedCornerShape(5.dp))
                    .fillMaxWidth()
            ){
                TextField(
                    value = "",
                    onValueChange = {},
                    placeholder = { Text("Ej.: Rancho “La Loma”, Guachinango") },
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                    Button(
                        onClick = { /* Acción para botón Atrás */ },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = androidx.compose.ui.graphics.Color.Black, // Fondo negro
                            contentColor = androidx.compose.ui.graphics.Color.White    // Texto blanco
                        ),
                        shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp), // Bordes redondeados
                        modifier = Modifier
                            .padding(8.dp) // Espaciado opcional
                            .width(150.dp)
                    ) {
                        Text(text = "Atrás")
                    }
                Button(
                    onClick = { /* Acción para botón Atrás */ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = androidx.compose.ui.graphics.Color.Black, // Fondo negro
                        contentColor = androidx.compose.ui.graphics.Color.White    // Texto blanco
                    ),
                    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp), // Bordes redondeados
                    modifier = Modifier
                        .padding(8.dp) // Espaciado opcional
                        .width(150.dp)
                ) {
                    Text(text = "Siguiente")
                }

                    }
                }
            }
        }



        @Preview(showSystemUi = true)
        @Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
        @Preview(widthDp = 412, heightDp = 917)
        @Composable
        private fun AltaBecerrosPreview(modifier: Modifier = Modifier) {
            AltaBecerros(Modifier)
        }
