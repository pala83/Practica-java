import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private List<Provincia> provincias;

    public Pais(String nombre){
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean addProvincia(Provincia nueva){
        for(Provincia p: this.provincias){
            if(p.getNombre().equals(nueva.getNombre()))
                return false;
        }
        this.provincias.add(nueva);
        return true;
    }

    public List<Ciudad> ciudadesDeficitMaxPoblacion(int poblacionMax){
        List<Ciudad> retorno = new ArrayList<>();
        for(Provincia p: this.provincias){
            for(Ciudad c: p.ciudadesDeficitarias()){
                if(c.getPoblacion()>poblacionMax)
                    retorno.add(c);
            }
        }
        return retorno;
    }

    public List<Provincia> provinciasDeficitarias(){
        List<Provincia> retorno = new ArrayList<>();
        for(Provincia p: this.provincias){
            if(p.mayoriaEnDeficit())
                retorno.add(p);
        }
        return retorno;
    }

    @Override
    public String toString() {
        String retorno = this.nombre + "\n";
        for(Provincia p: this.provincias){
            retorno+=p.toString();
            retorno+= "|-----------------------------------------------------------" + "\n";
        }
        return retorno;
    }
}
