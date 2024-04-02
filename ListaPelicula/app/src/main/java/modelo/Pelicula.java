package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pelicula implements Serializable {

    private String titulo;
    private String sinopsis;
    private String director;
    private int foto;
    private List<String> actores;
    private String actoresCadena;

    public Pelicula(String titulo, String sinopsis, String director, int foto, List<String> actores) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.foto = foto;
        this.actores = actores;
        this.actoresCadena = actoresCadena;
    }



    public String getActoresCadena() {
        return actoresCadena;
    }

    public void setActoresCadena(String actoresCadena) {
        this.actoresCadena = actoresCadena;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public List<String> getActores() {
        return actores;
    }

    public void setActores(List<String> actores) {
        this.actores = actores;
    }
}
