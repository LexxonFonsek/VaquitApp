package arturo.fonseca.vaquitapp.AltaToros.ui

import android.content.res.Configuration
import android.widget.DatePicker
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import arturo.fonseca.vaquitapp.R
import java.util.Calendar

@Composable
fun AltaVacasScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 412.dp)
            .requiredHeight(height = 917.dp)
            .background(color = Color.White)
    ) {
        Cornamenta(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 600.dp
                ))
//        Image(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 297.dp,
//                    y = 508.dp))
//        Image(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 301.dp,
//                    y = 107.dp))
        Nombre(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 170.dp
                ))
        Procedencia(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 670.dp
                ))
        SIINIIGA(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y =460.dp
                ))
        Color(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 240.dp
                ))
        Cruza(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 212.dp,
                    y = 310.dp
                ))
        Campaña(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 530.dp
                ))
        Text(
            text = "Foto",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 326.dp,
                    y = 215.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Hierro",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 320.dp,
                    y = 290.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "¿Tiene SIINIGA?",
            color = Color.Black,
            lineHeight = 2.em,
            style = TextStyle(
                fontSize = 10.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 301.dp,
                    y = 430.dp
                )
                .requiredWidth(width = 82.dp)
                .requiredHeight(height = 23.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
//        Image(
//            painter = painterResource(id = R.drawable.vaquitappv1png3),
//            contentDescription = "VaquitAppV1png 3",
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 331.dp,
//                    y = 38.dp)
//                .requiredSize(size = 50.dp))
        Text(
            text = "Alta Toros",
            color = Color.Black,
            textAlign = TextAlign.Center,
            lineHeight = 5.em,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 148.dp,
                    y = 49.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        OutlinedButton(
            onClick = { },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff2c2c2c)),
            contentPadding = PaddingValues(all = 12.dp),
            border = BorderStroke(1.dp, Color(0xff2c2c2c)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 32.dp,
                    y = 806.dp
                )
                .requiredWidth(width = 150.dp)
                .requiredHeight(height = 40.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .requiredWidth(width = 150.dp)
                    .requiredHeight(height = 40.dp)
            ) {
                Text(
                    text = "Atrás",
                    color = Color(0xfff5f5f5),
                    lineHeight = 6.25.em,
                    style = TextStyle(
                        fontSize = 16.sp))
            }
        }
        OutlinedButton(
            onClick = { },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff2c2c2c)),
            contentPadding = PaddingValues(all = 12.dp),
            border = BorderStroke(1.dp, Color(0xff2c2c2c)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 230.dp,
                    y = 806.dp
                )
                .requiredWidth(width = 150.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .requiredWidth(width = 150.dp)
            ) {
                Text(
                    text = "Siguiente",
                    color = Color(0xfff5f5f5),
                    lineHeight = 6.25.em,
                    style = TextStyle(
                        fontSize = 16.sp))
            }
        }
//        Icon(
//            painter = painterResource(id = R.drawable.menu),
//            contentDescription = "menu",
//            tint = Color(0xff1d1b20),
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 32.dp,
//                    y = 54.dp))
        Fecha(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 380.dp
                ))
        Raza(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 310.dp
                ))
        OutlinedButton(
            onClick = { },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
            contentPadding = PaddingValues(all = 12.dp),
            border = BorderStroke(1.dp, Color(0xff2c2c2c)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 294.dp,
                    y = 170.dp
                )
                .requiredWidth(width = 81.dp)
                .requiredHeight(height = 40.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .requiredWidth(width = 81.dp)
                    .requiredHeight(height = 40.dp)
            ) {
                Text(
                    text = "Añadir",
                    color = Color(0xfff5f5f5),
                    lineHeight = 6.25.em,
                    style = TextStyle(
                        fontSize = 16.sp))
            }
        }

        OutlinedButton(
            onClick = { },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
            contentPadding = PaddingValues(all = 12.dp),
            border = BorderStroke(1.dp, Color(0xff2c2c2c)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 294.dp,
                    y = 240.dp
                )
                .requiredWidth(width = 81.dp)
                .requiredHeight(height = 40.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .requiredWidth(width = 81.dp)
                    .requiredHeight(height = 40.dp)
            ) {
                Text(
                    text = "Añadir",
                    color = Color(0xfff5f5f5),
                    lineHeight = 6.25.em,
                    style = TextStyle(
                        fontSize = 16.sp))
                }
        }
        Image(
            painter = painterResource(id = R.drawable.logo), //Imagen del logo Vaquitapp
            contentDescription = "LogoVaquitApp",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 290.dp,
                    y = 90.dp
                )
                .requiredSize(size = 50.dp)
            )

    }
}


