package arturo.fonseca.vaquitapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import arturo.fonseca.vaquitapp.ui.theme.AltaVacas.ui.AltaVacasScreen
import arturo.fonseca.vaquitapp.navigation.appScreens
import arturo.fonseca.vaquitapp.ui.theme.menuAgregar.ui.MenuPrincipalScreen
import arturo.fonseca.vaquitapp.ui.theme.menuSecundarioAniadir.ui.MenuSecundarioScreen
import arturo.fonseca.vaquitapp.ui.theme.registro.ui.Registro
import arturo.fonseca.vaquitapp.ui.theme.login.ui.Login1



@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = appScreens.Login1.route) {
        composable(route = appScreens.MenuPrincipalScreen.route) {
            MenuPrincipalScreen(navController)
        }
        composable(route = appScreens.MenuSecundarioScreen.route) {
            MenuSecundarioScreen(navController)
        }
        composable(route = appScreens.AltaVacasScreen.route) {
            AltaVacasScreen(navController)
        }
        composable(route = appScreens.Registro.route) {
            Registro(navController)
        }
        composable(route = appScreens.Login1.route) {
            Login1(navController)
        }

    }
}