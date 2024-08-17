public class Ciudad {
    private String nombre;
    private int poblacion;
    private double gastoMantenimiento;
    private double[] impuestos;

    public Ciudad(String nombre, int poblacion, double gastoMantenimiento, double[] impuestos){
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.gastoMantenimiento = gastoMantenimiento;
        this.impuestos = impuestos;
    }

    public double recaudacionTotal(){
        double retorno = 0;
        for(double i: this.impuestos)
            retorno+=i;
        return retorno;
    }

    public boolean enDeficit(){
        return this.recaudacionTotal()< this.gastoMantenimiento;
    }

    public String getNombre() {
        return nombre;
    }
    public int getPoblacion() {
        return poblacion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    
    @Override
    public String toString() {
        return "| " + this.nombre + " | " + this.poblacion + " | " + this.gastoMantenimiento + " | " + this.recaudacionTotal();
    }
}
