/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mikeu
 */
public class Cliente extends Persona implements InterfazInformacion {
    private String tipoMembresia;

    public Cliente(String mebresia, String nombre, int edad, String email, 
            String contraseña, int cedula) {
        super(nombre, edad, email, contraseña, cedula);
        this.tipoMembresia = tipoMembresia;
    }

    public String gettipoMembresia() {
        return tipoMembresia;
    }

    public void settipoMembresia(String mebresia) {
        this.tipoMembresia = tipoMembresia;
    }
    
    @Override
    public String getInformacion(){
        return "Cliente: " + getNombre() + ", Cedula: " + getCedula() + 
                ", Menbresía: " + tipoMembresia;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println(getInformacion());
    }
    
}
