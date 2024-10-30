public class App {
    public static void main(String[] args) throws Exception {
        Taxi taxi1 = new Taxi();
        taxi1.setMatricula("0000JJJ");
        taxi1.setProvincia("Gipuzkoa");
        taxi1.setMunicipio("Usurbil");
        taxi1.setMotor(2);

        System.out.println("El taxi " + taxi1.getMatricula() + " está en " + taxi1.getMunicipio() + "(" + taxi1.getProvincia() + ") y el motor es " + taxi1.getMotor());
    }
}
