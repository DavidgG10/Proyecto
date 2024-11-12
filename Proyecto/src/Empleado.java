/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mikeu
 */
public class Empleado extends Persona implements InterfazInformacion{
    private String puesto;

    public Empleado(String especialidad, String nombre, int edad, 
            String email, String contraseña, int cedula) {
        super(nombre, edad, email, contraseña, cedula);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public String getInformacion(){
        return "Entrenador: " + getNombre() + ", Cedula: " + getCedula() + 
                ", Puesto: " + puesto;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println(getInformacion());
    }
}
