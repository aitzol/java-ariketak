public class Guitarra implements Instrumento, Prestable {
    private boolean prestada;

    public Guitarra() {
        this.prestada = false;
    }

    @Override
    public void afinar() {
        System.out.println("Afinando la guitarra");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando la guitarra");
    }

    @Override
    public void prestar() {
        this.prestada = true;
    }

    @Override
    public void devolver() {
        this.prestada = false;
    }

    @Override
    public boolean prestado() {
        return this.prestada;
    }

}
