package ejercicio4;

import java.util.Scanner;

public class App {

    public static void imprimirProductos(Producto[] productos) {
        for (Producto p : productos) {
            System.out.println(p.getNombre() + " - " + p.getPrecio());
        }
    }

    public static void ordenarProductosPorPrecio(Producto[] productos) {
        for (int i = 0; i < productos.length - 1; i++) {
            for (int j = 0; j < productos.length - i - 1; j++) {
                if (productos[j].getPrecio() > productos[j + 1].getPrecio()) {
                    Producto temp = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = temp;
                }
            }
        }
    }

    public static void buscarProductoPorNombre(Producto[] productos, String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equals(nombre)) {
                System.out.println(p.getNombre() + " - " + p.getPrecio());
                return;
            }
        }
        System.out.println("Producto no encontrado");
    }
    public static void main(String[] args) {
        Producto[] productos = {
            new Producto(1, "Manzana", 1.50),
            new Producto(2, "Banana", 0.99),
            new Producto(3, "Cereza", 2.50),
            new Producto(4, "Dátil", 3.00),
            new Producto(5, "Uva", 2.20),
            new Producto(6, "Higo", 4.10),
            new Producto(7, "Kiwi", 2.00),
            new Producto(8, "Limon", 1.30),
            new Producto(9, "Mango", 3.50),
            new Producto(10, "Naranja", 1.80)
        };

        System.out.println("Lista de productos antes de ordenar:");
        imprimirProductos(productos);

        ordenarProductosPorPrecio(productos);

        System.out.println("\nLista de productos después de ordenar:");
        imprimirProductos(productos);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese el nombre del producto a buscar: ");
        String nombreBuscado = scanner.nextLine();
        buscarProductoPorNombre(productos, nombreBuscado);

    }
}
