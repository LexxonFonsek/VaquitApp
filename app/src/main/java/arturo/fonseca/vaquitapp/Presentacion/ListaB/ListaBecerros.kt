package arturo.fonseca.vaquitapp.Presentacion.ListaB

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import arturo.fonseca.vaquitapp.Presentacion.Modelo.Becerros
import arturo.fonseca.vaquitapp.R
import com.google.firebase.firestore.FirebaseFirestore

//@Preview
@Composable
fun ListaBecerros(db: FirebaseFirestore, viewModel: ListaBecerrosModel = ListaBecerrosModel()) {

    val becerros: State<List<Becerros>> = viewModel.becerros.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text(
        "Becerros",
        color = Color.Black,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp // Use sp for font size
    )

        LazyColumn {
            items(becerros.value) {
                becerroItem(it)
            }
        }
    }
}

@Composable
fun becerroItem(becerros: Becerros) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.becerroicon), //Imagen del logo Vaquitapp
            contentDescription = "BecerroIcon",
            modifier = Modifier.size(100.dp)
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(text= becerros.nombre.toString(),color = Color.Black)

    }
}
