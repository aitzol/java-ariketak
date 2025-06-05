public class App {
   public static void main(String[] args) {
        CintaTransportadora cinta = new CintaTransportadora();

        System.out.println("--- Adding Products ---");
        cinta.agregarProducto("Caja A");
        cinta.agregarProducto("Caja B");
        cinta.agregarProducto("Caja C");
        System.out.println();

        System.out.println("--- Mostrar productos ---");
        cinta.mostrarCinta(); // Debería mostrar: Caja A, Caja B, Caja C
        System.out.println();

        System.out.println("--- Procesar productos ---");
        System.out.println("Procesando: " + cinta.procesarProducto()); // Caja A
        System.out.println("Procesando: " + cinta.procesarProducto()); // Caja B
        System.out.println();

        System.out.println("--- Mostrar estado despues de procesado ---");
        cinta.mostrarCinta();


    }
}
