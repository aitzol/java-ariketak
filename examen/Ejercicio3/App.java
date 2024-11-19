class App{

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 25);
        persona.presentarse();
        if (persona.esMayorDeEdad()==true) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
    }
}