import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(new Coche("Ford", "Fiesta"));
        vehiculos.add(new Moto("Yamaha", "FZ6"));
        vehiculos.add(new Coche("Renault", "Clio"));
        vehiculos.add(new Moto("Honda", "CBR600"));
        
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.arrancar();
        }
    }
}
