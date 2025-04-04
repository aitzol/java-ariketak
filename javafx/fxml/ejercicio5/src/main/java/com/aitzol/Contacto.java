package com.aitzol;

import javafx.beans.property.SimpleStringProperty;

public class Contacto {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String telefono;

    public Contacto (String nombre, String apellido1, String apellido2, String dni, String telefono){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nNombre) {
        nombre = nNombre;
    }
        
    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String nApellido1) {
        apellido1 = nApellido1;
    }

    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String nApellido2) {
        apellido1 = nApellido2;
    }
    
    public String getDni() {
        return dni;
    }
    public void setDni(String nDni) {
        dni = nDni;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String nTelefono) {
        dni=nTelefono;
    }    
       

}