@Composable
fun Nombre(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width = 250.dp)
            .requiredHeight(height = 56.dp)
            .clip(shape = RoundedCornerShape(5.dp))
    ) {
        var text by remember { mutableStateOf("") }

        TextField(value = text, onValueChange = { text = it },
            label = { Text("Nombre") },
            placeholder = { Text("Ejemplo: Juan perez ") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Para que solo acepte texto desde teclado
            singleLine = true,
            maxLines = 1, //Para que solo acepte una linea de texto
            colors = TextFieldDefaults.colors(Color(0xFF000000),//cOLOR DEL TEXTO
            focusedIndicatorColor = Color.Transparent, //cOLOR DEL INDICE)
                unfocusedIndicatorColor = Color.Transparent, //cOLOR DEL INDICE
                 )
            )
    }
}
@Composable
fun Color(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width = 250.dp)
            .requiredHeight(height = 56.dp)
            .clip(shape = RoundedCornerShape(5.dp))
    ) {
        var text by remember { mutableStateOf("") }

        TextField(value = text, onValueChange = { text = it },
            label = { Text("Color") },
            placeholder = { Text("Ejemplo: Blanco ") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Para que solo acepte texto desde teclado
            singleLine = true,
            maxLines = 1, //Para que solo acepte una linea de texto
            colors = TextFieldDefaults.colors(Color(0xFF000000),//cOLOR DEL TEXTO
                focusedIndicatorColor = Color.Transparent, //cOLOR DEL INDICE)
                unfocusedIndicatorColor = Color.Transparent, //cOLOR DEL INDICE
            )
        )
    }
}
@Composable
fun Raza(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width = 165.dp)
            .requiredHeight(height = 56.dp)
            .clip(shape = RoundedCornerShape(5.dp))
    ) {
        var text by remember { mutableStateOf("") }

        TextField(value = text, onValueChange = { text = it },
            label = { Text("Raza") },
            placeholder = { Text("Ejemplo:Simental ") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Para que solo acepte texto desde teclado
            singleLine = true,
            maxLines = 1, //Para que solo acepte una linea de texto
            colors = TextFieldDefaults.colors(Color(0xFF000000),//cOLOR DEL TEXTO
                focusedIndicatorColor = Color.Transparent, //cOLOR DEL INDICE)
                unfocusedIndicatorColor = Color.Transparent, //cOLOR DEL INDICE
            )
        )
    }
}
@Composable
fun Cruza(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width = 165.dp)
            .requiredHeight(height = 56.dp)
            .clip(shape = RoundedCornerShape(5.dp))
    ) {
        var text by remember { mutableStateOf("") }

        TextField(value = text, onValueChange = { text = it },
            label = { Text("Cruza") },
            placeholder = { Text("Ejemplo:Aberdeen Angus ") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Para que solo acepte texto desde teclado
            singleLine = true,
            maxLines = 1, //Para que solo acepte una linea de texto
            colors = TextFieldDefaults.colors(Color(0xFF000000),//cOLOR DEL TEXTO
                focusedIndicatorColor = Color.Transparent, //cOLOR DEL INDICE)
                unfocusedIndicatorColor = Color.Transparent, //cOLOR DEL INDICE
            )
        )
    }
}
@Composable
fun Fecha(modifier: Modifier) {
    val year: Int
    val month: Int
    val day: Int

    val calendar = Calendar.getInstance()
    year = calendar.get(Calendar.YEAR)
    month = calendar.get(Calendar.MONTH)
    day = calendar.get(Calendar.DAY_OF_MONTH)

    val context = LocalContext.current
    val date = remember { mutableStateOf("") }
    val datePickerDialog = android.app.DatePickerDialog(
        context,
        { _: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
            date.value = "$dayOfMonth/$month/$year"
        }, year, month, day

    )
    Column(
        modifier = modifier
            .requiredWidth(width = 348.dp)
            .requiredHeight(height = 70.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(text = "Fecha de nacimiento: ${date.value}")
        Spacer(modifier = Modifier.size(5.dp))
        Button(onClick = { datePickerDialog.show()
        },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
            shape = RoundedCornerShape(10.dp),
        ) {
            Text(text = "Seleccionar fecha")
            }
        }
}
@Composable
fun SIINIIGA(modifier: Modifier) {
    val siNo = remember { mutableStateOf(true) }
    var text by remember {
        mutableStateOf("")
        }
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width =348.dp)
            .requiredHeight(height = 56.dp)
            .clip(shape = RoundedCornerShape(5.dp))
    ) {
       Row (modifier = Modifier.fillMaxWidth(),
           horizontalArrangement = Arrangement.SpaceBetween ){


        TextField(value = text, onValueChange = { text = it },
            label = { Text("SIINIGA") },
            placeholder = { Text("Ejemplo: ANHJ123IK78 ") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Para que solo acepte texto desde teclado
            singleLine = true,
            maxLines = 1, //Para que solo acepte una linea de texto
            colors = TextFieldDefaults.colors(Color(0xFF000000),//cOLOR DEL TEXTO
                focusedIndicatorColor = Color.Transparent, //cOLOR DEL INDICE)
                unfocusedIndicatorColor = Color.Transparent, //cOLOR DEL INDICE
            )
        )
        Switch(
            checked = siNo.value,
            onCheckedChange = { siNo.value = it },
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color(0xFFFFFFFF),
                checkedTrackColor = Color(0xFF000000),
                uncheckedThumbColor = Color(0xFFFFFFFF),
                uncheckedTrackColor = Color(0xFF747474)
            )
        )
}   }
}
@Composable
fun Campaña(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width = 348.dp)
            .requiredHeight(height = 56.dp)
            .clip(shape = RoundedCornerShape(5.dp))
    ) {
        var text by remember { mutableStateOf("") }

        TextField(value = text, onValueChange = { text = it },
            label = { Text("Campaña") },
            placeholder = { Text("Ejemplo:  ") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Para que solo acepte texto desde teclado
            singleLine = true,
            maxLines = 1, //Para que solo acepte una linea de texto
            colors = TextFieldDefaults.colors(Color(0xFF000000),//cOLOR DEL TEXTO
                focusedIndicatorColor = Color.Transparent, //cOLOR DEL INDICE)
                unfocusedIndicatorColor = Color.Transparent, //cOLOR DEL INDICE
            )
        )
    }
}
@Composable
fun Cornamenta(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width = 348.dp)
            .requiredHeight(height = 56.dp)
            .clip(shape = RoundedCornerShape(5.dp))
    ) {
        var text by remember { mutableStateOf("") }

        TextField(value = text, onValueChange = { text = it },
            label = { Text("Cornamenta") },
            placeholder = { Text("Ejemplo:") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Para que solo acepte texto desde teclado
            singleLine = true,
            maxLines = 1, //Para que solo acepte una linea de texto
            colors = TextFieldDefaults.colors(Color(0xFF000000),//cOLOR DEL TEXTO
                focusedIndicatorColor = Color.Transparent, //cOLOR DEL INDICE)
                unfocusedIndicatorColor = Color.Transparent, //cOLOR DEL INDICE
            )
        )
    }
}
@Composable
fun Procedencia(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width = 348.dp)
            .requiredHeight(height = 56.dp)
            .clip(shape = RoundedCornerShape(5.dp))
    ) {
        var text by remember { mutableStateOf("") }

        TextField(value = text, onValueChange = { text = it },
            label = { Text("Procedencia") },
            placeholder = { Text("Ejemplo: ") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Para que solo acepte texto desde teclado
            singleLine = true,
            maxLines = 1, //Para que solo acepte una linea de texto
            colors = TextFieldDefaults.colors(Color(0xFF000000),//cOLOR DEL TEXTO
                focusedIndicatorColor = Color.Transparent, //cOLOR DEL INDICE)
                unfocusedIndicatorColor = Color.Transparent, //cOLOR DEL INDICE
            )
        )
    }
}



