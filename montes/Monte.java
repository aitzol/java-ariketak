public class Monte {
    private String Nombre;
    private String Provincia;
    private int Altura;
    private String Coordenadas;
    private String Macizo;
    private String Ruta;

    public Monte(String nombre, String provincia, int altura, String coordenadas, String macizo, String ruta) {
        Nombre = nombre;
        Provincia = provincia;
        Altura = altura;
        Coordenadas = coordenadas;
        Macizo = macizo;
        Ruta = ruta;
    }

    public Monte(String[] monteTemp) {
        Nombre = monteTemp[0];
        Provincia = monteTemp[1];
        Altura = Integer.parseInt(monteTemp[2]);
        Coordenadas = monteTemp[3];
        Macizo = monteTemp[4];
        Ruta = monteTemp[5];
    }
    
    public String getNombre() {
        return Nombre;
    }

    public String getProvincia() {
        return Provincia;
    }   

    public int getAltura() {
        return Altura;
    }   

    public String getCoordenadas() {
        return Coordenadas;
    }

    public String getMacizo() {
        return Macizo;
    }

    public String getRuta() {
        return Ruta;
    }
    
    public String toString() {
        return Nombre + "\t" + Provincia + "\t" + Altura + "\t" + Coordenadas + "\t" + Macizo + "\t" + Ruta;
    }
}   
