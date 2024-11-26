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
    
    public void mueveDerecha(double x){
        this.x += x;
    }

    public void mueveIzquierda(double x){
        this.x -= x;
    }

    public void mueveArriba(double y){
        this.y += y;
    }

    public void mueveAbajo(double y){
        this.y -= y;
    }   

    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
}












