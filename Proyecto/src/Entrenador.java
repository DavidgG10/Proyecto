/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mikeu
 */
public class Entrenador extends Persona implements InterfazInformacion{
    private String tipoEntrenador;

    public Entrenador(String nombre, String apellido, int edad, String cedula, 
            String tipomebresia) {
        super(nombre, apellido, edad, cedula, tipomebresia);
    }

    public String getTipoEntrenador() {
        return tipoEntrenador;
    }

    public void setTipoEntrenador(String tipoEntrenador) {
        this.tipoEntrenador = tipoEntrenador;
    }

    @Override
    public String getInformacion(){
        return "Entrenador: " + getNombre() + ", Cedula: " + getCedula() + 
                ", Tipo de entrenador: " + tipoEntrenador;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println(getInformacion());
    }
}
