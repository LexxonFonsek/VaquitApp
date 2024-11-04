package arturo.fonseca.vaquitapp.ui.theme.AltaVacas.ui

import android.R
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Composable
fun AltaVacasScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 412.dp)
            .requiredHeight(height = 917.dp)
            .background(color = Color.White)
    ) {
        StateEmpty(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 608.dp
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
        TxtNombre(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 107.dp
                ))
        StateEmpty(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 693.dp
                ))
        StateEmpty(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 436.dp
                ))
        StateEmpty(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 180.dp
                ))
        StateEmpty(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 212.dp,
                    y = 264.dp
                ))
        StateEmpty(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 521.dp
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
                    y = 231.dp
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
                    y = 588.dp
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
        SelectedTrueStateEnabledIconTrue(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 304.dp,
                    y = 462.dp
                ))
//        Image(
//            painter = painterResource(id = R.drawable.vaquitappv1png3),
//            contentDescription = "VaquitAppV1png 3",
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 331.dp,
//                    y = 38.dp)
//                .requiredSize(size = 50.dp))
        Text(
            text = "Alta Vacas",
            color = Color.Black,
            textAlign = TextAlign.Center,
            lineHeight = 1.em,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 146.dp,
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
        StateEmpty(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 344.dp
                ))
        StateEmpty(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 263.dp
                ))
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
        TextField(value = "", onValueChange = {},
            //modifier = modifier.fillMaxSize(),
            placeholder = {Text("Nombre")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //Tipo de edit text
            singleLine = true, //No se amplia al darle enter en eñl e teclado
            maxLines = 1,
            colors = TextFieldDefaults.colors(Color(0xFFFFFFFF),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
            )
        )

//        Text(
//            text = "Raza",
//            color = Color(0xff2f3036),
//            style = TextStyle(
//                fontSize = 12.sp,
//                fontWeight = FontWeight.Bold),
//            modifier = Modifier
//                .fillMaxWidth())
//        Row(
//            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier
//                .fillMaxWidth()
//                .requiredHeight(height = 35.dp)
//                .clip(shape = RoundedCornerShape(5.dp))
//                .border(border = BorderStroke(1.dp, Color(0xffc5c6cc)),
//                    shape = RoundedCornerShape(5.dp))
//                .padding(horizontal = 16.dp,
//                    vertical = 10.dp)
//        ) {
//            Row(
//                horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.Start),
//                verticalAlignment = Alignment.CenterVertically,
//                modifier = Modifier
//                    .fillMaxWidth()
//            ) {
//                Row(
//                    horizontalArrangement = Arrangement.spacedBy(1.dp, Alignment.Start),
//                    verticalAlignment = Alignment.CenterVertically,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                ) {
//                    Text(
//                        text = "Seleccinonar raza",
//                        color = Color(0xff8f9098),
//                        lineHeight = 1.43.em,
//                        style = TextStyle(
//                            fontSize = 14.sp),
//                        modifier = Modifier
//                            .wrapContentHeight(align = Alignment.CenterVertically))
//                }
//            }
//        }
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
@Composable
fun StateEmpty1(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width = 165.dp)
            .requiredHeight(height = 56.dp)
            .clip(shape = RoundedCornerShape(5.dp))
    ) {
        Text(
            text = "Prueba",
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

@Composable
fun SelectedTrueStateEnabledIconTrue(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .requiredWidth(width = 66.dp)
            .requiredHeight(height = 30.dp)
            .clip(shape = RoundedCornerShape(100.dp))
            .background(color = Color.Black)
            .padding(
                horizontal = 4.dp,
                vertical = 2.dp
            )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(alignment = Alignment.CenterEnd)
                    .offset(
                        x = 12.dp,
                        y = 0.dp
                    )
                    .padding(all = 4.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(100.dp))
                        .padding(all = 8.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 24.dp)
                            .clip(shape = RoundedCornerShape(24.dp))
                            .background(color = Color.White)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .padding(all = 11.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .requiredSize(size = 2.dp)
                                    .clip(shape = RoundedCornerShape(23.dp)))
                        }
//                        Image(
//                            painter = painterResource(id = R.drawable.icon),
//                            contentDescription = "Icon",
//                            colorFilter = ColorFilter.tint(Color.Black),
//                            modifier = Modifier
//                                .align(alignment = Alignment.Center)
//                                .offset(x = 0.dp,
//                                    y = 0.dp)
//                                .requiredSize(size = 16.dp))
                    }
                }
            }
        }
    }
}

@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun AltaVacasScreenPreview() {
    AltaVacasScreen(Modifier)
}