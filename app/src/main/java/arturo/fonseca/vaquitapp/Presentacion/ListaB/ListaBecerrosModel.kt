package arturo.fonseca.vaquitapp.Presentacion.ListaB

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import arturo.fonseca.vaquitapp.Presentacion.Modelo.Becerros
import com.google.firebase.Firebase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

class ListaBecerrosModel: ViewModel() {
    private var db: FirebaseFirestore = Firebase.firestore
     private val _becerros = MutableStateFlow <List<Becerros>>(emptyList())
     val becerros:StateFlow<List<Becerros>> = _becerros

    init {
        getBecerros()
    }

    fun getBecerros() {

        viewModelScope.launch {
        val result = withContext(Dispatchers.IO){
            getAllBecerros()
        }
            _becerros.value = result
        }
    }

    suspend fun getAllBecerros(): List<Becerros> {
        return try {
            db.collection("becerros")
                .get()
                .await()
                .documents
                .mapNotNull { snapshot ->
                    snapshot.toObject(Becerros::class.java)
                }
        }catch (e : Exception){
            emptyList()
        }
    }
}