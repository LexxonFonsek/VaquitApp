

@file:Suppress("NAME_SHADOWING")
package arturo.fonseca.vaquitapp.ActualizarAnimal.ui

import android.content.res.Configuration
import android.icu.util.Calendar
import android.widget.DatePicker
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import arturo.fonseca.vaquitapp.R

@Composable
fun ActualizarAnimalScreen(navController: NavController, modifier: Modifier = Modifier) {
    Box(

        modifier = modifier
            .fillMaxSize()
//            .requiredWidth(width = 412.dp)
//            .requiredHeight(height = 917.dp)
            .background(color = Color.White)

    ) {
        Cornamenta(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 20.dp,
                    y = 560.dp
                ))
        TxtNombre(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 20.dp,
                    y = 120.dp
                )
        )
        ColorVac(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 20.dp,
                    y = 191.dp
                )
        )
        Raza(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 20.dp,
                    y = 262.dp
                ))
        Cruza(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 205.dp,
                    y = 262.dp
                )
        )
        Procedencia(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 20.dp,
                    y = 631.dp
                ))
        Siniiga(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 20.dp,
                    y = 418.dp
                ))
        ColorVac(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 20.dp,
                    y = 190.dp
                ))

        Campania(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
        )
        Text(
            text = "Foto de la vaca",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = TextStyle(
                fontSize = 12.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 294.dp,
                    y = 120.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Foto del hierro",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = TextStyle(
                fontSize = 12.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 294.dp,
                    y = 190.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Actualizar Informacion",
            color = Color.Black,
            textAlign = TextAlign.Center,
            lineHeight = 4.em,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 50.dp,
                    y = 30.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        OutlinedButton(
            onClick = {navController.popBackStack() },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff2c2c2c)),
            contentPadding = PaddingValues(all = 12.dp),
            border = BorderStroke(1.dp, Color(0xff2c2c2c)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 32.dp,
                    y = 737.dp
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
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff2c2c2c)),
            contentPadding = PaddingValues(all = 12.dp),
            border = BorderStroke(1.dp, Color(0xff2c2c2c)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 200.dp,
                    y = 737.dp
                )
                .requiredWidth(width = 150.dp)
                .requiredHeight(height = 40.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .requiredWidth(width = 150.dp)
            ) {
                Text(
                    text = "Guardar",
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
                    y = 136.dp
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
                    text = "Editar",
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
                    y = 207.dp
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
                    text = "Editar",
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
                    x = 320.dp,
                    y = 50.dp
                )
                .requiredSize(size = 50.dp)
        )
        FechaNac(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 20.dp,
                    y = 333.dp
                    //y = 344.dp
                )
        )

    }
}

