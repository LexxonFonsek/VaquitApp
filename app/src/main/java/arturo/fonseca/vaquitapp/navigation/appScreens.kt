package arturo.fonseca.vaquitapp.navigation

sealed class appScreens(val route: String) {
    object MenuPrincipalScreen: appScreens("main_screen")
    object MenuSecundarioScreen: appScreens("msecundario_screen")
    object AltaVacasScreen: appScreens("altvacas_screen")
    object Registro: appScreens("registro_screen")
    object Login1: appScreens("login_screen")
    object AltaBecerros: appScreens("Alta_becerros")

}