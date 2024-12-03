
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mikeu
 */
public class Cliente extends Persona implements InterfazInformacion {

    private String idCliente;
    

    public Cliente(String nombre, String apellido, int edad,
            String cedula, String tipomebresia) {
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
        return "Cliente: " + getNombre() + ", Apellido: " + getApellido() + ", Cedula: " + getCedula()
                + ", Edad: " + getEdad() + ", Membresia: " + getTipomebresia() + ", ID Cliente: " + idCliente;
    }

   

    @Override
    public void mostrarInformacion() {
    }

}
