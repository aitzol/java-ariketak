import java.util.Random;

public class NuevaPersona {

        private String Nombre;
        private String DNI;
        private int Edad;
        private String Sexo; // private char Sexo;
        private int Peso;
        private float Altura;

        private final String MUJER = "M"; 
        private final String HOMBRE = "H";

        public NuevaPersona(){
            Sexo = MUJER;
            DNI = generarDNI();
        }

        public NuevaPersona(String Nombre, int Edad, String Sexo){
            this.Nombre = Nombre;
            this.Edad = Edad;
            this.Sexo = comprobarSexo(Sexo);
            this.DNI = generarDNI();
        }

        public NuevaPersona(String Nombre, int Edad, String Sexo, int Peso, float Altura){
            this.Nombre = Nombre;
            this.DNI = generarDNI();
            this.Edad = Edad;
            this.Sexo = comprobarSexo(Sexo);
            this.Peso = Peso;
            this.Altura = Altura;
        }

        // Metodos de acceso para cambiar el valor de los atributos
        public void setNombre(String Nombre){
            this.Nombre = Nombre;
        }
        public void setEdad(int Edad){
            this.Edad = Edad;
        }
        public void setSexo(String Sexo){
            this.Sexo = comprobarSexo(Sexo);
        }   
        public void setPeso(int Peso){
            this.Peso = Peso;
        }
        public void setAltura(float Altura){
            this.Altura = Altura;
        }
        // Metodos de acceso para obtener el valor de los atributos
        public String getNombre(){
            return Nombre;
        }
        public String getDNI(){
            return DNI;
        }
        public int getEdad(){
            return Edad;
        }
        public String getSexo(){
            return Sexo;
        }
        public int getPeso(){
            return Peso;
        }
        public float getAltura(){
            return Altura;
        }

        public int calcularIMC(){
            double imc = Peso / (Altura * Altura);
            int returnValue = 0;
           if (imc < 20){
            returnValue = -1;
           } else if ( imc > 25){
            returnValue = 1;
           }
           return returnValue;
        }

        public boolean esMayorDeEdad(){
            if (Edad >= 18){
                return true;
            } else {
                return false;
            }
            // return Edad >= 18;
        }

        private String comprobarSexo(String sexo){
            if (sexo == "H" || sexo == "M"){
                return sexo;
            } else {
                return "H";
            }
        }

        public String toString(){
            return  Nombre + " " + Edad + " " + DNI;
        }

        private String generarDNI(){
            Random random = new Random();
            char[] LETRAS_DNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 
                                              'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
            int numeroDNI = random.nextInt(100000000);
            char letra = LETRAS_DNI[numeroDNI % 23];
            // Con la funcion format de la clase string podemos formatear
            // la salida, en este caso se imprimiran siempre 8 digitos
            // rellenando con 0 desde la izquierda
            return String.format("%08d", numeroDNI) + letra;
        }
    }

