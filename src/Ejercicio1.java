import java.util.Scanner;

public class Ejercicio1 {
    static Scanner scanner = new Scanner(System.in);
    public static int leerEdad() {

        int edad = 0;
        do {
            System.out.println("Ingrese su edad (entre 18 y 35): ");
            edad = scanner.nextInt();
            
        } while (!(edad >= 18 && edad <= 35));
        
        return edad;
    }
    public static double calcularMedia(int edades[]) {
        int suma = 0;
        for(int i = 0; i < edades.length; i++) {
            suma += edades[i];
        }
        return suma / edades.length;
    }
    public static void mostrarEdades(int edades[]) {
        for(int i = 0; i < edades.length; i++) {
            System.out.println("Edad " + (i + 1) + ": " + edades[i]);
        }
        System.err.println("La media de las edades es: " + calcularMedia(edades));
    }

    public static void main(String[] args) throws Exception {
        int edades [] = new int[10];
        for(int i = 0; i < edades.length; i++) {

            edades[i] = leerEdad();
        }
        mostrarEdades(edades);
        scanner.close();
    }
    }
   
