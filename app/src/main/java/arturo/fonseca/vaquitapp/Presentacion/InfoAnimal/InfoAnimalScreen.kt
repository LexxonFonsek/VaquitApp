package arturo.fonseca.vaquitapp.Presentacion.InfoAnimal

import android.content.res.Configuration
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import arturo.fonseca.vaquitapp.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete

@Composable
fun InfoAnimalScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 412.dp)
            .requiredHeight(height = 917.dp)
            .background(color = Color.White)
    ) {
        //Logo Vaquitapp
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 320.dp,
                    y = 70.dp)
                .requiredSize(size = 50.dp))
        Text(
            text = "Información del animal",
            color = Color.Black,
            lineHeight = 1.11.em,
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Black
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 98.dp,
                    y = 90.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        LayoutMediaText(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 25.dp,
                    y = 111.dp))
        Text(
            text = "Hierro",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 14.sp
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 300.dp,
                    y = 360.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))

        Text(
            text = "Imagen",
            color = Color.Black,
            lineHeight = 1.43.em,
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 14.sp
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 100.dp,
                    y = 360.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
    }
}

@Composable
fun LayoutMediaText(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .offset(
                y = 30.dp
            )
            .background(color = Color(0xFFE5DCD9))
            .clip(shape = RoundedCornerShape(12.dp))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(height = 72.dp)
                .padding(start = 16.dp,
                    end = 4.dp,
                    top = 12.dp,
                    bottom = 12.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically
            ) {
                StyleMonogram()
                Column(
                    verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                    modifier = Modifier
                        .requiredWidth(width = 236.dp)
                ) {
                Text(
                    text = "Semental",
                    color = Color(0xff1d1b20),
                    lineHeight = 1.5.em,
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        letterSpacing = 0.15.sp
                    ),
                    modifier = Modifier
                        .fillMaxWidth())
            }
        }
        Tab(
            selected = false,
            onClick = {  },
            modifier = Modifier
                .requiredSize(size = 48.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .requiredSize(size = 48.dp)
            ) {
                Spacer(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(100.dp)))
                //Botón eliminar
                IconButton (
                    onClick = { },
                    modifier = Modifier
                        .fillMaxSize(),
                ){
                    Icon(imageVector = Icons.Filled.Delete, contentDescription = "Eliminar")
                }
            }
        }
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .requiredHeight(height = 188.dp)
    ) {
            Image( //Imagen Semental
                painter = painterResource(id = R.drawable.becerro),
                contentDescription = "Media",
                modifier = Modifier
                    .fillMaxSize()
                    .requiredSize(size = 188.dp)
                    .offset(
                        x = -85.dp,
                    ))

        Image( //Imagen Hierro
            painter = painterResource(id = R.drawable.becerro),
            contentDescription = "Toro",
            modifier = Modifier
                .requiredSize(size = 150.dp)
                .offset(
                    x = 200.dp
                )
        )

        }
        //Contenedor de la descripción
        Column(
            verticalArrangement = Arrangement.spacedBy(32.dp, Alignment.Top),
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 16.dp)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                Text(
                    text = "Nombre: ",
                    color = Color(0xff1d1b20),
                    lineHeight = 1.5.em,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .requiredWidth(width = 328.dp))

            }
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(
                        color = Color(0xff49454f),
                        fontSize = 12.sp)
                    ) {append("Raza:")}
                    withStyle(style = SpanStyle(
                        color = Color(0xff49454f),
                        fontSize = 14.sp)) {append(" Angus.\n\n")}
                    withStyle(style = SpanStyle(
                        color = Color(0xff49454f),
                        fontSize = 12.sp)) {append("Color:")}
                    withStyle(style = SpanStyle(
                        color = Color(0xff49454f),
                        fontSize = 14.sp)) {append(" Blanca con manchas negras.\n\n")}
                    withStyle(style = SpanStyle(
                        color = Color(0xff49454f),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium)) {append("Fecha de nacimiento:")}
                    withStyle(style = SpanStyle(
                        color = Color(0xff49454f),
                        fontSize = 14.sp)) {append(" 06/11/2019.\n\n")}
                    withStyle(style = SpanStyle(
                        color = Color(0xff49454f),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium)) {append("Núm. SINIIGA:")}
                    withStyle(style = SpanStyle(
                        color = Color(0xff49454f),
                        fontSize = 14.sp)) {append(" 202A\n\n")}
                    withStyle(style = SpanStyle(
                        color = Color(0xff49454f),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium)) {append("Observaciones:\n\nCampaña:\n")}},
                modifier = Modifier
                    .fillMaxWidth())
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.End),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                //Botón editar
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(100.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xff000000)),
                    contentPadding = PaddingValues(horizontal = 24.dp, vertical = 10.dp),
                    modifier = Modifier
                        .requiredHeight(height = 40.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .requiredHeight(height = 40.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .requiredWidth(100.dp)
                                .requiredHeight(56.dp)
                        ) {
                            Text(
                                text = "Atrás",
                                color = Color.White,
                                textAlign = TextAlign.Center,
                                lineHeight = 1.43.em,
                                style = MaterialTheme.typography.labelLarge,
                                modifier = Modifier
                                    .wrapContentHeight(align = Alignment.CenterVertically))
                        }
                    }
                }
                //Botón de regresar/atrás
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(100.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xff000000)),
                    contentPadding = PaddingValues(horizontal = 24.dp, vertical = 10.dp),
                    modifier = Modifier
                        .requiredHeight(height = 40.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .requiredHeight(height = 40.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .requiredWidth(100.dp)
                                .requiredHeight(56.dp)
                        ) {
                            Text(
                                text = "Editar",
                                color = Color.White,
                                textAlign = TextAlign.Center,
                                lineHeight = 1.43.em,
                                style = MaterialTheme.typography.labelLarge,
                                modifier = Modifier
                                    .wrapContentHeight(align = Alignment.CenterVertically))
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun StyleMonogram(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredSize(size = 40.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = CircleShape)
                .background(color = Color(0xFFD7D7D7)))
        Image( //Icono semental
            painter = painterResource(id = R.drawable.toro),
            contentDescription = "icono_toro",
            modifier = Modifier
                .fillMaxSize()
        )
    }
}





@Preview(showSystemUi = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun CargaPreview() {
    InfoAnimalScreen(modifier = Modifier)
}