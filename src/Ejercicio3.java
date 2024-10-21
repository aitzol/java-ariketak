import java.util.Random;

public class Ejercicio3 {

    public static int [] cargaTabla(int tamaño, int valorMin, int valorMax){
        int tabla[] = new int[tamaño];
        Random random = new Random();
        for(int i = 0; i < tabla.length; i++){
            tabla[i] = random.nextInt(valorMin, valorMax + 1);       }
        return tabla;
    }

    public static void mostrarFrecuencias(int tabla[]){
        int counter[] = {0,0,0,0,0,0,0,0,0};
        for(int i = 0; i < tabla.length; i++){
            counter[tabla[i] - 1]++;
        }
        System.out.println("Frecuencias: ");
        mostrarArray(counter);
    }

    public static void mostrarArray(int tabla[]){
        for(int i = 0; i < tabla.length; i++){
            System.out.println("Elemento " + (i + 1) + ": " + tabla[i]);
        }

    }
    public static void main(String[] args) {
        /*Cargar una tabla de 20 elementos donde cada elemento almacenará un valor
entre 1 y 9 (genéralos de forma aleatoria) y escribir, además del contenido de
la tabla, la cantidad de 1, cantidad de 2, cantidad de 3…, cantidad de 9
almacenados en ella.*/
        int tabla[] = cargaTabla(20, 1, 9);
        mostrarArray(tabla);
        mostrarFrecuencias(tabla);
    }
}
