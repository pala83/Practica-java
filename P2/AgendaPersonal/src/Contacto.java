public class Contacto {
    private String nombre;
    private String telefono;
    private String mail;

    public Contacto(String nombre, String telefono, String mail){
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
    }

    public Contacto(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = "";
    }

    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getMail() {
        return mail;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object obj) {
        Contacto c = (Contacto)obj;
        return c.getNombre().equals(this.nombre) &&
        c.getTelefono().equals(this.telefono) &&
        c.getMail().equals(this.mail);
    }

    @Override
    public String toString() {
        String retorno = this.nombre + "\t| " + this.telefono + "\t| " + this.mail + "\n";
        return retorno;
    }
}
