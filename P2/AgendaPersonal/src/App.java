import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Reunion> reuniones = new ArrayList<>();

        Horario h1 = new Horario(LocalTime.of(7, 0), 45);   //_______|_<______________
        Horario h2 = new Horario(LocalTime.of(8, 0), 60);   //---------|-|------------
        Horario h3 = new Horario(LocalTime.of(21, 10), 105);//--------------------|-<-
        Horario h4 = new Horario(LocalTime.of(7, 30), 45);  //------->->--------------
        Horario h5 = new Horario(LocalTime.of(10, 0), 240); //------------|---|-------
        
        Reunion r1 = new Reunion("Tandil", "¿Como programar una agenda?", h1);
        Reunion r2 = new Reunion("Venezuela", "Introduccion a las dictaduras militares", h2);
        Reunion r3 = new Reunion("Rosario", "Curso para esquivar balas", h3);
        Reunion r4 = new Reunion("Paris", "Tratamiento anti-radiactivo para el rio Sena", h4);
        Reunion r5 = new Reunion("Buenos Aires", "Innovacion y tecnologia: la empanada en un frasco", h5);

        Contacto c1 = new Contacto("Fulano Detal", "2494222222");
        Contacto c2 = new Contacto("Menganito", "2494222222");
        Contacto c3 = new Contacto("Rambo", "2494222222");
        Contacto c4 = new Contacto("Aristarco de Samos", "2494222222");
        Contacto c5 = new Contacto("Anaxagoras", "2494222222");
        Contacto c6 = new Contacto("Marco Tulio Ciceron", "2494222222");
        Contacto c7 = new Contacto("Euripides", "2494222222");
        Contacto c8 = new Contacto("Anaximandro", "2494222222");
        Contacto c9 = new Contacto("Tales el Turco", "2494222222");

        r1.addAsistente(c1);
        r1.addAsistente(c2);

        r2.addAsistente(c3);
        r2.addAsistente(c4);
        r2.addAsistente(c5);

        r3.addAsistente(c6);

        r4.addAsistente(c7);
        r4.addAsistente(c8);
        r4.addAsistente(c9);

        reuniones.add(r1);
        reuniones.add(r2);
        reuniones.add(r3);
        reuniones.add(r4);
        reuniones.add(r5);

        Agenda a = new Agenda();
        
        for(Reunion r: reuniones){
            if(!a.addReunion(r)){
                System.out.println("ERROR - LA SIGUIENTE REUNION ESTA EN CONFLICTO");
                System.out.println(r);
            }
        }

        System.out.println(a);
    }
}
