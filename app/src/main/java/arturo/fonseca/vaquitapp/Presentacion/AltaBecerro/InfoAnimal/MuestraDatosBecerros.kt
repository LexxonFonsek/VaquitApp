package arturo.fonseca.vaquitapp.Presentacion.AltaBecerro.InfoAnimal


import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import arturo.fonseca.vaquitapp.R

@Composable
fun MuestraDatosBecerros(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 412.dp)
            .requiredHeight(height = 917.dp)
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "VaquitAppV1png 5",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 328.dp,
                    y = 100.dp
                )
                .requiredSize(size = 50.dp))


        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 35.dp,
                    y = 150.dp
                )
                .requiredWidth(width = 350.dp)
                .requiredHeight(height = 600.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(color = Color(0xffd9d9d9).copy(alpha = 0.5f))
                .border(
                    border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(10.dp)
                ))
        Text(
            text = "Información del animal",
            color = Color.Black,
            lineHeight = 1.11.em,
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Black),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 107.dp,
                    y = 115.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Nombre:  Jose  ",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 98.dp,
                    y = 330.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Sexo: Hembra",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 98.dp,
                    y = 360.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Raza: Angus",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 98.dp,
                    y = 390.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Color: Blanca con manchas negras",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 98.dp,
                    y = 420.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Fecha Nacimiento: ",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 98.dp,
                    y = 450.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Madre: ",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 98.dp,
                    y = 480.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Padre:",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 98.dp,
                    y = 510.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Procedencia:",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 98.dp,
                    y = 540.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "SINIIGA:",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 98.dp,
                    y = 570.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Campaña:",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 98.dp,
                    y = 600.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Peso al nacer",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 98.dp,
                    y = 630.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Observaciones:",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 98.dp,
                    y = 660.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))

        Image(
            painter = painterResource(id = R.drawable.becerro),
            contentDescription = "image 20",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 103.dp,
                    y = 160.dp
                )
                .requiredWidth(width = 216.dp)
                .requiredHeight(height = 124.dp)
                .clip(shape = RoundedCornerShape(44.dp)))
        Image(
            painter = painterResource(id = R.drawable.becerro),
            contentDescription = "image 17",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 224.dp,
                    y = 292.dp
                )
                .requiredWidth(width = 120.dp)
                .requiredHeight(height = 99.dp)
                .clip(shape = RoundedCornerShape(130.dp)))

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
                .requiredWidth(width = 155.dp)
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
    }
}
@Preview(showSystemUi = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun MuestraDatosBecerrosPreview() {
    MuestraDatosBecerros()
}
