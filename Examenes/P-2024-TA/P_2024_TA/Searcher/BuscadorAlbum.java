package P_2024_TA.Searcher;

import P_2024_TA.Classes.Figurita;

public class BuscadorAlbum implements Buscador{
    private String album;

    public BuscadorAlbum(String album){
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public boolean buscar(Figurita f) {
        return f.getAlbum().equals(this.album);
    }
}
