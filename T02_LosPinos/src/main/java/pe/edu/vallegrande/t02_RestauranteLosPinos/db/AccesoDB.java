package pe.edu.vallegrande.t02_RestauranteLosPinos.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDB {
    public AccesoDB() {
    }

    public static Connection getConnection() throws SQLException {
        Connection cn = null;
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String database = "LosPinosDB"; // Nombre de la Base de datos
        String server = "localhost:14033"; // Conexión a localhost en el puerto 14033
        String url = "jdbc:sqlserver://" + server + ";databaseName=" + database + ";encrypt=true;trustServerCertificate=true;loginTimeout=30;";
        String user = "sa"; // Usuario por defecto para SQL Server
        String password = "EntreCodigosyCafe2024"; // Contraseña configurada

        try {
            Class.forName(driver).getDeclaredConstructor().newInstance();
            cn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se encontró el driver de la base de datos.");
        } catch (Exception e) {
            throw new SQLException("No se puede establecer la conexión con la BD.");
        }
        return cn;
    }
}
