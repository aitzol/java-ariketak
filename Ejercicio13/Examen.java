public class Examen {
    private String NombreAsignatura;
    private String Aula;
    private Fecha fecha;
    private Hora hora;

    public Examen(String NombreAsignatura, String Aula, Fecha fecha, Hora hora){
        this.NombreAsignatura = NombreAsignatura;
        this.Aula = Aula;
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setNombre(String NombreAsignatura){
        this.NombreAsignatura = NombreAsignatura;
    }

    public void setAula(String Aula){
        this.Aula = Aula;
    }

    public void setFecha(Fecha fecha){
        this.fecha = fecha;
    }

    public void seteHora(Hora hora){
        this.hora = hora;
    }

    public String getNombre(){
        return this.NombreAsignatura;
    }

    public String getAula(){
        return this.Aula;
    }
    
    public Fecha getFecha(){
        return this.fecha;
    }
    
    public Hora getHora(){
        return this.hora;
    }

    public String toString(){
        return this.NombreAsignatura + "\t" + this.Aula + "\t" + this.fecha + "\t" + this.hora + "\n";
    }
}
