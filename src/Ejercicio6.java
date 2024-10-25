import java.util.Random;

public class Ejercicio6 {

    // Método para cargar un array con n elementos aleatorios entre valorMin y valorMax
    public static int[] cargarTabla(int n, int valorMin, int valorMax) {
        Random random = new Random();
        int[] array = new int[n];
        
        // Generamos valores aleatorios entre valorMin y valorMax y los almacenamos en el array
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(valorMin, valorMax + 1);
        }
        
        return array;
    }

    // Método para invertir el contenido de un array (sin utilizar un array auxiliar)
    public static void invertirArray(int[] array) {
        int n = array.length;
        // Intercambiamos elementos desde los extremos hacia el centro
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];  // Guardamos el valor temporalmente
            array[i] = array[n - i - 1];  // Intercambiamos los extremos
            array[n - i - 1] = temp;  // Colocamos el valor temporal en su nuevo lugar
        }
    }

    // Método para mostrar el contenido de un array en pantalla
    public static void mostrarArray(int[] array) {
        // Contamos cuántas veces aparece cada letra
        // Usando una estructura for-each para recorrer el array
        // es más sencillo que usar un bucle for tradicional
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();  // Hacemos un salto de línea al final
    }

    public static void main(String[] args) {
        int n = 20;  // Número de elementos en el array
        int valorMin = 1;  // Valor mínimo para los números aleatorios
        int valorMax = 100;  // Valor máximo para los números aleatorios

        // Cargar el array con valores aleatorios
        int[] tabla = cargarTabla(n, valorMin, valorMax);

        // Mostrar el array original
        System.out.println("Array original:");
        mostrarArray(tabla);

        // Invertir el array
        invertirArray(tabla);

        // Mostrar el array invertido
        System.out.println("Array invertido:");
        mostrarArray(tabla);
    }
}