@Composable
fun FechaNac(modifier: Modifier) {
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
fun Siniiga(modifier: Modifier) {
    val siNo = remember { mutableStateOf(true) }
    var text by remember {
        mutableStateOf("")
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width = 348.dp)
            .requiredHeight(height = 56.dp)
            .clip(shape = RoundedCornerShape(5.dp))
    ) {
        Row( // Use a Row for horizontal arrangement
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween // Space elements evenly
        ) {
            TextField(
                value = text, // Remember text state
                onValueChange = { text = it },
                label = { Text("Número SINIIGA") },
                placeholder = { Text("Agrega número de 10 digitos.") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                singleLine = true,
                maxLines = 1,
                enabled = siNo.value, // Enable/disable based on switch state
                colors = TextFieldDefaults.colors(
                    Color(0xFF000000),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
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
        }
    }
}

@Composable
fun Cruza(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width = 170.dp)
            .requiredHeight(height = 56.dp)
            .clip(shape = RoundedCornerShape(5.dp))
            .fillMaxSize()
    )
    {
        var text by remember {
            mutableStateOf("")
        }
        TextField(
            value = text, onValueChange = { text = it },
            label = { Text("Cruza") },
            //modifier = modifier.fillMaxSize(),
            placeholder = { Text("Ejemplo: Simmental") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Tipo de edit text
            singleLine = true, //No se amplia al darle enter en eñl e teclado
            maxLines = 1,
            colors = TextFieldDefaults.colors(
                Color(0xFF000000),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
    }
}

@Composable
fun ColorVac(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width = 256.dp)
            .requiredHeight(height = 56.dp)
            .clip(shape = RoundedCornerShape(5.dp))
            .fillMaxSize()
    )
    {
        var text by remember {
            mutableStateOf("")
        }
        TextField(
            value = text, onValueChange = { text = it},
            label = {Text("Color")},
            //modifier = modifier.fillMaxSize(),
            placeholder = { Text("Ejemplo: Pinta") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Tipo de edit text
            singleLine = true, //No se amplia al darle enter en eñl e teclado
            maxLines = 1,
            colors = TextFieldDefaults.colors(
                Color(0xFF000000),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
    }
}

@Composable
fun Campania(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
    )
    {
        var text by remember {
            mutableStateOf("")
        }
        TextField(
            value = text, onValueChange = {text = it},
            label = {Text("Número de Campaña")},
            modifier = modifier
                .offset(
                    x = 20.dp,
                    y = 489.dp
                )
                .requiredWidth(width = 200.dp)
                .requiredHeight(height = 56.dp)
                .clip(shape = RoundedCornerShape(5.dp))

                .fillMaxSize(),
            placeholder = { Text("") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Tipo de edit text
            singleLine = true, //No se amplia al darle enter en eñl e teclado
            maxLines = 1,
            colors = TextFieldDefaults.colors(
                Color(0xFF000000),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
    }
    Column (
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top)
    ) {
        var text by remember {
            mutableStateOf("")
        }
        TextField(
            value = text, onValueChange = {text = it},
            label = {Text("Peso en KG")},
            modifier = modifier
                .offset(
                    x = 240.dp,
                    y = 489.dp
                )
                .requiredWidth(width = 127.dp)
                .requiredHeight(height = 56.dp)
                .clip(shape = RoundedCornerShape(5.dp))
            ,
            placeholder = { Text("") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Tipo de edit text
            singleLine = true, //No se amplia al darle enter en eñl e teclado
            maxLines = 1,
            colors = TextFieldDefaults.colors(
                Color(0xFF000000),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
    }
}

@Composable
fun Procedencia(modifier: Modifier) {
    Column (
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top)
    )
    {

        var text by remember {
            mutableStateOf("")
        }
        TextField(
            value = text, onValueChange = {text = it},
            label = {Text("Lugar de procedencia")},
            modifier = modifier
                .requiredWidth(width = 348.dp)
                .requiredHeight(height = 56.dp)
                .clip(shape = RoundedCornerShape(5.dp))
                .fillMaxSize(),
            placeholder = { Text("Ej: Rancho La Loma") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Tipo de edit text
            singleLine = true, //No se amplia al darle enter en el teclado
            maxLines = 1,

            colors = TextFieldDefaults.colors(
                Color(0xFF000000),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,

                )
        )

    }
}

@Composable
fun Cornamenta(modifier: Modifier) {
    Column (verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),

        )
    {
        var text by remember {
            mutableStateOf("")
        }
        TextField(
            modifier = modifier
                .requiredWidth(width = 348.dp)
                .requiredHeight(height = 56.dp)
                .clip(shape = RoundedCornerShape(5.dp))
                .fillMaxSize(),
            value = text, onValueChange = {text = it},
            label = {Text("Cornamenta")},
            placeholder = { Text("") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Tipo de edit text
            singleLine = true, //No se amplia al darle enter en el teclado
            maxLines = 1,

            colors = TextFieldDefaults.colors(
                Color(0xFF000000),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,

                ),
        )

    }
}

@Composable
fun TxtNombre(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width = 256.dp)
            .requiredHeight(height = 56.dp)
            .clip(shape = RoundedCornerShape(5.dp))
            .fillMaxSize()
    )
    {
        var text by remember {
            mutableStateOf("")
        }
        TextField(value = text, onValueChange = {text = it},
            label = {Text("Nombre")},
            //modifier = modifier.fillMaxSize(),
            placeholder = {Text("Ejemplo: Lola")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Tipo de edit text
            singleLine = true, //No se amplia al darle enter en eñl e teclado
            maxLines = 1,
            colors = TextFieldDefaults.colors(Color(0xFF000000),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )



//
    }
}

@Composable
fun Raza(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width = 165.dp)
            .requiredHeight(height = 56.dp)
            .clip(shape = RoundedCornerShape(5.dp))
            .fillMaxSize()
    )
    {
        var text by remember {
            mutableStateOf("")
        }
        TextField(
            value = text, onValueChange = { text = it },
            label = { Text("Raza") },
            //modifier = modifier.fillMaxSize(),
            placeholder = { Text("Ejemplo: Holstein") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Tipo de edit text
            singleLine = true, //No se amplia al darle enter en eñl e teclado
            maxLines = 1,
            colors = TextFieldDefaults.colors(
                Color(0xFF000000),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
    }
}

@Preview(showSystemUi = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun ActualizarAnimalScreenPreview() {
    ActualizarAnimalScreen(navController = NavController(LocalContext.current))

}