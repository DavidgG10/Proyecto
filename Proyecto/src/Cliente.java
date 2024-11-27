
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.IIOException;
import javax.swing.JOptionPane;

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
    private String guarId, guarNombre, guarApe, guarEda, guarCed, guarMem;

    public Cliente(String nombre, String apellido, int edad,
            int cedula, String tipomebresia) {
    super(nombre, apellido, edad, cedula, tipomebresia);  
    this.idCliente = GenerarID.generarIDMembresia();  
}

  
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String getInformacion() {
        return "Cliente: " + getNombre() +", Apellido: " + getApellido() + ", Cedula: " + getCedula()
                + ", Edad: "+ getEdad() + ", Membresia: " + getTipomebresia() + ", ID Cliente: " + idCliente;
    }

    
    public void guardar() {
        try{
            guarId = idCliente;
            guarNombre = getNombre();
            guarApe = getApellido();
            guarCed = String.valueOf(getCedula());
            guarEda = String.valueOf(getEdad());
            guarMem = getTipomebresia();
            try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("Clientes.dat", true))){
                dos.writeUTF(guarId);
                dos.writeUTF(guarNombre);
                dos.writeUTF(guarCed);
                dos.writeUTF(guarApe);
                dos.writeUTF(guarEda);
                dos.writeUTF(guarMem);
            }
            JOptionPane.showMessageDialog(null, "Cliente agregado correctamente", "Datos guardados", JOptionPane.INFORMATION_MESSAGE);
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los daos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Calificacion no valida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void mostrarInformacion(){
    }

}
