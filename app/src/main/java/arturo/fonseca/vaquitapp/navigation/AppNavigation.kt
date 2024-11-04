package arturo.fonseca.vaquitapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import arturo.fonseca.vaquitapp.ui.theme.AltaVacas.ui.AltaVacasScreen
import arturo.fonseca.vaquitapp.ui.theme.menuAgregar.ui.MenuPrincipalScreen
import arturo.fonseca.vaquitapp.ui.theme.menuSecundarioAniadir.ui.MenuSecundarioScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController= navController, startDestination = appScreens.MenuPrincipalScreen.route){
        composable(route = appScreens.MenuPrincipalScreen.route){
            MenuPrincipalScreen(navController)
        }
        composable(route = appScreens.MenuSecundarioScreen.route) {
            MenuSecundarioScreen(navController)
        }
        composable(route = appScreens.AltaVacasScreen.route) {
            AltaVacasScreen()
        }
    }
}