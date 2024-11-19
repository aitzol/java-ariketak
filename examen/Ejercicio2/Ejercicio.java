import java.util.Scanner;
class Ejercicio {
    Scanner sc = new Scanner(System.in);

    public static int[] pideDatos() {
        int[] datos = new int[10];
        for(int i=0; i<datos.length; i++) {
            System.out.print("Introduce un número: ");
            datos[i] = sc.nextInt();
        }
        return datos;
    }
    public static int maximo(int[] datos) {
        int max = datos[0];
        for(int i=1; i<datos.length; i++) {
            if(datos[i] > max) {
                max = datos[i];
            }
        }
        return max;
    }
    public static int minimo(int[] datos) {
        int min = datos[0];
        for(int i=1; i<datos.length; i++) {
            if(datos[i] < min) {
                min = datos[i];
            }
        }
        return min;
    }
    public static float media(int[] datos) {
        float suma = 0;
        for(int i=0; i<datos.length; i++) {
            suma += datos[i];
        }
        return suma / datos.length;
    }

    public static void muestraResultados(int[] datos) {
        System.out.println("Los datos introducidos son: ");
        for(int i=0; i<datos.length; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println("El máximo es: " + maximo(datos));
        System.out.println("El mínimo es: " + minimo(datos));
        System.out.println("La media es: " + media(datos));
    }
    public static void main(String[] args) {
        int[] datos = pideDatos();
        int max = maximo(datos);
        int min = minimo(datos);
        float med = media(datos);
        muestraResultados(datos);
    }
}