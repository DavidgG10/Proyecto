
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ConectarBD {
    private Connection conexion = null;
    private String servidor = "localhost:3307";
    private String database = "clientes";
    private String usuario = "root";
    private String password = "";
    private String url = "";//crear el link de conexion

    public ConectarBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://" + servidor + "/" + database + "?autoReconnect=true&useSSL=false";
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion con la base de datos " + url + "...Ok");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public ConectarBD(String servidor, String database, String usuario, String password) {
        try {
            this.servidor = servidor;
            this.database = database;
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://" + servidor + "/" + database + "?autoReconnect=true&useSSL=false";
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion con la base de datos " + url + "...Ok");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public PreparedStatement crearPreparedStatement(String sql) throws SQLException {
        return conexion.prepareStatement(sql);
    }

    public Statement crearStatement() throws SQLException {
        return conexion.createStatement();
    }

    public Connection getConexion() {
        return conexion;
    }

    public Connection cerrarConexion() {
        try {
            conexion.close();
            System.out.println("Cerrando la conexion con la base de datos " + url + "...ok.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        conexion=null;
        return conexion;
    }

}
