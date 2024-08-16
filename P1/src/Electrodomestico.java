public class Electrodomestico {
    private String nombre;
    private double precioBase = 100;
    private String color = "gris plata";
    private double consumoEnergetico = 10;
    private double peso = 2;

    public Electrodomestico(String nombre){
        this.nombre = nombre;
    }
    public Electrodomestico(String nombre, double precioBase, String color, double consumoEnergetico, double peso){
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public String getColor() {
        return color;
    }
    public double getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public double getPeso() {
        return peso;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setConsumoEnergetico(double consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public boolean esBajoConsumo(){
        return this.consumoEnergetico < 45;
    }
    public double balance(){
        return this.precioBase/this.peso;
    }
    public boolean altaGama(){
        return this.balance() > 3;
    }

    @Override
    public String toString(){
        return "Electrodomestico{ \n \tnombre: " + this.nombre + 
        "\n \tPrecio base: " + this.precioBase + 
        "\n \tColor: " + this.color + 
        "\n \tConsumo energetico: " + this.consumoEnergetico + 
        "\n \tPeso: " + this.peso + 
        "\n }";
    }
}
