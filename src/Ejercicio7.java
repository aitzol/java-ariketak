import java.util.Random;

public class Ejercicio7{
    public static int[] cargarTabla(int elementos, int max, int min){
        Random rd = new Random();
        int[] tabla = new int[elementos];
        for(int i=0;i<tabla.length;i++){
            tabla[i] = rd.nextInt(min, max+1);
        }
        return tabla;
    }
    public static int[] moverCerosFinal(int[] tabla){
        int x=0;
        for(int i=0; i<tabla.length; i++){
            tabla[x]=tabla[i];
            if(tabla[i]!=0){
                x++;
            }
        }
        for(int i=x; i<tabla.length; i++){
            tabla[i] = 0;
        }
        return tabla;
    }
    public static void mostrarTabla(int[] tabla){
        for(int elem:tabla){
            System.out.print(elem + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] taula = cargarTabla(20,1,0);
        mostrarTabla(taula);
        taula = moverCerosFinal(taula);
        mostrarTabla(taula);
    }
}