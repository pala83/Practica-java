package P_2023_Quequen.Classes;

import java.util.ArrayList;
import java.util.List;

import P_2023_Quequen.Condiciones.Condicion;

public class ProductoPromocional extends Producto{
    private double descuento;

    public ProductoPromocional(String nombre, double peso, double volumen, double descuento){
        super(nombre, peso, volumen);
        this.descuento = descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public double getDescuento() {
        return descuento;
    }

    @Override
    public List<Producto> buscar(Condicion c) {
        List<Producto> retorno = new ArrayList<>();
        retorno.add(this);
        return retorno;
    }

    @Override
    public double getCostoProducto() {
        double costo = super.getCostoProducto();
        return costo-costo*this.descuento;
    }
}
