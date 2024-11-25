package arturo.fonseca.vaquitapp.Presentacion.InfoAnimal



import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import arturo.fonseca.vaquitapp.Presentacion.ListaB.ListaBecerrosModel
import arturo.fonseca.vaquitapp.R

//@Composable
//fun MuestraDatosBecerros(
//    viewModel: ListaBecerrosModel,
//    becerroId: Int,
//    modifier: Modifier = Modifier
//) {
//    val becerro by ListaBecerrosModel.getBecerros(becerroId).observeAsState()
//
//    Box(
//        modifier = modifier
//            .requiredWidth(width = 412.dp)
//            .requiredHeight(height = 917.dp)
//            .background(color = Color.White)
//    ) {
        // Imagen del logo
//        Image(
//            painter = painterResource(id = R.drawable.logo),
//            contentDescription = "VaquitAppV1png 5",
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 328.dp, y = 100.dp)
//                .requiredSize(size = 50.dp)
//        )

        // Datos dinámicos
//        becerro?.let { data ->
//            val campos = listOf(
//                "Nombre: ${data.nombre}",
//                "Sexo: ${data.sexo}",
//                "Fecha Nacimiento: ${data.fechaNacimiento}",
//                "Peso al nacer: ${data.pesoNacimiento}",
//                "Madre: ${data.madre}",
//                "Padre: ${data.padre}",
//                "Procedencia: ${data.procedencia}",
//                "SINIIGA: ${data.siniiga}",
//                "Campaña: ${data.campaña}"
//            )

//            campos.forEachIndexed { index, campo ->
//                Text(
//                    text = campo,
//                    color = Color.Black,
//                    style = TextStyle(fontSize = 14.sp),
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 98.dp, y = (330 + (index * 30)).dp)
//                )
//            }
//        }
//    }
//}



