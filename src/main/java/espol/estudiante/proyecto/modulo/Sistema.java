
package espol.estudiante.proyecto.modulo;
import java.util.ArrayList;
import java.util.Scanner;
public class Sistema {
    public static void comprobarUsuario(String usuario, String contrasena){  
            System.out.println("aaaa"); 
    }
    static private Usuario[] usuarios = new Usuario[4];
    static private ArrayList<Cliente> clientes = new ArrayList<>();
    static private ArrayList<Servicio> servicios = new ArrayList<>();
    static private ArrayList<Proveedor> proveedores = new ArrayList<>();
    static private ArrayList<Orden> ordenes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void inicializarSistema(){
        usuarios[0] = new Admin("admin1","12345678","Administrador","admin");
        usuarios[1]=(new Tecnico("alopez","al123456","Alvaro Lopez","tecnico"));
        usuarios[2]=(new Cobranza("mcastro","mc123456","Maria Castro","cobranzas"));
        usuarios[3]=(new Tecnico("mbarcos","mb123456","Mario Barcos","tecnico"));
        System.out.println("*****************************************************"); 
        System.out.println("Ingrese su usuario: "); 
        String usr = sc.nextLine();
        System.out.println("Ingrese su contraseña: "); 
        String password = sc.nextLine();
        System.out.println("*****************************************************"); 
        
        //CLIENTES
        clientes.add(new Cliente("123", "Ashley Veintimilla", "Isla Trinitaria","098 669 8551", "empresarial"));
        clientes.add(new Cliente("124", "Ana Cobos", "Guasmo Sur","096 290 1765", "personal"));
    
        //SERVICIOS
        servicios.add(new Servicio("100", "compra insumos",400.04));
        servicios.add(new Servicio("101", "compra materiales",300.0));
        servicios.add(new Servicio("102", "arreglo de vehiculo",460.0));
        servicios.add(new Servicio("103", "mantenimiento de vehiculo",200.0));
        servicios.add(new Servicio("104", "cambio de aceite",100.03));
        servicios.add(new Servicio("105", "compra respuestos",50.02));
        
        //PROVEEDORES
        proveedores.add(new Proveedor("200","Jahir Castilo","Estero Salado","0923476296"));
        proveedores.add(new Proveedor("201","Alexander Diaz", "Socio Vivienda", "0965577735"));
    }    

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public static ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public static ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }  
}
