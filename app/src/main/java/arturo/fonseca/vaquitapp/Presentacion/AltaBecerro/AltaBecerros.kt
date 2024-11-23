package arturo.fonseca.vaquitapp.ui.theme.AltaBecerros.ui

import android.app.DatePickerDialog
import android.content.Context
import android.content.res.Configuration
import androidx.compose.runtime.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.text.*
import androidx.compose.material.icons.Icons
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import arturo.fonseca.vaquitapp.R
import java.util.Calendar
import androidx.compose.material3.Icon as Icon

@Composable
fun AltaBecerros(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .requiredWidth(width = 412.dp)
            .requiredHeight(height = 917.dp)
            .background(
                color = Color(0xFFFFFFFF),
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(
                    color = Color(0xFFFFFFFF),
                )
                .padding(top = 38.dp, start = 32.dp, end = 32.dp,)
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 10.dp,)
                    .height(50.dp)
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFFFFFFFF),
                    )
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                ) {
                }
                Text(
                    "Alta Becerros",
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

            Text(
                "Nombre",
                color = Color(0xFF2E3036),
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(bottom = 4.dp,)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 4.dp,)
                    .width(400.dp)
            ) {
                Column(
                    modifier = Modifier

                        .width(256.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .border(
                                width = 1.dp,
                                color = Color.Black,
                                shape = RoundedCornerShape(5.dp)
                            )
                            .clip(shape = RoundedCornerShape(5.dp))

                            .width(200.dp)
                    ) {
                        TextField(
                            value = "",
                            onValueChange = {},
                            placeholder = { Text("E.j: Juan Perez") },
                            modifier = Modifier
                                .height(50.dp)
                        )


                    }
                    Text(
                        "Sexo",
                        color = Color(0xFF2E3036),
                        fontSize = 12.sp,
                        modifier = Modifier
                            .padding(bottom = 4.dp,)
                    )
                    Column(
                        modifier = Modifier
                            .border(
                                width = 1.dp,
                                color = Color.Black,
                                shape = RoundedCornerShape(5.dp)
                            )
                            .clip(shape = RoundedCornerShape(5.dp))
                            .width(200.dp)
                    ) {
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
                        .width(220.dp)
                        .height(100.dp)
                        .background(
                            color = Color.Red,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(horizontal = 24.dp,)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.becerro),
                        contentDescription = "Becerros",
                        modifier = Modifier
                            .padding(top = 20.dp,)
                            .height(170.dp)
                            .fillMaxWidth()
                            .requiredSize(size = 50.dp)
                    )
                    Text(
                        "Foto",
                        color = Color(0xFF000000),
                        fontSize = 14.sp
                    )
                }
            }
            var selectedDate by remember { mutableStateOf("") } // Estado para guardar la fecha seleccionada
            val context = LocalContext.current
            // Abrir el selector de fecha
            val datePickerDialog = DatePickerDialog(
                context,
                { _, year, month, dayOfMonth ->
                    selectedDate = "$dayOfMonth/${month + 1}/$year"
                },
                2023, 0, 1 // Fecha inicial (año, mes, día)
            )

            Text(
                "Fecha de Nacimiento",
                color = Color(0xFF2E3036),
                fontSize = 12.sp,
                modifier = Modifier.padding(bottom = 7.dp)
            )
            Column(
                modifier = Modifier
                    .padding(bottom = 18.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(5.dp)
                    )
                    .clip(RoundedCornerShape(5.dp))
                    .fillMaxWidth()
                    .padding(12.dp) // Margen interno dentro del cuadro
            ) {

                // Caja que simula el campo de fecha con un clic
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            showDatePicker(context) { date ->
                                selectedDate = date // Actualiza la fecha seleccionada
                            }
                        }
                        .padding(10.dp)
                        .background(Color.White, shape = RoundedCornerShape(5.dp))
                        .border(1.dp, Color.LightGray, RoundedCornerShape(5.dp))
                ) {
                    Text(
                        text = if (selectedDate.isEmpty()) "Seleccionar fecha" else selectedDate,
                        color = if (selectedDate.isEmpty()) Color.Gray else Color.Black,
                        modifier = Modifier.align(Alignment.CenterStart)
                    )

                }
            }


                Text(
                    "Peso al nacer",
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
                            color = Color.Black,
                            shape = RoundedCornerShape(5.dp)
                        )
                        .clip(shape = RoundedCornerShape(5.dp))
                        .fillMaxWidth()
                ) {
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
                ) {
                    Text(
                        "Madre",
                        color = Color(0xFF2E3036),
                        fontSize = 12.sp,
                        modifier = Modifier
                            .padding(end = 150.dp,)
                    )
                    Text(
                        "Padre",
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
                ) {
                    Column(
                        modifier = Modifier
                            .border(
                                width = 1.dp,
                                color = Color.Black,
                                shape = RoundedCornerShape(5.dp)
                            )
                            .clip(shape = RoundedCornerShape(5.dp))
                            .width(163.dp)
                    ) {
                        TextField(
                            value = "",
                            onValueChange = {},
                            placeholder = { Text("E.j: Madre") },
                            modifier = Modifier.fillMaxWidth()
                        )

                    }
                    Column(
                        modifier = Modifier
                            .border(
                                width = 1.dp,
                                color = Color.Black,
                                shape = RoundedCornerShape(5.dp)
                            )
                            .clip(shape = RoundedCornerShape(5.dp))
                            .width(162.dp)
                    ) {
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
                ) {
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
                        modifier = Modifier.semantics {
                            contentDescription = "Localized Description"
                        }
                    )
                    Text(
                        "Inseminación artificial",
                        color = Color(0xFF000000),
                        fontSize = 12.sp,
                        modifier = Modifier
                            .padding(end = 4.dp,)
                    )

                    RadioButton(
                        selected = !state,
                        onClick = { state = true },
                        modifier = Modifier.semantics {
                            contentDescription = "Localized Description"
                        }
                    )

                    Text(
                        "Desconozco Padres",
                        color = Color(0xFF000000),
                        fontSize = 12.sp,
                        modifier = Modifier
                            .padding(end = 1.dp,)
                    )
                }
                Text(
                    "Información del semen/embrión",
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
                            color = Color.Black,
                            shape = RoundedCornerShape(5.dp)
                        )
                        .clip(shape = RoundedCornerShape(5.dp))
                        .fillMaxWidth()
                ) {
                    TextField(
                        value = "",
                        onValueChange = {},
                        placeholder = { Text("E.j: Rancho La Loma, Guachinango,Jal") },
                        modifier = Modifier.fillMaxWidth()
                    )

                }
                Text(
                    "Procedencia",
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
                            color = Color.Black,
                            shape = RoundedCornerShape(5.dp)
                        )
                        .clip(shape = RoundedCornerShape(5.dp))
                        .fillMaxWidth()
                ) {
                    TextField(
                        value = "",
                        onValueChange = {},
                        placeholder = { Text("Ej.: Rancho “La Loma”, Guachinango") },
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(bottom = 7.dp,)
                        .fillMaxWidth()
                ) {
                    Text(
                        "SIINIGA",
                        color = Color(0xFF2E3036),
                        fontSize = 12.sp,
                        modifier = Modifier
                            .padding(end = 150.dp,)
                    )
                    Text(
                        "Campaña",
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
                ) {
                    Column(
                        modifier = Modifier
                            .border(
                                width = 1.dp,
                                color = Color.Black,
                                shape = RoundedCornerShape(5.dp)
                            )
                            .clip(shape = RoundedCornerShape(5.dp))
                            .width(163.dp)
                    ) {
                        TextField(
                            value = "",
                            onValueChange = {},
                            placeholder = { Text("E.j: Blanco", fontSize = 15.sp) },
                            modifier = Modifier
                                .height(50.dp),
                            textStyle = TextStyle(fontSize = 15.sp)
                        )

                    }
                    Column(
                        modifier = Modifier
                            .border(
                                width = 1.dp,
                                color = Color.Black,
                                shape = RoundedCornerShape(5.dp)
                            )
                            .clip(shape = RoundedCornerShape(5.dp))
                            .width(162.dp)
                    ) {
                        TextField(
                            value = "",
                            onValueChange = {},
                            placeholder = { Text("E.j: ") },
                            modifier = Modifier.fillMaxWidth()
                                .height(50.dp)
                        )
                    }
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



fun showDatePicker(context: Context, onDateSelected: (String) -> Unit) {
    val calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)
    val month = calendar.get(Calendar.MONTH)
    val day = calendar.get(Calendar.DAY_OF_MONTH)

    DatePickerDialog(
        context,
        { _, selectedYear, selectedMonth, selectedDay ->
            val formattedDate = "$selectedDay/${selectedMonth + 1}/$selectedYear"
            onDateSelected(formattedDate)
        },
        year,
        month,
        day
    ).show()
}


@Preview(showSystemUi = true)
        @Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
        @Preview(widthDp = 412, heightDp = 917)
        @Composable
        private fun AltaBecerrosPreview(modifier: Modifier = Modifier) {
            AltaBecerros(Modifier)
        }
