public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean flag;
    private int calificacion;

    public Episodio(String titulo, String descripcion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.flag = false;
        this.calificacion = -1;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public int getCalificacion() {
        return this.calificacion;
    }
    public boolean fueVisto(){
        return this.flag;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void calificar(int calificacion) {
        if(!this.flag){
            System.out.println("ERROR! -> No se puede calificar un episodio que no fue visto.");
            return;
        }
        if(calificacion<0 || calificacion>5){
            System.out.println("ERROR! -> Valor de calificacion invalido.");
            return;
        }
        this.calificacion = calificacion;
    }

    public void ver(){
        this.flag = true;
        this.calificacion = 0;
    }

    @Override
    public String toString() {
        String retorno = "|- T: " + this.titulo + "\n" +
                         "|- D: " + this.descripcion + "\n" +
                         "|- v: " + this.flag + "\n" +
                         "|- c: " + this.calificacion + "\n";
        return retorno;
    }
}
