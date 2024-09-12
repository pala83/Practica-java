public class Convertidor {
    public static final double PULGADA_CENTIMETROS = 2.54;
    public static final double LIBRA_KILOS = 0.453592;
    public static final double GALON_LITROS = 3.78541;

    public static double getKilosDesdeLibras(double libras){
        return libras*LIBRA_KILOS;
    }

    public static double getLibrasDesdeKilos(double kilos){
        return kilos/LIBRA_KILOS;
    }
}
