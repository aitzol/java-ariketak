import java.util.Random;

public class Ejercicio5 {

    // Generar sorteo: devuelve un array con numTiradas números aleatorios entre valorMin y valorMax
    public static char[] generarSorteo(int numTiradas, char valorMin, char valorMax) {
        Random random = new Random();
        char[] sorteo = new char[numTiradas];
        
        // Rellenamos el array con letras aleatorias entre valorMin y valorMax
        for (int i = 0; i < numTiradas; i++) {
            sorteo[i] = (char) (random.nextInt(valorMax - valorMin + 1) + valorMin);
        }
        
        return sorteo;
    }

    // Mostrar sorteo: muestra en pantalla el contenido del array en 15 columnas
    public static void mostrarSorteo(char[] arraySorteo) {
        int contador = 0;
        // Contamos cuántas veces aparece cada letra
        // Usando una estructura for-each para recorrer el array
        // es más sencillo que usar un bucle for tradicional
        for (char letra : arraySorteo) {
            System.out.print(letra + " ");
            contador++;
            if (contador % 15 == 0) {  // Cada 15 letras hacemos un salto de línea
                System.out.println();
            }
        }
        System.out.println();  // Nueva línea después de mostrar el sorteo completo
    }

    // Contar frecuencias: genera un array con los contadores de las frecuencias de cada letra
    public static int[] contarFrecuencias(char[] arraySorteo, char valorMin, char valorMax) {
        int[] frecuencias = new int[valorMax - valorMin + 1];
        
        // Contamos cuántas veces aparece cada letra
        // Usando una estructura for-each para recorrer el array
        // es más sencillo que usar un bucle for tradicional
        for (char letra : arraySorteo) {
            frecuencias[letra - valorMin]++;
        }
        
        return frecuencias;
    }

    // Mostrar frecuencias: muestra en pantalla las frecuencias de cada letra
    public static void mostrarFrecuencias(int[] arrayFrecuencias, char valorMin, char valorMax) {
        for (int i = 0; i < arrayFrecuencias.length; i++) {
            char letra = (char) (valorMin + i);
            System.out.println("Letra " + letra + ": " + arrayFrecuencias[i] + " apariciones");
        }
    }

    public static void main(String[] args) {
        int numTiradas = 100;   // Número de tiradas (simulaciones)
        char valorMin = 'a';    // Valor mínimo (letra 'a')
        char valorMax = 'z';    // Valor máximo (letra 'z')

        // Generamos el sorteo
        char[] sorteo = generarSorteo(numTiradas, valorMin, valorMax);

        // Mostramos el sorteo en 15 columnas
        System.out.println("Sorteo de letras:");
        mostrarSorteo(sorteo);

        // Contamos las frecuencias de cada letra
        int[] frecuencias = contarFrecuencias(sorteo, valorMin, valorMax);

        // Mostramos las frecuencias de las letras
        System.out.println("\nFrecuencia de letras:");
        mostrarFrecuencias(frecuencias, valorMin, valorMax);
    }
}
