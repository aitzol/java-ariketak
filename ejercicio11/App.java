public class App {
    public static void main(String[] args) throws Exception {
        Linea linea1 = new Linea();
        Punto p1 = new Punto(6,7);
        Punto p2 = new Punto(3,4);
        Linea linea2 = new Linea(p1,p2);

        linea2.mueveAbajo(1);
        System.out.println(linea2.toString());
        linea2.mueveDerecha(1);
        System.out.println(linea2.toString());
        linea2.mueveArriba(1);
        System.out.println(linea2.toString());
        linea2.mueveIzquierda(1);
        System.out.println(linea2.toString());
    }
}
