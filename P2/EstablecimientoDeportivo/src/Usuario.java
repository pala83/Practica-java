import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private static int cantTurnosReservados = 0;

    public Usuario(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void reservas(Establecimiento e){
        
    }

    public boolean esSocio(){
        return this.cantTurnosReservados>=4;
    }
}
