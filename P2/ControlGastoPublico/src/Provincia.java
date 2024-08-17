import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre;
    private List<Ciudad> ciudades;

    public Provincia(String nombre){
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean addCiudad(Ciudad nueva){
        for(Ciudad c: this.ciudades){
            if(c.getNombre().equals(nueva.getNombre()))
                return false;
        }
        this.ciudades.add(nueva);
        return true;
    }

    public List<Ciudad> ciudadesDeficitarias(){
        List<Ciudad> retorno = new ArrayList<>();
        for(Ciudad c: this.ciudades){
            if(c.enDeficit())
                retorno.add(c);
        }
        return retorno;
    }

    public boolean mayoriaEnDeficit(){
        return this.ciudadesDeficitarias().size() > (this.ciudades.size()/2);
    }

    @Override
    public String toString() {
        String retorno = this.nombre + "\n";
        retorno+="|--------------------------------------------------|\n";
        retorno+="| Nombre | Poblacion | Mantenimiento | Recaudacion |\n";
        retorno+="|--------------------------------------------------|\n";
        for(Ciudad c: this.ciudades)
            retorno+=c.toString() + "\n";
        return retorno;
    }
}
