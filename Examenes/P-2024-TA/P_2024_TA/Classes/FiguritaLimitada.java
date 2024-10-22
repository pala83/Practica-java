package P_2024_TA.Classes;

import P_2024_TA.Calculator.Calculador;

public class FiguritaLimitada extends Figurita{
    private int cantidad;
    private Calculador calc;
    
    public FiguritaLimitada(String nombre, String album, int numero, double precio, int cantidad, Calculador calc){
        super(nombre, album, numero, precio);
        this.cantidad = cantidad;
        this.calc = calc;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public double getPrecio() {
        double calculo = this.calc.calcular(this);
        return calculo > super.getPrecio() ? calculo : super.getPrecio();
    }


}
