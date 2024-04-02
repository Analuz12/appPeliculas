package ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.portal.listapelicula.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import modelo.Pelicula;

public class MainActivityViewModel extends AndroidViewModel {
    private MutableLiveData<List<Pelicula>> listaPeliculas;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        listaPeliculas = new MutableLiveData<>();
        inicializarListaPeliculas();
    }

    public LiveData<List<Pelicula>> getListaPeliculas() {
        return listaPeliculas;
    }

    private void inicializarListaPeliculas() {
        List<Pelicula> peliculas = new ArrayList<>();

        List<String> actoresContigo = Arrays.asList("Florence Pugh", "Olivia Wilde", "Chris Pine");
        peliculas.add(new Pelicula("No te preocupes cariño", "Una esposa de los años 50 en una comunidad utópica comienza a preocuparse por los misteriosos secretos que oculta la empresa de su marido.",
                "Olivia Wilde",
                R.drawable.imagen1, actoresContigo));

        List<String> actoresHistorias = Arrays.asList("Emma Stone", "Viola Davis", "Octavia Spencer");
        peliculas.add(new Pelicula("Historias cruzadas", "Una chica de sociedad del Misisipi de los años sesenta está decidida a ser una escritora y transforma una pequeña ciudad al entrevistar a las mujeres negras que trabajan con las familias prominentes.",
                "Tate Taylor",
                R.drawable.imagen2, actoresHistorias));

        List<String> actoresSilence = Arrays.asList("Judith Anna Roberts", "Ryan Kwanten", "Amber Valletta", "Donnie Wahlberg");
        peliculas.add(new Pelicula("Dead Silence", "Después de que su esposa tiene un triste final, Jamie Ashen regresa a su espantosa ciudad natal de Ravens Fair para resolver el misterio que rodea su muerte. Una vez ahí, él descubre la leyenda de Mary Shaw, una ventrílocua asesinada cuya extraña presencia aún flota por la ciudad. Mientras busca respuestas desesperadamente, Jamie descubre el hechizo que le costó la vida a su esposa y amenaza la suya propia.",
                "James Wan",
                R.drawable.silence, actoresSilence));

        List<String> actoresRevelde = Arrays.asList("James Marsden", "Russell Brand", "Veronica Alicino", "Kaley Cuoco", "Hugh Laurie");
        peliculas.add(new Pelicula("Rebelde Sin Pascua", "Debajo de la Isla de Pascua, en una fábrica gigante que hace dulces de Pascua, el popular conejo está preparando pasar la estafeta a su hijo, E.B., pero él no está interesado en el trabajo y prefiere ser baterista. Él huye a Los Ángeles, en donde un vago desempleado llamado Fred O'Hare accidentalmente se cruza con él. Fingiendo estar herido, E.B. engaña a Fred para que le dé refugio, pero un gran pollo planea un golpe de Estado en la isla.",
                "Tim Hill",
                R.drawable.imagen4, actoresRevelde));


        listaPeliculas.setValue(peliculas);
    }
}
