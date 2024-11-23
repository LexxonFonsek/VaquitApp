package arturo.fonseca.vaquitapp.navigation

sealed class appScreens(val route: String) {

        object Home : appScreens("home")
        object Becerros : appScreens("becerros")
        object MenuSecundario : appScreens("menu_secundario")
        //object ListaGanado : appScreens("lista_ganado")
        object AltaBecerros : appScreens("alta_becerros")
        object Registro : appScreens("registro")
        object Login1 : appScreens("login1")
        object MenuPrincipalScreen : appScreens("menu_principal_screen")
        object AltaVacas : appScreens("alta_vacas")
        // Add other screens as needed


}