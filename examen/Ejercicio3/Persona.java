class Persona {

    private String nombre;
    private int edad;


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public boolean esMayorDeEdad() {
        if(this.edad >= 18) {
            return true;
        } else {
            return false;
        }   
        //return this.edad >= 18;
    }
    public void presentarse(){
        System.out.println("Hola, soy " + this.nombre + " y tengo " + this.edad + " años");
    }
}