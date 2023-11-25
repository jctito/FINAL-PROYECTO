import java.util.Scanner;

public class ComercialService {
    public static void crearComercial(){
        Scanner juan = new Scanner(System.in);
        System.out.println("escribe tu nombre: ");
        String nombre =juan.nextLine();

        System.out.println("escribe tu apellido1: ");
        String apellido1 = juan.nextLine();

        System.out.println("escribe tu apellido2: ");
        String apellido2 = juan.nextLine();



        Comercial comercial = new Comercial();
        comercial.setNombre(nombre);
        comercial.setApellido1(apellido1);
        comercial.setApellido1(apellido2);

        ComercialDAO.crearComercialDB(comercial);

    }
    public static void listarComercial(){
        ComercialDAO.leerComercialDB();

    }
    public static void borrarComercial(){
        Scanner juan = new Scanner(System.in);
        System.out.println("Indique el ID del cliente a borrar: ");
        int id_comercial = juan.nextInt();
        ComercialDAO.borrarComercial(id_comercial);
    }
    public static void editarComercial(){
        Scanner juan = new Scanner(System.in);
        System.out.println("escribe nuevo nombre ");
        String nombre =juan.nextLine();

        System.out.println("escribe nuevo apellido1 ");
        String apellido1 =juan.nextLine();

        System.out.println("escribe nuevo apellido2 ");
        String apellido2 =juan.nextLine();




        Comercial  acomercial =new Comercial();
        acomercial.setNombre(nombre);
        acomercial.setApellido1(apellido1);
        acomercial.setApellido1(apellido2);
        ComercialDAO.actualizarComercial(acomercial);


    }
}

