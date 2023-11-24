public class Inicio {
    public static void main(String[] args) {
        System.out.println("hola bilivia");
        Conexion conexion = new Conexion();
        try {
            conexion.get_conConnection();
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
