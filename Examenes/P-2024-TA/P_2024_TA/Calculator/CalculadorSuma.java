package P_2024_TA.Calculator;

import P_2024_TA.Classes.FiguritaLimitada;

public class CalculadorSuma implements Calculador {
    private Calculador c1;
    private Calculador c2;

    public CalculadorSuma(Calculador c1, Calculador c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double calcular(FiguritaLimitada f) {
        return this.c1.calcular(f) + this.c2.calcular(f);
    }
}
