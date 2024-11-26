import java.util.Scanner;
public class App {
    public static Scanner sc = new Scanner(System.in);

    public static int getOpcionUsuario() {
        System.out.println("1. Crear array de examenes");
        System.out.println("2. Modificar fecha examen");
        System.out.println("3. Modificar aula de examen");
        System.out.println("4. Mostrar datos de examenes");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opcion: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static Examen[] crearArrayDeExamenes(){

    }

    public static void modificarFechaExamen(Examen[] examenes){

    }

    public static void modificarAulaExamen(Examen[] examen){

    }

    public static void mostrarDatosDeExamenes(Examen[] examenes){}
    public static void main(String[] args) throws Exception {
        Examen[] examenes = new Examen[5];

        int opcion;
        do{
            opcion = getOpcionUsuario();
            switch (opcion) {
                case 1:
                    examenes = crearArrayDeExamenes();
                    break;
                case 2:
                    modificarFechaExamen(examenes);
                    break;
                case 3:
                    modificarAulaExamen(examenes);
                    break;
                case 4:
                    mostrarDatosDeExamenes(examenes);
                    break;
                default:
                    break;
            }
        }  while (opcion != 0);      
    
    }
}
