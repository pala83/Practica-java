package Calculator;

import Classes.FiguritaLimitada;

public class CalculadorPrecioFijo implements Calculador{
    private double precioFijo;

    public CalculadorPrecioFijo(double precioFijo){
        this.precioFijo = precioFijo;
    }

    public double getPrecioFijo() {
        return precioFijo;
    }
    public void setPrecioFijo(double precioFijo) {
        this.precioFijo = precioFijo;
    }
    @Override
    public double calcular(FiguritaLimitada f) {
        return this.precioFijo;
    }
}
