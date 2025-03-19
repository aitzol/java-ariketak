package ejercicio1;

public class Desarrollador extends Empleado{
    private String lenguajeProgramacion;

    public Desarrollador(String nombre, String departamento, double salario, String lenguajeProgramacion) {
        super(nombre, departamento, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Lenguaje de programación: " + lenguajeProgramacion);
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }
}
