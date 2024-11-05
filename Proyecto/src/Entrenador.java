/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mikeu
 */
public class Entrenador extends Persona {
    private String especialidad;

    public Entrenador(String especialidad, String nombre, int edad, 
            String email, String contraseña, int cedula) {
        super(nombre, edad, email, contraseña, cedula);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
