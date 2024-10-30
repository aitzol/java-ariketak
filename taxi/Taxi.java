public class Taxi {
    private String Provincia;
    private String Matricula;
    private String Municipio;
    private int Motor;

    public Taxi(String Matricula){
        this.Matricula = Matricula;
    }

    public void setProvincia(String Provincia){
        this.Provincia = Provincia;
    }

    public void setMatricula(String Matricula){
        this.Matricula = Matricula;
    }

    public void setMunicipio(String Municipio){
        this.Municipio =  Municipio;
    }

    public void setMotor(int Motor){        
        this.Motor = Motor;
    }

    public String getProvincia(){
        return this.Provincia;
    }

    public String getMatricula(){
        return this.Matricula;
    }

    public String getMunicipio(){
        return this.Municipio;
    }

    public int getMotor(){
        return this.Motor;
    }
}
