package espol.estudiante.proyecto.modulo;

import java.util.Scanner;

import static espol.estudiante.proyecto.modulo.Admin.administrarProoveedores;
import static espol.estudiante.proyecto.modulo.Admin.sc;

public class Tecnico extends Usuario {
    public Tecnico(String nombreUsr, String contrasena, String nombre, String nivel) {
        super(nombreUsr, contrasena, nombre, nivel);
    }

    public static void menuTecnico() {
        System.out.println("---- Menú del Técnico ----");
        int i = 0;
        System.out.println((i + 1) + " " + "Generar Orden de servicios"); //opciones que tiene el usuario
        System.out.println((i + 2) + " " + "Reportar falta");
        System.out.println((i + 3) + " " + "Salir");

        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione una opción: ");
        byte tecnico_op = sc.nextByte();
        switch (tecnico_op) {
            case 1 -> generarOrdenDeServicios(); //metodos que se van a ejecutar segun el caso que elija el usuario
            case 2 -> reportarFaltaInsumos(); //llamada a los metodos estaticos.
            case 3 -> Sistema.inicializarSistema();
        }


    }

    public static void generarOrdenDeServicios() {

        System.out.println("---- Generar orden de servicios ----");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < Sistema.getClientes().size(); i++) { //recorremos la lista para imprimir todos objetos dentro del Arraylist clientes
            System.out.println(Sistema.getClientes().get(i).toString()); //metodo toString para visualizar la informacion de cada objeto
        }
        System.out.println("Ingrese código de cliente: "); // solicitud de codigo al usuario
        String codigoCliente = sc.nextLine();

        for (Cliente c : Sistema.getClientes()) {
            if (c.getCodigo().equals(codigoCliente)) { //recorremos la lista y verificamos si el codigo ingresado esta presente en la lista clientes
                System.out.println("Ingrese fecha de servicio (dd-mm-aaaa): ");
                String fecha = sc.nextLine();
                System.out.println("Ingrese tipo de vehículo (Solo el número) (1- automóvil, 2 motocicletas, 3- bus): ");
                String tipo = sc.nextLine();
                switch (tipo) {
                    case "1" -> tipo = "automóvil";
                    case "2" -> tipo = "motocicleta";
                    case "3" -> tipo = "bus";
                }

                System.out.println("Ingrese #Placa Del Vehículo: ");
                String placa = sc.nextLine();
                String cond = "0";
                while (cond.equals("0")) {
                    for (Servicio s: Sistema.getServicios()) {
                        System.out.println(s.toString());
                    }
                    System.out.println("--- Servicios aplicados en el vehiculo: ---");
                    System.out.println("Ingrese el codigo del servicio:");
                    String codigoServicio = sc.nextLine();
                    double precio = 0.00;
                    for (Servicio s: Sistema.getServicios()){
                        if (s.getCodigo().equals(codigoServicio)){
                            codigoServicio = s.getNombre();
                            precio = s.getPrecio();
                        }
                    }
                    Sistema.getOrdenes().add(new Orden(codigoCliente, fecha, tipo, placa, codigoServicio, precio));
                    if(Sistema.getUsr() == "alopez"){
                        Sistema.getOrdenes().get(0).setPrecio(Sistema.getOrdenes().get(0).getPrecio()+precio);
                    } else if (Sistema.getUsr() == "mbarcos") {
                        Sistema.getOrdenes().get(1).setPrecio(Sistema.getOrdenes().get(1).getPrecio()+precio);
                    }
                    System.out.println("---- Servicio agregado correctamente ----:");
                    System.out.println("Servicio de:"+ codigoServicio+" - "+ "$"+precio);
                    System.out.println("Si desea seguir agregando servicios pulse 0 \n Si ha terminado de agregar escriba -1");
                    cond = sc.nextLine();

                }
                menuTecnico();


            }

        }

        }


        public static void reportarFaltaInsumos () {
            System.out.println("---- Reportar faltas de insumos ---- \n --Correo-- ");
            System.out.println("Fecha (dd-mm-aaaa): ");
            String fecha = sc.nextLine();
            System.out.println("De:" + Sistema.getUsr()+ "\n Para: " + Reporte.getCorreo());
            System.out.println("Descripción: ");
            String descripcion = sc.nextLine();
            System.out.println("---- Correo enviado correctamente ----");
            menuTecnico();


        }

    }

