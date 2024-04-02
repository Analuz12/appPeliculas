package ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.portal.listapelicula.R;

import modelo.Pelicula;

public class SegundaActivity extends AppCompatActivity {
    private SegundaActivityViewModel mv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mv = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(SegundaActivityViewModel.class);

        mv.getPeliculaMutable().observe(this, new Observer<Pelicula>() {
            @Override
            public void onChanged(Pelicula pelicula) {
                actualizarVistaConPelicula(pelicula);
            }
        });

        mv.recuperarPelicula(getIntent());
    }

    private void actualizarVistaConPelicula(Pelicula pelicula) {
        TextView nombre = findViewById(R.id.tvNombre);
        TextView actores = findViewById(R.id.tvActores);
        TextView sinopsis = findViewById(R.id.tvDetalles);
        TextView director = findViewById(R.id.tvDirector);
        ImageView foto = findViewById(R.id.ivImg);

        nombre.setText(pelicula.getTitulo());
        actores.setText("Actores: " + pelicula.getActoresCadena());
        sinopsis.setText(pelicula.getSinopsis());
        director.setText("Director: " + pelicula.getDirector());
        foto.setImageResource(pelicula.getFoto());
    }
}