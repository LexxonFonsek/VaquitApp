package arturo.fonseca.vaquitapp.ui.theme.menuAgregar.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import arturo.fonseca.vaquitapp.R
import arturo.fonseca.vaquitapp.navigation.appScreens
import arturo.fonseca.vaquitapp.ui.theme.menuSecundarioAniadir.ui.MenuSecundarioScreen

@Composable
fun MenuPrincipalScreen(navController: NavController,modifier: Modifier = Modifier){
    Box(
        modifier = modifier
//            .requiredWidth(width = 412.dp)
//            .requiredHeight(height = 917.dp)
            .background(color = Color.White)
            .fillMaxSize()
            .padding(0.dp)
    ) {
        BtnAniadir(
            navController = navController,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 32.dp,
                    y = 110.dp
                )
        )
        Text(
            text = "Consulta ganado",
            color = Color.Black,
            lineHeight = 6.25.em,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 32.dp,
                    y = 177.dp
                ))
        BtnGeneral(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 32.dp,
                    y = 200.dp
                ))
        BtnVacas(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 32.dp,
                    y = 280.dp
                ))
        BtnToros(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 216.dp,
                    y = 280.dp
                ))
        BtnBecerros(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 32.dp,
                    y = 360.dp
                ))
        BtnSanidad(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 32.dp,
                    y = 459.dp
                ))
        BtnNutricion(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 213.dp,
                    y = 459.dp
                ))
        BtnReproduccion(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 32.dp,
                    y = 539.dp
                ))
        BtnIngresos(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 32.dp,
                    y = 638.dp
                ))
        BtnDestinados(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 216.dp,
                    y = 638.dp
                ))
        BtnDescesos(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 32.dp,
                    y = 718.dp
                ))
        BtnVendidos(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 216.dp,
                    y = 718.dp
                ))
//        BtnEstadistico(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 32.dp,
//                    y = 798.dp
//                ))
//        Image(
//            painter = painterResource(id = R.drawable.menu),
//            contentDescription = "menu",
//            colorFilter = ColorFilter.tint(Color(0xff1d1b20)),
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 32.dp,
//                    y = 44.dp)
//                .requiredSize(size = 30.dp))
        Image(
            painter = painterResource(id = R.drawable.logo), //Imagen del logo Vaquitapp
            contentDescription = "LogoVaquitApp",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 334.dp,
                    y = 50.dp
                )
                .requiredSize(size = 50.dp)
        )
        Text(
            text = "Menú principal",
            color = Color.Black,
            lineHeight = 3.em,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 125.dp,
                    y = 45.dp
                )
        )
    }
}



@Composable
fun BtnAniadir(navController: NavController,modifier: Modifier) {
    Button(onClick = {navController.navigate(route = appScreens.MenuSecundarioScreen)}, modifier = modifier
        .requiredWidth(352.dp)
        .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
        border = BorderStroke(1.dp, Color(0xff2c2c2c)),
        shape = RoundedCornerShape(10.dp)
        ) {
        Text(
            text = "Añadir",
            color = Color(0xFFFFFFFF),
            lineHeight = 2.em,
            style = MaterialTheme.typography.headlineSmall,
            fontSize = 18.sp)

    }
}
@Composable
fun BtnGeneral(modifier: Modifier) {
    Button(onClick = { }, modifier = modifier
        .requiredWidth(width = 352.dp)
        .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
        border = BorderStroke(1.dp, Color(0xff000000)),
        shape = RoundedCornerShape(10.dp)
        ) {
        Text(
            text = "Lista de ganado",
            color = Color(0xFFFFFFFF),
            lineHeight = 2.em,
            style = MaterialTheme.typography.headlineSmall,
            fontSize = 18.sp
        )
    }
}

@Composable
fun BtnVacas(modifier: Modifier) {
    Button(onClick = { }, modifier = modifier
        .requiredWidth(width = 168.dp)
        .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
        border = BorderStroke(1.dp, Color(0xff000000)),
        shape = RoundedCornerShape(10.dp)
    ){
        Text(
            text = "Vacas",
            color = Color(0xFFFFFFFF),
            lineHeight = 2.em,
            style = MaterialTheme.typography.headlineSmall,
            fontSize = 18.sp
        )
    }
}

@Composable
fun BtnToros(modifier: Modifier) {
    Button(onClick = { }, modifier = modifier
        .requiredWidth(width = 168.dp)
        .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
        border = BorderStroke(1.dp, Color(0xff000000)),
        shape = RoundedCornerShape(10.dp)
    ){
        Text(
            text = "Toros",
            color = Color(0xFFFFFFFF),
            lineHeight = 2.em,
            style = MaterialTheme.typography.headlineSmall,
            fontSize = 18.sp
        )
    }
}

