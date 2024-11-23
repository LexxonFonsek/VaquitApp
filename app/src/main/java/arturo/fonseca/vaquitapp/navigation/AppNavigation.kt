package arturo.fonseca.vaquitapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import arturo.fonseca.vaquitapp.Presentacion.AltaVacas.AltaVacasScreen
import arturo.fonseca.vaquitapp.Presentacion.Home.MenuPrincipalScreen
import arturo.fonseca.vaquitapp.Presentacion.Login.Login1
import arturo.fonseca.vaquitapp.Presentacion.Registro.Registro
import arturo.fonseca.vaquitapp.Presentacion.Secundario.MenuSecundarioScreen

import arturo.fonseca.vaquitapp.Presentacion.Modelo.Becerros
import arturo.fonseca.vaquitapp.Presentacion.AltaBecerro.AltaBecerros
import arturo.fonseca.vaquitapp.navigation.appScreens
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase





@Composable
fun AppNavigation(navController: NavController,
    auth: FirebaseAuth,
    db: FirebaseFirestore
) {
    val navController = rememberNavController()


    NavHost(navController = navController, startDestination = appScreens.Login1.route) {
        composable(appScreens.Home.route) { MenuPrincipalScreen(navController) }
        composable(appScreens.AltaBecerros.route) { AltaBecerros(navController) }
        composable(appScreens.MenuSecundario.route) { MenuSecundarioScreen(navController) }
        composable(appScreens.Login1.route) { Login1(auth, navController) }
        composable(appScreens.Registro.route) { Registro(auth, navController) }
        composable(appScreens.AltaVacas.route) { AltaVacasScreen(navController) }


    }
}