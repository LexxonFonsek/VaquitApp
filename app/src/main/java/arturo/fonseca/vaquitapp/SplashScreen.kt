package arturo.fonseca.vaquitapp

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import arturo.fonseca.vaquitapp.navigation.appScreens
import kotlinx.coroutines.delay
import org.checkerframework.checker.units.qual.C

@Composable
fun SplashScreen(navController: NavController){
    LaunchedEffect(key1 = true) {
        delay(10000)
        navController.popBackStack()
        navController.navigate(appScreens.Login1.route)
    }
    navController.navigate(appScreens.Login1.route)
    Splash()
}

@Composable
fun Splash() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription ="Logo VaquitApp",
            )
        Text(text = "Bienvenid@s",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold)
    }
}

    @Preview(showBackground = true)
    @Composable
    fun SplashScreenPreview() {
        Splash()
    }
