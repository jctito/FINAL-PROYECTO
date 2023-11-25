import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ComercialDAO {
    public static void crearComercialDB(Comercial comercial) {
        Conexion db_connet = new Conexion();
        try (Connection conexion = db_connet.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO `dbcomercial`.`comercial` (`nombre`, `apellido1`, `apellido2`) VALUES (?, ?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, comercial.getNombre());
                ps.setString(2, comercial.getApellido1());
                ps.setString(3, comercial.getApellido2());
                ps.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void leerComercialDB() {
        Conexion db_conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = db_conexion.get_conConnection()) {
            String query = "SELECT * FROM comercial";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Apellido1: " + rs.getString("apellido1"));
                System.out.println("Apellido2: " + rs.getString("apellido2"));
                System.out.println("***");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void borrarComercial(int id) {
        Conexion db_connet = new Conexion();
        try (Connection conexion = db_connet.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM comercial WHERE  id=?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("El comercial ah sido borrado");

            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("El comercial no se `puede borrar");
            }
        }catch(SQLException e)

        {
            System.out.println(e);
        }
    }

    public static void actualizarComercial(Comercial comercial){
        Conexion db_connet = new Conexion();
        try (Connection conexion = db_connet.get_conConnection()) {
            PreparedStatement ps;
            try {
                String query = "UPDATE  cliente SET nombre=?, email=?,telefono`=?, WHERE id=?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, comercial.getNombre());
                ps.setString(2, comercial.getApellido1());
                ps.setString(3, comercial.getApellido2());
                ps.setInt(6, comercial.getId());
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

