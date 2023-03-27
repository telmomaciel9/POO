package ficha3;

public class Circulo {
    private double x;
    private double y;
    private double raio;
    
    public Circulo(){
        y = 0;
        x = 0;
        raio = 0;
    }

    public Circulo(double xx, double yy, double raioo){
        this.x = xx;
        this.y = yy;
        this.raio = raioo;
    }

    public Circulo(Circulo c){
        x = c.getX();
        y = c.getY();
        raio = c.getRaio();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass() ){
            return false;
        }

        Circulo c = (Circulo)obj;
        return x == c.getX() && y == c.getY() && raio == c.getRaio();
    }

    @Override
    public String toString() {
        return "Circulo [x=" + x + ", y=" + y + ", raio=" + raio + "]";
    }

    public Circulo clone(){
        return new Circulo(this);
    }

    public void alteraCentro( double x, double y){
        this.x = x;
        this.y = y;
    }

    public double calculaArea(){
        return Math.PI * Math.pow(raio,2);
    }

    public double calculaPerimetro(){
        return 2 * Math.PI * raio;
    }

    
    
}
