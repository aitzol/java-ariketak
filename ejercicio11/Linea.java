public class Linea {

    private Punto puntoA;
    private Punto puntoB;

    public Linea(){
        this.puntoA = new Punto();
        this.puntoB = new Punto();
    }

    public Linea(Punto puntoA, Punto puntoB){
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }
    
    public void mueveDerecha(double x){
        this.puntoA.mueveDerecha(x);
        this.puntoB.mueveDerecha(x);
    }

    public void mueveIzquierda(double x){
        this.puntoA.mueveIzquierda(x);
        this.puntoB.mueveIzquierda(x);
    }

    public void mueveArriba(double y){
        this.puntoA.mueveArriba(y);
        this.puntoB.mueveArriba(y);
    }

    public void mueveAbajo(double y){
        this.puntoA.mueveAbajo(y);
        this.puntoB.mueveAbajo(y);
    }

    public String toString(){
        return "[" + this.puntoA.toString() + ", " + this.puntoB.toString() + "]";
    }
}