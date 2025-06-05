import java.util.ArrayList;
import java.util.List; // Using List interface for ArrayList

public class CintaTransportadora {

    // Atributos: Un contenedor para almacenar productos (representaremos el producto con Strings).
    private List<String> productos; 

    public CintaTransportadora() {
        this.productos = new ArrayList<>();
    }

    
    //Añade un nuevo producto al final de la cinta.
    public void agregarProducto(String producto) {
        productos.add(producto); // Añadir al final del array list
    }

    
    // Quita y devuelve el producto que está al frente de la cinta (FIFO).
    // Si no hay productos, devuelve un String nulo (null).
    public String procesarProducto() {
        if (productos.isEmpty()) {
            return null;
        }
        return productos.remove(0); // Removes the element at index 0 and shifts subsequent elements left.
    }

    // Muestra todos los productos en orden de llegada.
    public void mostrarCinta() {
        if (productos.isEmpty()) {
            System.out.println("La cinta está vacia.");
            return;
        }
        System.out.print("Productos en la cinta: ");
        for (String producto : productos) {
            System.out.println(producto);
        }
        
    }
}