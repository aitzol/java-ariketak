import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre: ");
        persona1.setNombre(sc.nextLine());
        System.out.println("Introduce apellidos: ");
        persona1.setApellidos(sc.nextLine());
        System.out.println("Introduce la edad: ");
        persona1.setEdad(sc.nextInt());
        // Los metodos tipo sc.nextInt, sc.nextBoolean no consumen el 
        // último salto de línea, por lo que falla a la hora de pedir
        // el siguiente string. Para solucionarlo hacemos una llamada
        // a sc.nextLine que consuma el salto de línea
        sc.nextLine();
        System.out.println("Introduce estado civil c/s: ");
        String casado = sc.nextLine();
        if (casado == "c"){
            persona1.setCasado(true);
        } else {
            persona1.setCasado(false);
        }
        //sc.nextLine();
        System.out.println("Introduce número de DNI: ");        
        persona1.setNumeroDocumentoIdentidad(sc.nextLine());
        
        // En este punto se deberían pedir también los datos al usuario
        // por simplificar se asignan a mano
        persona2.setNombre("Aitzol 2");
        persona2.setApellidos("Naberan 2");
        persona2.setEdad(27);
        persona2.setCasado(true);
        persona2.setNumeroDocumentoIdentidad("22222222J");
        
        
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Estado civil " + persona1.getCasado());
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println(persona2.getCasado());
        
        if (persona1.getEdad() > persona2.getEdad()){
            System.out.println("el mayor es " + persona1.getNombre() + " " + persona1.getApellidos());
        } else {
            System.out.println("el mayor es " + persona2.getNombre() + " " + persona2.getApellidos());
        }
    }
}
