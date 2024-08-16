public class Rectangulo {
    private Punto p1;
    private Punto p2;
    private Punto p3;
    private Punto p4;

    public Rectangulo(Punto p1, Punto p2){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = new Punto(p1.getX(), p2.getY());
        this.p4 = new Punto(p2.getX(), p1.getY());
    }
    
    public void desplazar(double x, double y){
        this.p1.desplazar(x, y);
        this.p2.desplazar(x, y);
        this.p3.desplazar(x, y);
        this.p4.desplazar(x, y);
    }

    public double ancho(){
        return Math.abs(this.p2.getX()-this.p1.getX());
    }
    public double alto(){
        return Math.abs(this.p2.getY()-this.p1.getY());
    }

    public double area(){
        return this.ancho()*this.alto();
    }
    public int compararArea(Rectangulo otro){
        int retorno = 0;
        retorno = this.area()<otro.area() ? 1 : -1;
        return retorno;
    }
    public boolean esCuadrado(){
        return (this.ancho()==this.alto());
    }
    public boolean estaAcostado(){
        return this.ancho()>this.alto();
    }
    
}
