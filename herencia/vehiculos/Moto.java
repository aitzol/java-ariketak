public class Moto extends Vehiculo{

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }
    public void arrancar() {
        System.out.println("La moto " + marca + " " + modelo + " está arrancando");
    }
}
