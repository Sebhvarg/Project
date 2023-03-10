
package espol.estudiante.proyecto.modulo.Usuarios;
import espol.estudiante.proyecto.modulo.Terceros.Cliente;
import espol.estudiante.proyecto.modulo.Documentos.Orden;
import espol.estudiante.proyecto.modulo.Terceros.Proveedor;
import espol.estudiante.proyecto.modulo.Servicio;

import java.util.ArrayList;
import java.util.Scanner;
public class Sistema {
    static private String usr;
    public static void comprobarUsuario(String usuario, String contrasena){
        int indice = 0;

        for (int i = 0; i<usuarios.length; i++) {
            if (usuarios[i].nombreUsr.equals(usuario) && usuarios[i].contrasena.equals(contrasena)) {
                System.out.println("Bienvenido " + usuarios[i].getNombreUsr() + " usted ha ingresado como: " + usuarios[i].nivel);
                usr = usuarios[i].getNombreUsr();
                indice = i;
                switch (usuarios[indice].nivel) {
                    case "admin":
                        Admin.menuAdmin();
                        break;
                    case "tecnico":
                        Tecnico.menuTecnico();
                        break;
                    case "cobranzas":
                        Cobranza.menuCobranza();
                        break;

                }
            }
        }
        System.out.println("Error ha ingresado el usuario o contraseña incorrecto");

    }
    //creacion de los arreglos que estaran al inicializar el sistema
    static private Usuario[] usuarios = new Usuario[4];
    static private ArrayList<Cliente> clientes = new ArrayList<>();
    static private ArrayList<Servicio> servicios = new ArrayList<>();
    static private ArrayList<Proveedor> proveedores = new ArrayList<>();
    static private ArrayList<Orden> ordenes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void inicializarSistema(){
        System.out.println("---- Tecnicentro RP S.A. ----");
    // Agrega los objetos que estaran en las respectivas listas al inicializar el sistema   
        //USUARIOS
        usuarios[0] = new Admin("admin1","12345678","Administrador","admin");
        usuarios[1]=(new Tecnico("alopez","al123456","Alvaro Lopez","tecnico"));
        usuarios[2]=(new Cobranza("mcastro","mc123456","Maria Castro","cobranzas"));
        usuarios[3]=(new Tecnico("mbarcos","mb123456","Mario Barcos","tecnico"));
        //CLIENTES
        clientes.add(new Cliente("123", "Ashley Veintimilla", "Isla Trinitaria","097 009 8527", "personal"));
        clientes.add(new Cliente("124", "Grupo HG S.A", "Juan Tanca Marengo","096 290 1765", "empresarial"));
    
        //SERVICIOS
        servicios.add(new Servicio("100", "alineación",25.00));
        servicios.add(new Servicio("101", "balanceo",15.00));
        servicios.add(new Servicio("102", "mantenimiento de frenos",40.00));
        servicios.add(new Servicio("103", "cambio de llantas",15.00));
        servicios.add(new Servicio("104", "cambio de banda",20.00));
        servicios.add(new Servicio("105", "cambio respuestos",50.00));
        // ORDENES TECNICOS
        ordenes.add(new Orden(usuarios[1].nombre, "04-12-2022",usuarios[1].nivel,"XXX-XXX",servicios.get(1).getNombre(), servicios.get(1).getPrecio()));
        ordenes.add(new Orden(usuarios[1].nombre, "04-12-2022",usuarios[1].nivel,"XXX-XXX",servicios.get(0).getNombre(), servicios.get(0).getPrecio()));
        ordenes.add(new Orden(usuarios[3].nombre, "14-11-2022",usuarios[3].nivel,"XXX-XXX",servicios.get(3).getNombre(), servicios.get(3).getPrecio()));
        ordenes.add(new Orden(usuarios[3].nombre, "14-11-2022",usuarios[3].nivel,"XXX-XXX",servicios.get(1).getNombre(), servicios.get(1).getPrecio()));
        //ORDENES CLIENTES
        ordenes.add(new Orden(clientes.get(0).codigo, "14-11-2022",clientes.get(0).getTipo(),"GTH-909", servicios.get(0).getNombre(), servicios.get(0).getPrecio()));
        ordenes.add(new Orden(clientes.get(1).codigo, "04-12-2022",clientes.get(1).getTipo(),"RUO-987",servicios.get(1).getNombre(), servicios.get(1).getPrecio()));
        ordenes.add(new Orden(clientes.get(0).codigo, "14-11-2022",clientes.get(0).getTipo(),"GTH-909", servicios.get(1).getNombre(), servicios.get(1).getPrecio()));
        ordenes.add(new Orden(clientes.get(1).codigo, "04-12-2022",clientes.get(1).getTipo(),"RUO-987",servicios.get(3).getNombre(), servicios.get(3).getPrecio()));


        //PROOVEEDORES
        proveedores.add(new Proveedor("9877", "KIA", "Cuenca", "052771203"));
        proveedores.add(new Proveedor("9866", "Chevrolet", "Guayaquil", "05270878"));
        System.out.println("*****************************************************");
        System.out.println("Ingrese su usuario: ");
        String usr = sc.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String password = sc.nextLine();
        System.out.println("*****************************************************");
        comprobarUsuario(usr, password);
    }
//getters para utilizar los arrays en las otras clases
    public static Usuario[] getUsuarios() {
        return usuarios;
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

    public static ArrayList<Orden> getOrdenes() {return ordenes;}
    public static String getUsr(){
        return usr;
    }

}
