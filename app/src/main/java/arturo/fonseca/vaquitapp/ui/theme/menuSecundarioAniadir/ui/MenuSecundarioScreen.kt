package arturo.fonseca.vaquitapp.ui.theme.menuSecundarioAniadir.ui

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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import arturo.fonseca.vaquitapp.R
import arturo.fonseca.vaquitapp.navigation.appScreens

@Composable
fun MenuSecundarioScreen(navController: NavController,modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 412.dp)
            .requiredHeight(height = 917.dp)
//            .background(color = Color.White)
    ) {
        Botones(navController,modifier = modifier)
        Image(
            painter = painterResource(id = R.drawable.logo), //Imagen del logo Vaquitapp
            contentDescription = "LogoVaquitApp",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 130.dp,
                    y = 50.dp
                )
                .requiredSize(size = 150.dp)
        )
//        OutlinedButton(
//            onClick = {navController.navigate(route = appScreens.MenuPrincipalScreen) },
//            shape = RoundedCornerShape(8.dp),
//            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff2c2c2c)),
//            contentPadding = PaddingValues(all = 12.dp),
//            border = BorderStroke(1.dp, Color(0xff2c2c2c)),
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 131.dp,
//                    y = 800.dp
//                )
//                .requiredWidth(width = 150.dp)
//                .requiredHeight(height = 40.dp),)
 //       {
//            Row(
//                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
//                verticalAlignment = Alignment.CenterVertically,
//                modifier = Modifier
//                    .requiredWidth(width = 150.dp)
//                    .requiredHeight(height = 40.dp)
//            ) {
//                Text(
//                    text = "Atrás",
//                    color = Color(0xfff5f5f5),
//                    lineHeight = 6.25.em,
//                    style = TextStyle(
//                        fontSize = 16.sp)
//                )
//            }
//        }
        Text(
            text = "¿Qué tipo de animal deseas dar de alta?",
            color = Color.Black,
            lineHeight = 6.25.em,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 55.dp,
                    y = 225.dp
                ))
    }
}

@Composable
fun Botones(navController: NavController,modifier: Modifier) {
    Column {
        Spacer(modifier = Modifier.padding(16.dp))
        BtnVaca(modifier = modifier
            //.align(alignment = Alignment.TopStart)
            .offset(
                x = 30.dp,
                y = 250.dp
            )
        )
        BtnSemental(
            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 30.dp,
                    y = 300.dp
                )
        )
        BtnBecerro(
            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 30.dp,
                    y = 350.dp
                )
        )
        BtnAtras(
            navController = navController,
            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 131.dp,
                    y = 800.dp
                )
        )
    }
}

@Composable
fun BtnAtras(navController: NavController,modifier: Modifier) {
    Button(onClick = {navController.navigate(route = appScreens.MenuPrincipalScreen)},modifier = modifier
        .requiredWidth(width = 150.dp)
        .requiredHeight(height = 40.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
        border = BorderStroke(1.dp, Color(0xFF000000)),
        shape = RoundedCornerShape(30.dp)){
    }
}

@Composable
fun BtnSemental(modifier: Modifier) {
    Button(onClick = { }, modifier = modifier
        .requiredWidth(width = 352.dp)
        .requiredHeight(height = 120.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
        border = BorderStroke(1.dp, Color(0xFF000000)),
        shape = RoundedCornerShape(30.dp)
    ){
        Text(
            text = "Semental",
            color = Color(0xfff5f5f5),
            lineHeight = 4.em,
            style = MaterialTheme.typography.headlineSmall)
    }
}

@Composable
fun BtnVaca(modifier: Modifier) {
    Button(onClick = { }, modifier = modifier
        .requiredWidth(width = 352.dp)
        .requiredHeight(height = 120.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
        border = BorderStroke(1.dp, Color(0xff2c2c2c)),
        shape = RoundedCornerShape(30.dp)
    ){
        Text(
            text = "Vaca",
            color = Color(0xfff5f5f5),
            lineHeight = 4.em,
            style = MaterialTheme.typography.headlineSmall
        )

    }
}

@Composable
fun BtnBecerro(modifier: Modifier) {
    Button(onClick = { }, modifier = modifier
        .requiredWidth(width = 352.dp)
        .requiredHeight(height = 120.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
        border = BorderStroke(1.dp, Color(0xff2c2c2c)),
        shape = RoundedCornerShape(30.dp)
    ){
        Text(
            text = "Becerro/Becerra",
            color = Color(0xfff5f5f5),
            lineHeight = 4.em,
            style = MaterialTheme.typography.headlineSmall

        )
    }
}



//@Preview(widthDp = 412, heightDp = 917)
//@Composable
//private fun MenuSecundarioScreenPreview() {
//    MenuSecundarioScreen(NavController,Modifier)
//}