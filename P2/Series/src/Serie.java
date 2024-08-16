import java.util.ArrayList;
import java.util.List;

public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private List<Temporada> temporadas;

    public Serie(String titulo, String descripcion, String creador, String genero){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = new ArrayList<>();
    }

    public void addTemporada(Temporada t){
        this.temporadas.add(t);
    }

    public int episodiosVistos(){
        int retorno = 0;
        for(Temporada t : this.temporadas)
            retorno+=t.episodiosVistos();
        return retorno;
    }

    public double calificacion(){
        double sumaCalificacion = 0;
        for(Temporada t: this.temporadas){
            sumaCalificacion+=t.calificacion();
        }
        return this.temporadas.isEmpty() ? 0 : sumaCalificacion/this.temporadas.size();
    }

    public boolean serieCompletada(){
        int total = 0;
        for(Temporada t: this.temporadas)
            total+=t.cantEpisodios();
        return total==this.episodiosVistos();
    }

    public String getTitulo() {
        return titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getCreador() {
        return creador;
    }
    public String getGenero() {
        return genero;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        int cont = 1;
        String retorno = "T: " + this.titulo + "\n" +
                         "D: " + this.descripcion + "\n" +
                         "C: " + this.creador + "\n" +
                         "G: " + this.genero + "\n";
        for(Temporada t: this.temporadas){
            retorno+= "Temporada " + cont + ":\n";
            retorno+= t.toString();
            retorno+= "----------------------------------------\n";
            cont++;
        }
        return retorno;
    }
}
