package Calculator;

import Classes.FiguritaLimitada;

public class CalculadorProducto implements Calculador {
    private Calculador c1;
    private Calculador c2;

    public CalculadorProducto(Calculador c1, Calculador c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double calcular(FiguritaLimitada f) {
        return this.c1.calcular(f) * this.c2.calcular(f);
    }
}
