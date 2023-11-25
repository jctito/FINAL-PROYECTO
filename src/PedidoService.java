import java.util.Scanner;

public class PedidoService {
    public static void crearCliente(){
        Scanner juan = new Scanner(System.in);
        System.out.println("escribe tu nombre: ");
        String nombre =juan.nextLine();

        System.out.println("escribe tu apellido1: ");
        String apellido1 = juan.nextLine();

        System.out.println("escribe tu apellido2: ");
        String apellido2 = juan.nextLine();

        System.out.println("escribe tu ciudad: ");
        String ciudad = juan.nextLine();

        System.out.println("escribe tu ID categoria: ");
        int id_categoria = juan.nextInt();


        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido1(apellido1);
        cliente.setApellido2(apellido2);
        cliente.setCiudad(ciudad);
        ClienteDAO.crearClienteDB(cliente);

    }
    public static void listarCliente(){
        ClienteDAO.leerClienteDB();

    }
    public static void borrarCliente(){
        Scanner juan = new Scanner(System.in);
        System.out.println("Indique el ID del cliente a borrar: ");
        int id_cliente = juan.nextInt();
        ClienteDAO.borrarCliente(id_cliente);
    }
    public static void editarCliente(){
        Scanner juan = new Scanner(System.in);
        System.out.println("escribe nuevo nombre ");
        String nombre =juan.nextLine();

        System.out.println("escribe nuevo apellido1 ");
        String apellido1 =juan.nextLine();

        System.out.println("escribe nuevo apellido2 ");
        String apellido2 =juan.nextLine();

        System.out.println("escribe nuevo ciudad ");
        String   ciudad =juan.nextLine();



        Cliente  acliente =new Cliente();
        acliente.setNombre(nombre);
        acliente.setApellido1(apellido1);
        acliente.setApellido2(apellido2);
        acliente.setCiudad(ciudad);
        ClienteDAO.actualizarCliente(acliente);


    }
}



