import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // para consumir el salto de línea
        System.out.println("Introduce sexo: ");
        String sexo = sc.nextLine();
        System.out.println("Introduce altura: ");
        float altura = sc.nextFloat();
        sc.nextLine(); // para consumir el salto de línea
        System.out.println("Introduce peso: ");
        int peso =sc.nextInt();

        // Utilizamos el constructor con todos los parámetros
        NuevaPersona persona1 = new NuevaPersona(nombre, edad, sexo, peso, altura);
        // Utilizamos el constructor con nombre, edad y sexo
        NuevaPersona persona2 = new NuevaPersona(nombre, edad, sexo);
        // Utilizamos el constructor por defecto
        NuevaPersona persona3 = new NuevaPersona();
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setAltura(altura);
        persona3.setPeso(peso);

        if (persona1.calcularIMC() == 0){
            System.out.println("La persona 1 está en su peso ideal");
        } else {
            System.out.println("La persona 1 no está en su peso ideal");
        }
        if (persona2.calcularIMC() == 0){
            System.out.println("La persona 2 está en su peso ideal");
        } else {
            System.out.println("La persona 2 no está en su peso ideal");
        }
        if (persona3.calcularIMC() == 0){
            System.out.println("La persona 3 está en su peso ideal");
        } else {
            System.out.println("La persona 3 no está en su peso ideal");
        }

        System.out.println("Persona 1 es mayor de edad: " + persona1.esMayorDeEdad());  
        System.out.println("Persona 2 es mayor de edad: " + persona2.esMayorDeEdad());  
        System.out.println("Persona 3 es mayor de edad: " + persona3.esMayorDeEdad());  

        System.out.println(persona1); // Llama al método toString internamente
        System.out.println(persona2); // Llama al método toString internamente
        System.out.println(persona3); // Llama al método toString internamente            

    }
}
