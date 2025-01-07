import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(new EmpleadoPorHoras("Juan", 1000, 40, 10));
        empleados.add(new EmpleadoTiempoCompleto("Pedro", 1000, 2000));
        empleados.add(new EmpleadoTiempoCompleto("Maria", 1000, 3000));
        empleados.add(new EmpleadoPorHoras("Ana", 1000, 30, 15));

        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + " gana " + empleado.calcularSalario());
        }

    }
}
