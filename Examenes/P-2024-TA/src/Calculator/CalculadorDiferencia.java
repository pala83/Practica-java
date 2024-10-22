package Calculator;

import Classes.FiguritaLimitada;

public class CalculadorDiferencia implements Calculador{    
    private int diferencia;

    public CalculadorDiferencia(int diferencia){
        this.diferencia = diferencia;
    }

    @Override
    public double calcular(FiguritaLimitada f) {
        return this.diferencia - f.getCantidad();
    }
}

