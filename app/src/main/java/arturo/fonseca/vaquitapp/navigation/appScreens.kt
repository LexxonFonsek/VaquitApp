package arturo.fonseca.vaquitapp.navigation

sealed class appScreens(val route: String) {
    object MenuPrincipalScreen: appScreens("main_screen")
    object MenuSecundarioScreen: appScreens("menu_secundario_screen")
    object AltaVacasScreen: appScreens("alta_vacas_screen")
    object Registro: appScreens("registro_screen")
    object Login1: appScreens("login_screen")

}