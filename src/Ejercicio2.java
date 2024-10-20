public class Ejercicio2 {
    public static int aleatorio(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }           
    public static int[] cargarTabla(int n) {
        int tabla[] = new int[n];
        for(int i = 0; i < tabla.length; i++) {
            tabla[i] = aleatorio(1, 100);
        }
        return tabla;
    }
    public static double sumarPares(int tabla[]) {
        double suma = 0;
        for(int i = 0; i < tabla.length; i++) {
            if(tabla[i] % 2 == 0) {
                suma += tabla[i];
            }
        }
        return suma;
    }
    public static double productoImpares(int tabla[]) {
        double producto = 1;
        for(int i = 0; i < tabla.length; i++) {
            if(tabla[i] % 2 != 0) {
                producto *= tabla[i];
            }
        }
        return producto;
    }
    public static void imprimirDatos(int tabla[], double pares, double impares) {
        for(int i = 0; i < tabla.length; i++) {
            System.out.println("Dato " + i + ": " + tabla[i]);
        }
        System.out.println("Suma de los pares: " + pares);
        System.out.println("Producto de los impares: " + impares);
    }
    public static void main(String[] args) throws Exception {
        int datos [] = cargarTabla(20);
        imprimirDatos(datos, sumarPares(datos), productoImpares(datos));
    }
}
