import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Coche coche1 = new Coche();
        Scanner sc = new Scanner(System.in);
        int velocidad = 0;
        do {
            System.out.println("Introduce valor: ");
            velocidad = sc.nextInt();
            if (velocidad > 0){
                coche1.acelera(velocidad);
                System.out.println("Velocidad actual: " + coche1.getVelocidad());
            } else {
                coche1.frena(Math.abs(velocidad));
                System.err.println("Velocidad actual: " + coche1.getVelocidad());
    
            }
        }while(velocidad!=0);
}
