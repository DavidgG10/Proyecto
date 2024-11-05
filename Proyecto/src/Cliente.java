/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mikeu
 */
public class Cliente extends Persona {
    private String membresia;

    public Cliente(String mebresia, String nombre, int edad, String email, 
            String contraseña, int cedula) {
        super(nombre, edad, email, contraseña, cedula);
        this.membresia = mebresia;
    }

    public String getMebresia() {
        return membresia;
    }

    public void setMebresia(String mebresia) {
        this.membresia = mebresia;
    }
    
}
