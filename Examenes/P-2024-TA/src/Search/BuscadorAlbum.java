package Search;

import Classes.Figurita;

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
