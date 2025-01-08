import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Instrumento> instrumentos = new ArrayList<Instrumento>();
        instrumentos.add(new Guitarra());
        instrumentos.add(new Piano());
        for (Instrumento instrumento : instrumentos) {
            instrumento.afinar();
            instrumento.tocar();
        }
    }
}
