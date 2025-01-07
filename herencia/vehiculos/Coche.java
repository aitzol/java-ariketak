public class Coche extends Vehiculo{
    
    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }
    public void arrancar() {
        System.out.println("El coche " + marca + " " + modelo + " está arrancando");
    }

}
