import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {
    public static void crearClienteDB(Cliente cliente) {
        Conexion db_connet = new Conexion();
        try (Connection conexion = db_connet.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO `ventas`.`cliente` (`id`, `nombre`, `apellido1`, `apellido2`, `ciudad`) VALUES (?, ?, ?, ?);";
                ps = conexion.prepareStatement(query);
                ps.setString(1, cliente.getNombre());
                ps.setString(2, cliente.getApellido1());
                ps.setString(3, cliente.getApellido2());
                ps.setString(4, cliente.getCiudad());
                ps.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void leerClienteDB() {
        Conexion db_conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = db_conexion.get_conConnection()) {
            String query = "SELECT * FROM cliente";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Apellido1: " + rs.getString("apellido1"));
                System.out.println("Apellido2: " + rs.getString("apellido2"));
                System.out.println("Ciudad: " + rs.getString("ciudad"));
                System.out.println("***");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void borrarCliente(int id) {
        Conexion db_connet = new Conexion();
        try (Connection conexion = db_connet.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM cliente WHERE  id=?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("El cliente ah sido borrado");

            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("El cliente no se `puede borrar");
            }
        }catch(SQLException e)

        {
            System.out.println(e);
        }
    }

    public static void actualizarCliente(Cliente cliente){
        Conexion db_connet = new Conexion();
        try (Connection conexion = db_connet.get_conConnection()) {
            PreparedStatement ps;
            try {
                String query = "UPDATE  cliente SET nombre=?, apellido1=?,apellido2=?,ciudad=? ,categoria=? WHERE id=?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, cliente.getNombre());
                ps.setString(2, cliente.getApellido1());
                ps.setString(3, cliente.getApellido2());
                ps.setString(4, cliente.getCiudad());
                ps.setInt(6, cliente.getId());
                ps.executeUpdate();
                System.out.println("Se actualizo correctamente");
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (SQLException e){
            System.out.println(e);
        }
    }
}

