public class Coche [
    private int velocidad;
    public Coche() {
        velocidad=0;
    }

    public int getVelocidad(){
        return this.velocidad;
    }

    public void acelera(int incremento){
        this.velocidad += incremento;
    }

    public void frena(int decremento){
        this.velocidad -= decremento;
    }
}