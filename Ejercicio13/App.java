import java.util.Scanner;
public class App {
    public static Scanner sc = new Scanner(System.in);

    public static int getOpcionUsuario() {
        int seleccion;
        do{
        System.out.println("1. Crear array de examenes");
        System.out.println("2. Modificar fecha examen");
        System.out.println("3. Modificar aula de examen");
        System.out.println("4. Mostrar datos de examenes");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opcion: ");
        seleccion = sc.nextInt();
        sc.nextLine();
        } while (seleccion < 0 || seleccion > 4);
        return seleccion;
    }

    public static Examen[] crearArrayDeExamenes(){
        Examen[] examenes = new Examen[5];
        for (int i = 0; i < examenes.length; i++) {
            System.out.println("Ingrese el nombre del examen: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese la fecha del examen: ");
            System.out.println("Ingrese el día del examen: ");
            int dia = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el mes del examen: ");
            int mes = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el año del examen: ");
            int year = sc.nextInt();           
            sc.nextLine();
            System.out.println("Ingrese la hora del examen: ");
            int hora = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el minuto del examen: ");
            int minuto = sc.nextInt();
            sc.nextLine();  
            Fecha fecha = new Fecha(dia, mes, year);
            Hora nuevaHora = new Hora(hora, minuto);
            System.out.println("Ingrese el aula del examen: ");
            String aula = sc.nextLine();
            examenes[i] = new Examen(nombre, aula, fecha, nuevaHora);
        }
        return examenes;

    }

    public static void modificarFechaExamen(Examen[] examenes, String Asignatura){
        for(int i = 0; i < examenes.length; i++){
            if(examenes[i].getNombre().equalsIgnoreCase(Asignatura)){
                System.out.println("Ingrese el nuevo día del examen: ");
                int dia = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese el nuevo mes del examen: ");
                int mes = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese el nuevo año del examen: ");
                int year = sc.nextInt();
                sc.nextLine();
                Fecha nuevaFecha = new Fecha(dia, mes, year);
                examenes[i].setFecha(nuevaFecha);
            }
        }

    }

    public static void modificarAulaExamen(Examen[] examenes, String Asignatura){    
        for(int i = 0; i < examenes.length; i++){
            if(examenes[i].getNombre().equalsIgnoreCase(Asignatura)){
                System.out.println("Ingrese el nuevo aula del examen: ");
                String nuevoAula = sc.nextLine();
                examenes[i].setAula(nuevoAula);
            }
        }
    }

    public static void mostrarDatosDeExamenes(Examen[] examenes){
        System.out.println("Datos de los examenes: ");
        System.out.println("Nombre\tAula\tFecha\tHora");
        for (int i = 0; i < examenes.length; i++) {
            System.out.println(examenes[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        Examen[] examenes = new Examen[5];

        int opcion;
        String asignatura;
        do{
            opcion = getOpcionUsuario();
            switch (opcion) {
                case 1:
                    examenes = crearArrayDeExamenes();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la asignatura: ");
                    asignatura = sc.nextLine();
                    modificarFechaExamen(examenes, asignatura);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre de la asignatura: ");
                    asignatura = sc.nextLine();
                    modificarAulaExamen(examenes, asignatura);
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
