package ejercicio1;

import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

    
        Desarrollador desarrollador = new Desarrollador("Pedro", "Desarrollo", 1500, "Java");
        Desarrollador desarrollador1 = new Desarrollador("Marta", "Desarrollo", 1500, "Java");
        Gerente gerente = new Gerente("Maria", "Gerencia", 2000, 500);

        empleados.add(desarrollador);
        empleados.add(desarrollador1);
        empleados.add(gerente);

        for (Empleado empleado : empleados) {
            empleado.mostrarDatos();
            System.out.println("--------------------");
        }
    
    }

}