@Composable
fun StateEmpty(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width = 165.dp)
            .requiredHeight(height = 56.dp)
            .clip(shape = RoundedCornerShape(5.dp))
    ) {
        Text(
            text = "Raza",
            color = Color(0xff2f3036),
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxWidth())
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(height = 48.dp)
                .clip(shape = RoundedCornerShape(5.dp))
                .border(
                    border = BorderStroke(1.dp, Color(0xffc5c6cc)),
                    shape = RoundedCornerShape(5.dp)
                )
                .padding(
                    horizontal = 16.dp,
                    vertical = 12.dp
                )
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(1.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Seleccinonar raza",
                        color = Color(0xff8f9098),
                        lineHeight = 1.43.em,
                        style = TextStyle(
                            fontSize = 14.sp),
                        modifier = Modifier
                            .wrapContentHeight(align = Alignment.CenterVertically))
                }
            }
        }
    }
}

//@Composable
//fun Image(modifier: Modifier = Modifier) {
//    Column(
//        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = modifier
//            .requiredWidth(width = 80.dp)
//            .requiredHeight(height = 125.dp)
//            .clip(shape = RoundedCornerShape(10.dp))
//            .background(color = Color(0xffeaf2ff))
//            .padding(all = 40.dp)
//    ) {
//        Image()
//    }
//}
//
//@Composable
//fun Image(modifier: Modifier = Modifier) {
//    Box(
//        modifier = modifier
//            .requiredWidth(width = 32.dp)
//            .requiredHeight(height = 32.dp)
//    ) {
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(color = Color(0xffb4dbff)))
//    }
//}


//                        Image(
//                            painter = painterResource(id = R.drawable.icon),
//                            contentDescription = "Icon",
//                            colorFilter = ColorFilter.tint(Color.Black),
//                            modifier = Modifier
//                                .align(alignment = Alignment.Center)
//                                .offset(x = 0.dp,
//                                    y = 0.dp)
//                                .requiredSize(size = 16.dp))
//                    }


@Composable
@Preview(showSystemUi = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
fun AltaVacasScreenPreview() {
    AltaVacasScreen(Modifier)
}
