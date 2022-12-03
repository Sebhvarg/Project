
package espol.estudiante.proyecto.modulo;
import espol.estudiante.proyecto.modulo.Admin.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Sistema {
    public static void comprobarUsuario(String usuario, String contrasena){
        int indice = 0;
        for (int i = 0; i<usuarios.length; i++){
            if(usuarios[i].nombreUsr.contains(usuario) && usuarios[i].contrasena.contains(contrasena)){
                System.out.println("Bienvenido "+ usuarios[i].nombre + " usted ha ingresado como: "+usuarios[i].nivel);
                indice = i;
            }
        }
        switch(usuarios[indice].nivel){
            case "admin":
                Admin.menuAdmin();
                break;
        }
    }
    static private Usuario[] usuarios = new Usuario[4];
    static private ArrayList<Cliente> clientes = new ArrayList<>();
    static private ArrayList<Servicio> servicios = new ArrayList<>();
    static private ArrayList<Proveedor> prooveedores = new ArrayList<>();
    static private ArrayList<Orden> ordenes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void inicializarSistema(){
        usuarios[0] = new Admin("admin1","12345678","Administrador","admin");
        usuarios[1]=(new Tecnico("alopez","al123456","Alvaro Lopez","tecnico"));
        usuarios[2]=(new Cobranza("mcastro","mc123456","Maria Castro","cobranzas"));
        usuarios[3]=(new Tecnico("mbarcos","mb123456","Mario Barcos","tecnico"));
        //CLIENTES
        clientes.add(new Cliente("123", "Ashley Veintimilla", "Isla Trinitaria","098 669 8551", "empresarial"));
        clientes.add(new Cliente("124", "Ana Cobos", "Guasmo Sur","096 290 1765", "personal"));
        //PROOVEEDORES
        prooveedores.add(new Proveedor("9877", "KIA", "Cuenca", "052771203"));
        prooveedores.add(new Proveedor("9866", "Chevrolet", "Guayaquil", "05270878"));
        System.out.println("*****************************************************");
        System.out.println("Ingrese su usuario: ");
        String usr = sc.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String password = sc.nextLine();
        System.out.println("*****************************************************");
        comprobarUsuario(usr, password);
    }

    public static Usuario[] getUsuarios() {
        return usuarios;
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static ArrayList<Proveedor> getProoveedores() {
        return prooveedores;
    }
}
