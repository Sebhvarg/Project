package espol.estudiante.proyecto.modulo;
import static espol.estudiante.proyecto.modulo.Cliente.agregarCliente;
import static espol.estudiante.proyecto.modulo.Proveedor.agregarProveedor;

import java.util.Scanner;
public class Admin extends Usuario {

    public Admin(String nombreUsr, String contrasena, String nombre, String nivel) {
        super(nombreUsr, contrasena, nombre, nivel);
    }

    static Scanner sc = new Scanner(System.in);

    public static void menuAdmin() {
        System.out.println("---- Menú del Administrador ----");
        int i = 0;
        System.out.println((i + 1) + " " + "Administrar Cliente");
        System.out.println((i + 2) + " " + "Administrar Proveedor");
        System.out.println((i + 3) + " " + "Administrar Servicios");
        System.out.println((i + 4) + " " + "Salir");

        System.out.println("Selecione una opción: ");
        byte admin_op = sc.nextByte();
        switch (admin_op) {
            case 1 -> administrarClientes();
            case 2 -> administrarProoveedores();
            case 3 -> System.out.println((i + 1) + " " + "Administrar Cliente");
            case 4 -> Sistema.inicializarSistema();
        }

    }

    public static void administrarClientes() {
        byte aggC = 1;
        while (aggC != 2) {
            System.out.println("---- Clientes ----");
            for (int i = 0; i < Sistema.getClientes().size(); i++) {
                System.out.println(Sistema.getClientes().get(i).toString());
            }
            int i = 0;
            System.out.println((i + 1) + " " + "Agregar Cliente");
            System.out.println((i + 2) + " " + "Salir");
            byte opcAdmin = sc.nextByte();
            if (opcAdmin == 1) {
                agregarCliente();
            } else {
                aggC = 2;
                menuAdmin();
            }
        }
    }

    public static void administrarProoveedores() {
        byte aggC = 1;
        while (aggC != 2) {
            System.out.println("---- Proveedores ----");
            for (int i = 0; i < Sistema.getProoveedores().size(); i++) {
                System.out.println(Sistema.getProoveedores().get(i).toString());
            }
            int i = 0;
            System.out.println((i + 1) + " " + "Agregar Proveedor");
            System.out.println((i + 2) + " " + "Salir");
            byte opcAdmin = sc.nextByte();
            if (opcAdmin == 1) {
                agregarProveedor();
            } else {
                aggC = 2;
                menuAdmin();
            }

        }
    }
}
