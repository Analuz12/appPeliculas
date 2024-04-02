package ui;

import android.app.Application;
import android.content.Intent;
import android.util.AndroidException;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import modelo.Pelicula;

public class SegundaActivityViewModel extends AndroidViewModel {
    private MutableLiveData<Pelicula> peliculaMutable;
    public SegundaActivityViewModel(@NonNull Application application) {

        super(application);
    }

    public LiveData<Pelicula> getPeliculaMutable() {
        if (peliculaMutable == null){
            peliculaMutable = new MutableLiveData<>();
        }
        return peliculaMutable;
    }
    public void actualizarDatosPelicula(Pelicula pelicula) {
        if (pelicula != null) {
            pelicula.setActoresCadena(getActoresString(pelicula.getActores()));
            peliculaMutable.setValue(pelicula);
        }
    }

    // Método para recuperar la película del Intent
    public void recuperarPelicula(Intent intent) {
        Pelicula pelicula = (Pelicula) intent.getSerializableExtra("pelicula");
        if (pelicula != null) {
            actualizarDatosPelicula(pelicula);
        }
    }


    //convierte una lista de nombres en una sola cadena
    private String getActoresString(List<String> actores) {
        StringBuilder builder = new StringBuilder();
        for (String actor : actores) {
            builder.append(actor).append(", ");
        }

        if (builder.length() > 0) {
            builder.delete(builder.length() - 2, builder.length());
        }
        return builder.toString();
    }
}
