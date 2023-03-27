package ficha3;
import java.awt.Point;

public class Triangulo {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangulo(){
        p1 = new Point();
        p2 = new Point();
        p3 = new Point();
    }

    public Triangulo(Point a, Point b, Point c){
        this.p1 = a;
        this.p2 = b;
        this.p3 = c;
    }
    
    public Triangulo(Triangulo t){
        this.p1 = t.getP1();
        this.p2 = t.getP2();
        this.p3 = t.getP3();
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Triangulo other = (Triangulo) obj;
        if (p1 == null) {
            if (other.p1 != null)
                return false;
        } else if (!p1.equals(other.p1))
            return false;
        if (p2 == null) {
            if (other.p2 != null)
                return false;
        } else if (!p2.equals(other.p2))
            return false;
        if (p3 == null) {
            if (other.p3 != null)
                return false;
        } else if (!p3.equals(other.p3))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Triangulo [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + "]";
    }

    public Triangulo clone(){
        return new Triangulo(this);
    }
    
}
