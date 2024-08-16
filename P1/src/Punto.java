public class Punto {
    private double x;
    private double y;

    public Punto(){
        this.x = 0;
        this.y = 0;
    }
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void desplazar(double x, double y){
        this.x = this.x + x;
        this.y = this.y + y;
    }

    public double distanciaEuclidea(Punto destino){
        return Math.sqrt(Math.pow((destino.getX()-this.x),2)+Math.pow((destino.getY()-this.y),2));
    }
}
