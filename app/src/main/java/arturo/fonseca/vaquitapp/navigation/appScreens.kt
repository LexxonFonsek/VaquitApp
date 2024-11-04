package arturo.fonseca.vaquitapp.navigation

sealed class appScreens(val route: String) {
    object MenuPrincipalScreen: appScreens("menuPrincipal")
    object MenuSecundarioScreen: appScreens("menuSecundario")
    object AltaVacasScreen: appScreens("altaVacas")
}