@Composable
fun BtnBecerros(modifier: Modifier) {
    Button(onClick = { }, modifier = modifier
        .requiredWidth(width = 352.dp)
        .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
        border = BorderStroke(1.dp, Color(0xff000000)),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            text = "Becerros",
            color = Color(0xFFFFFFFF),
            lineHeight = 2.em,
            style = MaterialTheme.typography.headlineSmall,
            fontSize = 18.sp
        )
    }
}

@Composable
fun BtnSanidad(modifier: Modifier) {
    Button(onClick = { }, modifier = modifier
        .requiredWidth(width = 168.dp)
        .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
        border = BorderStroke(1.dp, Color(0xff000000)),
        shape = RoundedCornerShape(10.dp)
    ){
        Text(
            text = "Sanidad",
            color = Color(0xFFFFFFFF),
            lineHeight = 2.em,
            style = MaterialTheme.typography.headlineSmall,
            fontSize = 18.sp
        )
    }
}

@Composable
fun BtnNutricion(modifier: Modifier) {
    Button(onClick = { }, modifier = modifier
        .requiredWidth(width = 168.dp)
        .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
        border = BorderStroke(1.dp, Color(0xff000000)),
        shape = RoundedCornerShape(10.dp)
    ){
        Text(
            text = "Nutrición",
            color = Color(0xFFFFFFFF),
            lineHeight = 2.em,
            style = MaterialTheme.typography.headlineSmall,
            fontSize = 18.sp
        )
    }
}

@Composable
fun BtnReproduccion(modifier: Modifier) {
    Button(onClick = { }, modifier = modifier
        .requiredWidth(width = 352.dp)
        .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
        border = BorderStroke(1.dp, Color(0xff000000)),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            text = "Reproducción",
            color = Color(0xFFFFFFFF),
            lineHeight = 2.em,
            style = MaterialTheme.typography.headlineSmall,
            fontSize = 18.sp
        )
    }
}

@Composable
fun BtnIngresos(modifier: Modifier) {
    Button(onClick = { }, modifier = modifier
        .requiredWidth(width = 168.dp)
        .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
        border = BorderStroke(1.dp, Color(0xff000000)),
        shape = RoundedCornerShape(10.dp)
    ){
        Text(
            text = "Ingresos",
            color = Color(0xFFFFFFFF),
            lineHeight = 2.em,
            style = MaterialTheme.typography.headlineSmall,
            fontSize = 18.sp
        )
    }
}

@Composable
fun BtnDestinados(modifier: Modifier) {
    Button(onClick = { }, modifier = modifier
        .requiredWidth(width = 168.dp)
        .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
        border = BorderStroke(1.dp, Color(0xff000000)),
        shape = RoundedCornerShape(10.dp)
    ){
        Text(
            text = "Destinados",
            color = Color(0xFFFFFFFF),
            lineHeight = 2.em,
            style = MaterialTheme.typography.headlineSmall,
            fontSize = 18.sp
        )
    }
}

@Composable
fun BtnDescesos(modifier: Modifier) {
    Button(onClick = { }, modifier = modifier
        .requiredWidth(width = 168.dp)
        .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
        border = BorderStroke(1.dp, Color(0xff000000)),
        shape = RoundedCornerShape(10.dp)
    ){
        Text(
            text = "Decesos",
            color = Color(0xFFFFFFFF),
            lineHeight = 2.em,
            style = MaterialTheme.typography.headlineSmall,
            fontSize = 18.sp
        )
    }
}

@Composable
fun BtnVendidos(modifier: Modifier) {
    Button(onClick = { }, modifier = modifier
        .requiredWidth(width = 168.dp)
        .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),
        border = BorderStroke(1.dp, Color(0xff2c2c2c)),
        shape = RoundedCornerShape(10.dp)){
        Text(
            text = "Vendidos",
            color = Color(0xFFFFFFFF),
            lineHeight = 2.em,
            style = MaterialTheme.typography.headlineSmall,
            fontSize = 18.sp)
    }
}

//@Composable
//fun BtnEstadistico(modifier: Modifier = Modifier) {
//    Row(
//        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
//        verticalAlignment = Alignment.CenterVertically,
//        modifier = modifier
//            .requiredWidth(width = 352.dp)
//            .requiredHeight(height = 60.dp)
//            .clip(shape = RoundedCornerShape(8.dp))
//            .background(color = Color(0xff2c2c2c))
//            .border(
//                border = BorderStroke(1.dp, Color(0xff2c2c2c)),
//                shape = RoundedCornerShape(8.dp)
//            )
//            .padding(all = 16.dp)
//    ) {
//        Text(
//            text = "Estadístico",
//            color = Color(0xfff5f5f5),
//            lineHeight = 6.25.em,
//            style = TextStyle(
//                fontSize = 16.sp))
//    }
//}

//@Preview(widthDp = 412, heightDp = 917)
//@Composable
//private fun MenuPrincipalScreenPreview() {
//    MenuPrincipalScreen(NavController,Modifier)
//}