package arturo.fonseca.vaquitapp.Presentacion.AltaBecerro

import android.app.DatePickerDialog
import android.content.Context
import android.content.res.Configuration
import android.util.Log
import androidx.compose.runtime.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.ui.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.unit.*
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import arturo.fonseca.vaquitapp.Presentacion.Modelo.Becerros
import arturo.fonseca.vaquitapp.R
import arturo.fonseca.vaquitapp.navigation.appScreens
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.util.Calendar


@Composable
fun AltaBecerros(db: FirebaseFirestore, navController: NavController) {
    var nombre by remember { mutableStateOf("") }
    var sexo by remember { mutableStateOf("") }
    val nacimiento by remember { mutableStateOf("") }
    var peso by remember { mutableStateOf("") }
    var madre by remember { mutableStateOf("") }
    var padre by remember { mutableStateOf("") }
    var embrion by remember { mutableStateOf("") }
    var procedencia by remember { mutableStateOf("") }
    var siniiga by remember { mutableStateOf("") }
    var campania by remember { mutableStateOf("") }
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
                        OutlinedTextField(
                            value = nombre,
                            onValueChange = {nombre = it},
                            label = { Text("E.j: Juan Perez") },
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
                        OutlinedTextField(
                            value = sexo,
                            onValueChange = {sexo = it},
                            label = { Text("E.j: Blanco") },
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
            var datePickerDialog = DatePickerDialog(
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

                ) {
                    Text(
                        text = if (selectedDate.isEmpty()) "Seleccionar fecha" else selectedDate,
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
                OutlinedTextField(
                    value = peso,
                    onValueChange = {peso = it},
                    label = { Text("E.j: 10kg") },
                    modifier = Modifier
                        .fillMaxWidth()
                )

            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 4.dp,)
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
                    OutlinedTextField(
                        value = madre,
                        onValueChange = {madre = it},
                        label = { Text("E.j: Madre") },
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
                    OutlinedTextField(
                        value = padre,
                        onValueChange = {padre = it},
                        label = { Text("E.j: Padre") },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 3.dp,)
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
                    .padding(bottom = 10.dp,)
                    .border(
                        width = 1.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(5.dp)
                    )
                    .clip(shape = RoundedCornerShape(5.dp))
                    .fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = embrion,
                    onValueChange = {embrion = it},
                    label = { Text("E.j: Rancho La Loma, Guachinango,Jal") },
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
                OutlinedTextField(
                    value = procedencia,
                    onValueChange = {procedencia = it},
                    label = { Text("Ej.: Rancho “La Loma”, Guachinango") },
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 4.dp,)
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
                    OutlinedTextField(
                        value = siniiga,
                        onValueChange = {siniiga = it},
                        label = { Text("E.j: Blanco", fontSize = 15.sp) },
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
                    OutlinedTextField(
                        value = campania,
                        onValueChange = {campania = it},
                        label = { Text("E.j: ") },
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
                    onClick = {navController.navigate(appScreens.MenuSecundarioScreen.route)},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black, // Fondo negro
                        contentColor = Color.White    // Texto blanco
                    ),
                    shape = RoundedCornerShape(16.dp), // Bordes redondeados
                    modifier = Modifier
                        .padding(8.dp) // Espaciado opcional
                        .width(150.dp)
                ) {
                    Text(text = "Atrás")
                }
                Button(
                    onClick = {
                        saveBecerro(db, Becerros(nombre, sexo, nacimiento, peso, madre, padre, embrion, procedencia, siniiga, campania))

                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black, // Fondo negro
                        contentColor = Color.White    // Texto blanco
                    ),
                    shape = RoundedCornerShape(16.dp), // Bordes redondeados
                    modifier = Modifier
                        .padding(8.dp) // Espaciado opcional
                        .width(150.dp)
                ) {
                    Text(text = "Enviar")
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

//
fun saveBecerro(db: FirebaseFirestore, becerro: Becerros){
    db.collection("becerros")
        .add(becerro)
        .addOnSuccessListener { documentReference ->
            Log.d("Vaquitapp", "SUCCESS added with ID: ${documentReference.id}")
        }
        .addOnFailureListener {
            Log.w("Vaquitapp", "Error adding document", it)
        }
        .addOnCompleteListener {
            Log.d("Vaquitapp", "Complete")
        }

}
//@Preview(showSystemUi = true)
//@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
//@Preview(widthDp = 412, heightDp = 917)
//@Composable
//private fun AltaBecerrosPreview() {
//    AltaBecerros( navController = NavController(LocalContext.current))
//}