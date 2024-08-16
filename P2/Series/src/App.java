public class App {
    public static void main(String[] args) throws Exception {
        Episodio e11 = new Episodio("Pilot", "");
        Episodio e12 = new Episodio("Lawnmower Dog", "");
        Episodio e13 = new Episodio("Anatomy Park", "");
        Episodio e14 = new Episodio("M. Night Shaym-Aliens!", "");

        e11.ver();
        e11.calificar(3);
        e12.ver();
        e12.calificar(3);
        e13.ver();
        e13.calificar(3);

        Episodio e21 = new Episodio("A Rickle in Time", "");
        Episodio e22 = new Episodio("Mortynight Run", "");
        Episodio e23 = new Episodio("Auto Erotic Assimilation", "");
        Episodio e24 = new Episodio("Total Rickall", "");

        Episodio e31 = new Episodio("The Rickshank Rickdemption", "");
        Episodio e32 = new Episodio("Rickmancing the Stone", "");
        Episodio e33 = new Episodio("Pickle Rick", "");
        Episodio e34 = new Episodio("Vindicators 3: The Return of Worldender", "");

        e31.ver();
        e31.calificar(5);
        e32.ver();
        e32.calificar(4);
        e33.ver();
        e33.calificar(3);
        e34.ver();
        e34.calificar(2);

        Temporada t1 = new Temporada();
        t1.addEpisodio(e11);
        t1.addEpisodio(e12);
        t1.addEpisodio(e13);
        t1.addEpisodio(e14);

        Temporada t2 = new Temporada();
        t2.addEpisodio(e21);
        t2.addEpisodio(e22);
        t2.addEpisodio(e23);
        t2.addEpisodio(e24);

        Temporada t3 = new Temporada();
        t3.addEpisodio(e31);
        t3.addEpisodio(e32);
        t3.addEpisodio(e33);
        t3.addEpisodio(e34);

        Serie s = new Serie("Rick and Morty", "Serie animada", "Justin Roiland, Dan Hermon", "Ciencia ficcion");
        s.addTemporada(t1);
        s.addTemporada(t2);
        s.addTemporada(t3);

        System.out.println(s.toString());
        System.out.println("Calificacion Temporada 1: " + t1.calificacion());
        System.out.println("Calificacion Temporada 2: " + t2.calificacion());
        System.out.println("Calificacion Temporada 3: " + t3.calificacion());

        System.out.println("Calificacion Serie: " + s.calificacion());
        System.out.println("Episodios vistos de la serie: " + s.episodiosVistos());
        System.out.println("Serie finalizada: " + s.serieCompletada());
    }
}
