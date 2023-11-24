import java.util.Scanner;
public class Inicio {
    public static void main(String[] args) {
        Scanner juan = new Scanner(System.in);
        int opcion =0;
        do {
            System.out.println("......");
            System.out.println("Aplicacion de Cliente");
            System.out.println("1. Crear Cliente");
            System.out.println("2. Listar Cliente");
            System.out.println("3. Editar Cliente");
            System.out.println("4. Eliminar Cliente");
            System.out.println("5. Salir");
            System.out.print(">>");
            opcion = juan.nextInt();
            switch (opcion){
                case 1:
                    ClienteService.crearCliente();
                case 2:
                    ClienteService.listarCliente();
                case 3:
                    ClienteService.editarCliente();
                case 4:
                    ClienteService.borrarCliente();
                    break;
                default:
                    break;
            }

        }while (opcion!=5);

    }
}

