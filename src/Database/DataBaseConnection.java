package Database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseConnection {

    private String connection = "jdbc:sqlserver://10.0.0.14;database=Academica;integratedSecurity=false;"; //Aqui va la direccion ip a donde nos conectaremos a la base de datos


    private static DataBaseConnection databaseconnection;
    private DataBaseConnection(){
        Drivers();
    }

    public static DataBaseConnection getInstance() {
        if (databaseconnection == null) {
            databaseconnection = new DataBaseConnection();
        }
        return databaseconnection;
    }

        //preparando el login a la base de datos
    public void Drivers()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
        catch (ClassNotFoundException e)
        {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public Connection conexion() {
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection(connection, "root", "root");
        }
        catch (SQLException e)
        {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, e);
        }
        return conn;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public void ProbandoConexion() {

        try
        {
            conexion().close();
            System.out.println("¡¡ESTAMOS CONECTADOS!!");
        }
        catch (SQLException e)
        {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, e);
        }
    }


}
