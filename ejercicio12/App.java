import java.util.Scanner;
public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Ingrese los datos del examen");
        System.out.println("Nombre de la asignatura: ");   
        String NombreAsignatura = sc.nextLine();
        System.out.println("Aula: ");
        String Aula = sc.nextLine();
        System.out.println("Fecha: ");
        System.out.println("Dia: ");
        int day = sc.nextInt();
        sc.nextLine();
        System.out.println("Mes: ");
        int month = sc.nextInt();
        sc.nextLine();
        System.out.println("Año: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.println("Hora: ");
        int hora = sc.nextInt();
        sc.nextLine();
        System.out.println("Minutos: ");
        int minutos = sc.nextInt();
        sc.nextLine();System.err.println();

        Fecha fecha = new Fecha(day, month, year);
        Hora horaExamen = new Hora(hora, minutos);

        Examen examen = new Examen(NombreAsignatura, Aula, fecha, horaExamen);

        System.out.println("EXAMEN");
        System.out.println("Nombre \t Aula \t Fecha \t Hora");
        System.out.println(examen);


        
    }
}
