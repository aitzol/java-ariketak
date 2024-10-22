import java.util.Random;

public class Ejercicio4 {
    public static String[] cargarArrayNombres(){
        String nombres[] = new String[10];
        nombres[0] = "Juan";
        nombres[1] = "Pedro";
        nombres[2] = "Maria";
        nombres[3] = "Jose";
        nombres[4] = "Ana";
        nombres[5] = "Lucia";
        nombres[6] = "Carlos";
        nombres[7] = "Luis";
        nombres[8] = "Sofia";
        nombres[9] = "Laura";
        return nombres;
    }

    public static int[] cargarArrayNotas(){
        Random rd = new Random();
        int notas[] = new int[10];
        for(int i = 0; i < notas.length; i++){
            notas[i] = rd.nextInt(11);
        }
        return notas;
    }
    public static int[] calcularDatos(int[] notas){
        int min = 11;
        int suma = 0;
        int indice_min = 0;
        int maximo = 0;
        int indice_max = 0;
        for(int i = 0; i < notas.length; i++){
            if(notas[i] < min){
                min = notas[i];
                indice_min = i;
            }
            if(notas[i] > maximo){
                maximo = notas[i];
                indice_max = i;
            }
            suma += notas[i];
        }
        int [] datos = {min, indice_min, suma, suma/notas.length, maximo, indice_max};
        return datos;
    }
    public static void mostrarEstadisticas(String[] nombres, int[] datos){
        System.out.println("Nombre de la persona con la nota más baja: " + nombres[datos[1]]);
        System.out.println("Promedio de notas: " + datos[3]);
        System.out.println("Nombre de la persona con la nota más alta: " + nombres[datos[5]]);
    }
    public static void main(String[] args) {
        String nombre [] = new String[10];
        int notas [] = new int[10];
        int datos [] = new int[6]; 
        nombre = cargarArrayNombres();
        notas = cargarArrayNotas();
        datos = calcularDatos(notas);
        for(int i = 0; i < nombre.length; i++){
            System.out.println("Nombre: " + nombre[i] + " Nota: " + notas[i]);
        }
        mostrarEstadisticas(nombre, datos);

    } 
}
