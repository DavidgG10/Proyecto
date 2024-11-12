/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mikeu
 */
public class Cliente extends Persona implements InterfazInformacion {
    private String idCliente;

    public Cliente(String idCliente, String nombre, String apellido, int edad, 
            int cedula, String tipomebresia) {
        super(nombre, apellido, edad, cedula, tipomebresia);
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
  
    @Override
    public String getInformacion(){
        return "Cliente: " + getNombre() + ", Cedula: " + getCedula() + 
                ", ID Cliente: " + idCliente;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println(getInformacion());
    }
    
}
