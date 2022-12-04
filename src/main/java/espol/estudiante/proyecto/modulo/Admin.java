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
        System.out.println((i + 1) + " " + "Administrar Cliente");//opciones que tiene el usuario
        System.out.println((i + 2) + " " + "Administrar Proveedor");
        System.out.println((i + 3) + " " + "Administrar Servicios");
        System.out.println((i + 4) + " " + "Salir");

        System.out.println("Selecione una opción: "); 
        byte admin_op = sc.nextByte();
        switch (admin_op) {
            case 1 -> administrarClientes(); //se ejecuta el metodo segun la opcion que haya elegido el ususario
            case 2 -> administrarProoveedores();
            case 3 -> administrarServicios();
            case 4 -> Sistema.inicializarSistema();
        }

    }

    public static void administrarClientes() {
        byte aggC = 1;
        while (aggC != 2) {
            System.out.println("---- Clientes ----");
            for (int i = 0; i < Sistema.getClientes().size(); i++) {
                System.out.println(Sistema.getClientes().get(i).toString());//recorremos la lista para imprimir todos objetos dentro del Arraylist clientes que esta en sistema
            }
            int i = 0;
            System.out.println((i + 1) + " " + "Agregar Cliente");
            System.out.println((i + 2) + " " + "Salir");
            byte opcAdmin = sc.nextByte();
            if (opcAdmin == 1) {
                agregarCliente();//llamamos al los metodos estatico creados en la clase cliente
            } else {
                aggC = 2;//se ejecutara segun la opcion que elija el usuario
                menuAdmin();
            }
        }
    }

    public static void administrarProoveedores() {
        byte aggC = 1;
        while (aggC != 2) {
            System.out.println("---- Proveedores ----");
            for (int i = 0; i < Sistema.getProveedores().size(); i++) {
                System.out.println(Sistema.getProveedores().get(i).toString());//recorremos la lista para imprimir todos objetos dentro del Arraylist proveedores que esta en sistema
            }
            int i = 0;
            System.out.println((i + 1) + " " + "Agregar Proveedor");
            System.out.println((i + 2) + " " + "Salir");
            byte opcAdmin = sc.nextByte();
            if (opcAdmin == 1) {
                agregarProveedor();//llamamos a los metodos estatico creados en la clase proveedor
            } else {
                aggC = 2;
                menuAdmin();//se ejecutara segun la opcion que elija el usuario
            }

        }
    }
    public static void administrarServicios(){
        byte aggC = 1;
        while (aggC != 3) {
            System.out.println("---- Servicios ----");
            for (int i = 0; i < Sistema.getServicios().size(); i++) {
                System.out.println(Sistema.getServicios().get(i).toString());//recorremos la lista para imprimir todos objetos dentro del Arraylist servicios que esta en sistema
            }
            int i = 0;
            System.out.println((i + 1) + " " + "Agregar Servicio");
            System.out.println((i + 2) + " " + "Editar Servicio");
            System.out.println((i + 3) + " " + "Salir");
            byte opcAdmin = sc.nextByte();
            if (opcAdmin == 1) {
                Servicio.agregarServicio();//llamamos a los metodos estatico creados en la clase servicios
            } else if (opcAdmin == 2) {
                Servicio.editarServicio();
            }else{
                menuAdmin();//se ejecutara segun la opcion que elija el usuario

            }
        }

    }
}
