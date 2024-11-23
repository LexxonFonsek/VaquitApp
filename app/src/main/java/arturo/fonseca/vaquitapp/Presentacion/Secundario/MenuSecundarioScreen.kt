package arturo.fonseca.vaquitapp.Presentacion.Secundario

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import arturo.fonseca.vaquitapp.R
import arturo.fonseca.vaquitapp.navigation.appScreens

@Composable
fun MenuSecundarioScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .requiredWidth(width = 412.dp)
            .requiredHeight(height = 917.dp)
    ) {
        Botones(navController)
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
fun Botones(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp) // Adjust spacing as needed
    ) {
        BtnVaca(navController)
        BtnSemental(navController)
        BtnBecerro(navController)
        Spacer(modifier = Modifier.weight(1f)) // Push BtnAtras to the bottom
        BtnAtras(navController)
    }
}

@Composable
fun BtnAtras(navController: NavController) {
    Button(onClick = {navController.navigate(appScreens.Home.route)},modifier = Modifier
        .requiredWidth(width = 150.dp)
        .requiredHeight(height = 40.dp)
        .offset(
            x = 131.dp,
            y = 800.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
        border = BorderStroke(1.dp, Color(0xFF000000)),
        shape = RoundedCornerShape(30.dp)){
    }
}

@Composable
fun BtnSemental(navController: NavController) {
    Button(onClick = { }, modifier = Modifier
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
fun BtnVaca(navController: NavController) {
    Button(onClick = {navController.navigate(appScreens.AltaVacas.route)}, modifier = Modifier
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
fun BtnBecerro(navController: NavController) {
    Button(onClick = {navController.navigate(appScreens.AltaBecerros.route)}, modifier = Modifier
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