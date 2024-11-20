import java.util.Scanner;    
public class App {
    static Scanner sc = new Scanner(System.in);
    public static int imprimirMenu(){
        int opcion;
        do{
            System.out.println("1. Cargar alumnos");
            System.out.println("2. Calcular media de hombres y numero total de alumnos > 165 cm");
            System.out.println("3. Imprimir todos los alumnos");
            System.out.println("4. Imprimir los datos de un alumno");
            System.out.println("0. Salir");
            System.out.println("Introduce una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            if(opcion < 0 || opcion > 4){
                System.out.println("Opción incorrecta");
                opcion = imprimirMenu();
            }
        } while (opcion < 0 || opcion > 4);
        return opcion;
    }
    public static Alumno[] cargarDatos(int numeroAlumnos){
        Alumno[] alumnos = new Alumno[numeroAlumnos];
        for(int i = 0; i < numeroAlumnos; i++){
            System.out.println("Introduce el nombre del alumno: ");
            String nombre = sc.nextLine();
            System.out.println("Introduce la edad del alumno: ");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce la altura del alumno: ");
            float altura = sc.nextFloat();
            sc.nextLine();
            System.out.println("Introduce peso del alumno: ");
            int peso = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce el sexo del alumno: ");
            String sexo = sc.nextLine();
            alumnos[i] = new Alumno(nombre, edad, sexo, peso, altura);
        }
        return alumnos;
    }
    public static void calcularMediaHombres(Alumno[] alumnos){
        int totalHombres = 0;
        int totalAlumnos = 0;
        float totalAltura = 0;
        float totalEdad = 0;
        for(int i = 0; i < alumnos.length; i++){
            if(alumnos[i].getSexo().equals("H")||alumnos[i].getSexo().equals("h")){
                totalHombres++;
                totalEdad += alumnos[i].getEdad();
            }
            if(alumnos[i].getAltura() > 1.65f){
                totalAlumnos++;
            }
        }
        System.out.println("La media de edad de los hombres es: " + totalEdad/totalHombres);
        System.out.println("El número total de alumnos con altura mayor a 165 cm es: " + totalAlumnos);
    }
    public static void imprimirAlumnos(Alumno[] alumnos){
        for(int i = 0; i < alumnos.length; i++){
            System.out.println(alumnos[i].toString());
        }
    }
    public static void imprimirAlumno(String nombre, Alumno[] alumnos){
        boolean encontrado = false;
        for(int i = 0; i < alumnos.length; i++){
            String nombreObjeto = alumnos[i].getNombre();

            if(nombreObjeto.toLowerCase().equals(nombre.toLowerCase())){
                System.out.println(alumnos[i].toString());
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Alumno no encontrado");
        }
    }
    public static void main(String[] args) throws Exception {
        
        // Imprimir menu
        // Dependiendo de la opción del menu ejecutar una acción correspondiente
        // 1. Cargar alumnos
        // 2. Calcular media de hombres y numero total de alumnos > 165 cm
        // 3. Imprimir todos los alumnos
        // 4. Imprimir los datos de un alumno
        // 0. Salir       
        
        int numeroAlumnos;
        int opcion;
        Alumno[] alumnos = null;        
        do{
            opcion = imprimirMenu();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el número de alumnos: ");
                    numeroAlumnos = sc.nextInt();
                    sc.nextLine();
                    alumnos = cargarDatos(numeroAlumnos);
                    break;
                case 2:
                    if(alumnos == null){
                        System.out.println("Introduce el número de alumnos: ");
                        numeroAlumnos = sc.nextInt();
                        sc.nextLine();
                        alumnos = cargarDatos(numeroAlumnos);
                    }
                    calcularMediaHombres(alumnos);
                    break;
                case 3:
                    imprimirAlumnos(alumnos);
                    break;
                case 4:
                    System.out.println("Introduce el nombre del alumno: ");
                    String nombre = sc.nextLine();
                    imprimirAlumno(nombre, alumnos);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
    }
}
