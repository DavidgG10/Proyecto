/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mikeu
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private String tipomebresia;

    public Persona(String nombre, String apellido, int edad, String cedula, 
            String tipomebresia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.tipomebresia = tipomebresia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipomebresia() {
        return tipomebresia;
    }

    public void setTipomebresia(String tipomebresia) {
        this.tipomebresia = tipomebresia;
    }

    public abstract String getInformacion();
    
}
