import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona("40404040");
        Persona p2 = new Persona("40404041", "Fulanito", "Detal");
        LocalDate nacimiento = LocalDate.of(1982, 2, 3);
        Persona p3 = new Persona("40404042", "Menganito", "Perez Lopez", nacimiento, "M", 1.75, 75);

        System.out.println("P1: " + p1.toString());
        System.out.println("P2: " + p2.toString());
        System.out.println("P3: " + p3.toString());
        System.out.println("P3(Indice de masa corporal): " + p3.calcularIMC());
        System.out.println("P3(¿Esta en forma?): " + p3.estaEnForma());
        System.out.println("P3(¿Hoy es su cumple años?): " + p3.cumpleAnios());
        System.out.println("P3(¿Es mayor de edad?): " + p3.mayorDeEdad());
        System.out.println("P3(¿Puede votar?): " + p3.puedeVotar());
        System.out.println("P3(¿Es coherente?): " + p3.esCoherente());

        Punto punto1 = new Punto(0, 0);
        Punto punto3 = new Punto(4, 3);
        System.out.println("Distancia euclidea entre P1 y P3: " + punto1.distanciaEuclidea(punto3));
    }
}
