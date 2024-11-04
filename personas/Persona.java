public class Persona {
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private boolean Casado;
    private String numeroDocumentoIdentidad;

    public String getNombre(){
        return this.Nombre;
    }

    public String getApellidos(){
        return this.Apellidos;
    }

    public int getEdad(){
        return this.Edad;
    }

    public boolean getCasado(){
        return this.Casado;
    }

    public String getNumeroDocumentoIdedntidad(){
        return this.numeroDocumentoIdentidad;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos){
        this.Apellidos = Apellidos;
    }

    public void setEdad(int Edad){
        this.Edad = Edad;
    }

    public void setCasado(boolean Casado){
        this.Casado = Casado;
    }

    public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad){
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }
}


