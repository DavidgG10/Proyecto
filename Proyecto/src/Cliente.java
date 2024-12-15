
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mikeu
 */
public class Cliente extends Persona implements InterfazInformacion {

    
    private String cedula;
    private String tipomebresia;
    

    public Cliente( String nombre, String apellido, int edad, String cedula, String tipomebresia) {
        super(nombre, apellido, edad);
        this.cedula = cedula;
        this.tipomebresia = tipomebresia;
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
    
    

    @Override
    public String getInformacion() {
        return "Cliente: " + getNombre() + ", Apellido: " + getApellido() + ", Cedula: " + getCedula()
                + ", Edad: " + getEdad() + ", Membresia: " + getTipomebresia();
    }

    @Override
    public void generarIdCliente() {
       
    }


}
