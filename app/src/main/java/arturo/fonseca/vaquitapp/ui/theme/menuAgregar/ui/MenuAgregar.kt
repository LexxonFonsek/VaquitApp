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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import arturo.fonseca.vaquitapp.R
import arturo.fonseca.vaquitapp.navigation.appScreens


@Composable
fun MenuAgregar(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(0.dp), // Added padding
        horizontalAlignment = Alignment.CenterHorizontally, // Center content horizontally
        verticalArrangement = Arrangement.Top // Align content to the top
    ) {
        // Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "Menú principal",
                color = Color.Black,
                style = MaterialTheme.typography.headlineSmall
            )
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "LogoVaquitApp",
                modifier = Modifier.size(50.dp)
            )
        }
        Text(
            text = "Consulta ganado",
            color = Color.Black,
            lineHeight = 6.25.em,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier)
        // Buttons
        MenuButtons(navController)
    }
}

@Composable
fun MenuButtons(navController: NavController) {
    //BOTONES GRANDES
    val buttonModifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 8.dp) // Added vertical padding
        .requiredWidth(352.dp)
        .requiredHeight(height = 60.dp)
        .border(1.dp, Color.Black, RoundedCornerShape(10.dp))
    //BOTONES PEQUEÑOS
    val buttonsModifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 5.dp, horizontal = 10.dp) // Added vertical padding
        .requiredWidth(352.dp)
        .requiredHeight(height = 60.dp)
        .border(1.dp, Color.Black, RoundedCornerShape(10.dp))


    Button(
        onClick = { navController.navigate(appScreens.MenuSecundarioScreen.route) },
        modifier = buttonModifier,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text("Añadir", color = Color.White)
    }

    Button(
        onClick = { navController.navigate(appScreens.MenuSecundarioScreen.route) }, // Replace with navigation logic
        modifier = buttonModifier,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text("Lista de ganado", color = Color.White)
    }
    Button(
        onClick = { navController.navigate(appScreens.MenuSecundarioScreen.route) }, // Replace with navigation logic
        modifier = buttonsModifier .requiredWidth(width = 168.dp)
            .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text("Vacas", color = Color.White)
    }
    Button(
        onClick = { navController.navigate(appScreens.MenuSecundarioScreen.route) }, // Replace with navigation logic
        modifier = buttonsModifier .requiredWidth(width = 168.dp)
            .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text("Toros", color = Color.White)
    }
    Button(
        onClick = { navController.navigate(appScreens.MenuSecundarioScreen.route) }, // Replace with navigation logic
        modifier = buttonModifier,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text("Becerros", color = Color.White)
    }
    Button(
        onClick = { navController.navigate(appScreens.MenuSecundarioScreen.route) }, // Replace with navigation logic
        modifier = buttonsModifier .requiredWidth(width = 168.dp)
            .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text("Sanidad", color = Color.White)
    }
    Button(
        onClick = { navController.navigate(appScreens.MenuSecundarioScreen.route) }, // Replace with navigation logic
        modifier = buttonsModifier .requiredWidth(width = 168.dp)
            .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text("Nutrición", color = Color.White)
    }
    Button(
        onClick = { navController.navigate(appScreens.MenuSecundarioScreen.route) }, // Replace with navigation logic
        modifier = buttonModifier,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text("Reproducción", color = Color.White)
    }
    Button(
        onClick = { navController.navigate(appScreens.MenuSecundarioScreen.route) }, // Replace with navigation logic
        modifier = buttonsModifier .requiredWidth(width = 168.dp)
            .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text("Ingresos", color = Color.White)
    }
    Button(
        onClick = { navController.navigate(appScreens.MenuSecundarioScreen.route) }, // Replace with navigation logic
        modifier = buttonsModifier .requiredWidth(width = 168.dp)
            .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text("Destinados", color = Color.White)
    }
    Button(
        onClick = { navController.navigate(appScreens.MenuSecundarioScreen.route) }, // Replace with navigation logic
        modifier = buttonsModifier .requiredWidth(width = 168.dp)
            .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text("Decesos", color = Color.White)
    }
    Button(
        onClick = { navController.navigate(appScreens.MenuSecundarioScreen.route) }, // Replace with navigation logic
        modifier = buttonsModifier .requiredWidth(width = 168.dp)
            .requiredHeight(height = 60.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text("Vendidos", color = Color.White)
    }
}
@Preview(widthDp = 412, heightDp = 917)
@Composable
private fun MenuAgregarPreview() {
    MenuAgregar(navController = NavController(LocalContext.current))
}