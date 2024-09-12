import java.time.LocalTime;

public class Turno {
    private Usuario usuario;
    private Cancha cancha;
    private Horario horario;

    public Turno(Usuario usuario, Cancha cancha){
        this.usuario = usuario;
        this.cancha = cancha;
        this.horario = new Horario(LocalTime.now(), 60 );
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public Cancha getCancha() {
        return cancha;
    }
    public Horario getHorario() {
        return horario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }
    public boolean setHorario(Horario horario) { // El horario debe tener por lo menos una hora
        if(horario.getDuracion()>=60)
            this.horario = horario;
        return horario.getDuracion() >= 60;
    }

    public double calcularCosto(){
        double costo = (this.horario.getDuracion()/60)*this.cancha.getPrecioPHora();
        if(this.usuario.esSocio())
            return costo*0.1;
        return costo;
    }
}
