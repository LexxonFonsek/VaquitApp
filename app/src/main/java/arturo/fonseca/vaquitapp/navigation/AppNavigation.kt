package arturo.fonseca.vaquitapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import arturo.fonseca.vaquitapp.Presentacion.AltaBecerro.AltaBecerros
import arturo.fonseca.vaquitapp.Presentacion.AltaReproduccionVacas.AltaVacasScreen
import arturo.fonseca.vaquitapp.Presentacion.Login.Login1
import arturo.fonseca.vaquitapp.Presentacion.Home.MenuPrincipalScreen
import arturo.fonseca.vaquitapp.Presentacion.Listas.ListaBecerros
import arturo.fonseca.vaquitapp.Presentacion.Secundario.MenuSecundarioScreen
import arturo.fonseca.vaquitapp.Presentacion.Registro.Registro
import arturo.fonseca.vaquitapp.SplashScreen
import arturo.fonseca.vaquitapp.navigation.appScreens
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore


@Composable
fun AppNavigation(navController: NavController,
                  auth: FirebaseAuth,
                  db: FirebaseFirestore
) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = appScreens.SplashScreen.route) {
        composable(route = appScreens.SplashScreen.route) {
            SplashScreen(navController)
        }
        composable(route = appScreens.Login1.route) {
            Login1(auth, navController)
        }
        composable(route = appScreens.MenuPrincipalScreen.route) {
            MenuPrincipalScreen(navController)
        }
        composable(route = appScreens.MenuSecundarioScreen.route) {
            MenuSecundarioScreen(navController)
        }
        composable(route = appScreens.AltaVacasScreen.route) {
            AltaVacasScreen(db,navController)
        }
        composable(route = appScreens.Registro.route) {
            Registro(auth, navController)
        }
        composable(route = appScreens.AltaBecerros.route) {
            AltaBecerros(db ,navController)
        }
        composable(route = appScreens.AltaVacasRepScreen.route) {
            AltaBecerros(db ,navController)
        }
        composable(route = appScreens.ListaBecerros.route) {
            ListaBecerros(db)
        }


    }
}