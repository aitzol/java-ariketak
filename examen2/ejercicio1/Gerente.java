package ejercicio1;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, String departamento, double salario, double bono) {
        super(nombre, departamento, salario);
        this.bono = bono;
    }

    public double calcularSalario() {
        return super.getSalario() + bono;
    }
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Salario total: " + calcularSalario());
    }

    public double getBono() {
        return bono;
    }

    public void setDepartamentoACargo(double bono) {
        this.bono = bono;
    }

}
