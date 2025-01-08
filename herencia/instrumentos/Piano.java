public class Piano implements Instrumento {
    @Override
    public void afinar() {
        System.out.println("Afinando el piano");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando el piano");
    }

}
