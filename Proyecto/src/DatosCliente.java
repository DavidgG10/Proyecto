
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class DatosCliente {
    public void crearCliente(Cliente cliente){
        try{
             
            ConectarBD con = new ConectarBD();
            //2- crear el statement
            PreparedStatement misql = con.crearPreparedStatement("INSERT INTO articulo VALUES (?,?,?)");
            misql.setString(1, cliente.getIdCliente());
            misql.setString(2, cliente.getNombre());
            misql.setString(3, cliente.getApellido());
            misql.setInt(4, cliente.getCedula());
            misql.setString(5, cliente.getTipomebresia());
            
            //3- ejecutar el comando sql
            misql.executeUpdate();
           
            con.cerrarConexion();
        }catch (SQLException e){
            Logger.getLogger(DatosCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public ArrayList<Cliente> todosClientes() {
        ArrayList<Cliente> miListaClientes = new ArrayList<>();
        try {
            //1-Crea la conexion con la bd
            ConectarBD con = new ConectarBD();
            //2- crear el statement
            Statement st = con.crearStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM articulo");
            while (rs.next()) {
                Cliente cliente = new Cliente(rs.getString("idCliente"),
                        rs.getString("nombre"), rs.getString("apellido"),rs.getInt("edad"),rs.getInt("cedula"),rs.getString("membresia"));
                miListaClientes.add(cliente);
            }
            //4- cerrar la conexion con la bd
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosCliente.class.getName()).log(Level.SEVERE, null, e);
        }
        return miListaClientes;
    }
}
