
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
public class DatosEntrenador {
    public void crearEntrenador(Entrenador entrenador) {
        try {
            
            ConectarBD con = new ConectarBD();
            //2- crear el statement
            PreparedStatement misql = con.crearPreparedStatement("INSERT INTO entrenadores VALUES (?,?,?,?)");
            misql.setString(1, entrenador.getNombre());
            misql.setString(2, entrenador.getApellido());
            misql.setInt(3, entrenador.getEdad());
            misql.setString(4, entrenador.getTipoEntrenador());

            //3- ejecutar el comando sql
            misql.executeUpdate();
            
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosCliente.class.getName()).log(Level.SEVERE, null, e);
        }        
    }
    
    public ArrayList<Entrenador> todosEntrenadores() {
        ArrayList<Entrenador> miListaentrenadores = new ArrayList<>();
        try {
            //1-Crea la conexion con la bd
            ConectarBD con = new ConectarBD();
            //2- crear el statement
            Statement st = con.crearStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM entrenadores");
            while (rs.next()) {
                Entrenador entrenador;
                entrenador = new Entrenador(rs.getString("nombre"), rs.getString("apellido"),
                        rs.getInt("edad"), rs.getString("tipoEntrenador"));
                miListaentrenadores.add(entrenador);
            }
            //4- cerrar la conexion con la bd
            rs.close();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosCliente.class.getName()).log(Level.SEVERE, null, e);
        }
        return miListaentrenadores;
        
    }
    
    public void eliminarEntrenadores(String cedula) {
        try {
            ConectarBD con = new ConectarBD();
            PreparedStatement misql = con.crearPreparedStatement("DELETE FROM entrenadores WHERE nombre=?");
            misql.setString(1, cedula);
            misql.executeUpdate();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
}
