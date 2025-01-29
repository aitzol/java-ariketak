import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantWriter {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ArrayList<String []> restaurantesLista = new ArrayList<>();
        String[] linea;
        File restaurantes = new File("restaurantes.csv");
        FileReader f = new FileReader(restaurantes);

        try(BufferedReader b = new BufferedReader(f)){
        System.out.println("Cargando restaurantes restaurantes.csv");
        String data;
        while ((data = b.readLine())!=null) {
            linea = data.split(",");
            restaurantesLista.add(linea);
            }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    boolean salir = false;
    while (salir == false){
        System.out.println("1 - Agregar restaurante");
        System.out.println("0 - Guardar y salir");
        int opcion = sc.nextInt();
        sc.nextLine();
        if (opcion == 1){
            System.out.println("Ingrese el codigo del restaurante");
            String nombre = sc.nextLine();
            System.out.println("Ingrese nombre del restaurante");
            String direccion = sc.nextLine();
            System.out.println("Ingrese la calle del restaurante");
            String calle = sc.nextLine();
            System.out.println("Ingrese el numero de la calle del restaurante");
            String numero = sc.nextLine();
            System.out.println("Ingrese el distrito del restaurante");
            String distrito = sc.nextLine();
            System.out.println("Ingrese el codigo postal del restaurante");
            String cp = sc.nextLine();
            System.out.println("Ingrese la ciudad del restaurante");
            String ciudad = sc.nextLine();
            System.out.println("Ingrese el telefono del restaurante");
            String telefono = sc.nextLine();
            String[] nuevoRestaurante = {nombre, direccion, telefono, direccion, calle, numero, distrito, cp, ciudad};
            restaurantesLista.add(nuevoRestaurante);
        } else if (opcion == 0){
            salir = true;
        }
    }   
    try {
        FileWriter fw = new FileWriter(restaurantes);
        BufferedWriter bw = new BufferedWriter(fw);
        for (String[] restaurante : restaurantesLista){
            bw.write(String.join(",", restaurante));
            bw.newLine();
        }
        bw.close();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    
    }
}
}
