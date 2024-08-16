import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre = "N";
    private String apellido = "N";
    private LocalDate nacimiento = LocalDate.of(2000,1,1);
    private int edad = calcularEdad(this.nacimiento);
    private String DNI;
    private String sexo = "F";
    private double altura = 1;
    private double peso = 1;

    public Persona(String DNI){
        this.DNI = DNI;
    }

    public Persona(String DNI, String nombre, String apellido){
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String DNI, String nombre, String apellido, LocalDate nacimiento, String sexo, double altura, double peso){
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.edad = calcularEdad(nacimiento);
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public int calcularEdad(LocalDate nacimiento){
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    public double calcularIMC(){
        return(this.peso/Math.pow(this.altura,2));
    }

    public boolean estaEnForma(){
        double imc = calcularIMC();
        return imc>18.5 && imc<25;
    }

    public boolean cumpleAnios(){
        LocalDate hoy = LocalDate.now();
        return hoy.getDayOfMonth() == this.nacimiento.getDayOfMonth() && hoy.getMonth() == this.nacimiento.getMonth();
    }

    public boolean mayorDeEdad(){
        return this.edad >= 18;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean puedeVotar(){
        return this.edad >= 16;
    }

    public boolean esCoherente(){
        return this.edad == this.calcularEdad(this.nacimiento);
    }
    
    @Override
    public String toString(){
        return "Persona{ \n \tDNI: " + this.DNI + 
        "\n \tNombre y Apellido: " + this.nombre + " " + this.apellido + 
        "\n \tFecha de nacimiento: " + this.nacimiento + 
        "\n \tEdad: " + this.edad + 
        "\n \tSexo: " + this.sexo + 
        "\n \tAltura: " + this.altura + 
        "\n \tPeso: " + this.peso + 
        "\n }";
    }
}

