package arturo.fonseca.vaquitapp.Presentacion.Listas

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import arturo.fonseca.vaquitapp.Presentacion.Modelo.Becerros
import arturo.fonseca.vaquitapp.Presentacion.Modelo.Vacas
import arturo.fonseca.vaquitapp.R
import coil3.compose.AsyncImage
import com.google.common.collect.Maps.toMap
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
