package espol.estudiante.proyecto.modulo;

import java.util.Scanner;

import static espol.estudiante.proyecto.modulo.Admin.administrarProoveedores;
import static espol.estudiante.proyecto.modulo.Admin.sc;

public class Tecnico extends Usuario {
    public Tecnico(String nombreUsr, String contrasena, String nombre, String nivel){
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
    public static void generarOrdenDeServicios(){

        System.out.println("---- Generar orden de servicios ----");

        for (int i = 0; i < Sistema.getClientes().size(); i++) { //recorremos la lista para imprimir todos objetos dentro del Arraylist clientes
            System.out.println(Sistema.getClientes().get(i).toString()); //metodo toString para visualizar la informacion de cada objeto
        }
        System.out.println("Ingrese código de cliente: "); // solicitud de codigo al usuario
        String codigoCliente = sc.nextLine();
        for (Cliente c: Sistema.getClientes()){
            if(codigoCliente.equals(c.codigo)){ //recorremos la lista y verificamos si el codigo ingresado esta presente en la lista clientes
                System.out.println("Ingrese fecha de servicio (dd/mm/aaaa): ");
                String fecha = sc.nextLine();
                System.out.println("Ingrese tipo de vehículo (Solo el número) (1- automóvil, 2 motocicletas, 3- bus): ");
                String tipo = sc.nextLine();
                switch(tipo){
                    case "1" -> tipo = "automóvil";
                    case "2" -> tipo = "motocicleta";
                    case "3" -> tipo = "bus";
                }
                System.out.println("Ingrese #Placa Del Vehículo: ");
                String placa = sc.nextLine();
                System.out.println("--- Servicios aplicados en el vehiculo: ---");
                for (int i = 0; i < Sistema.getServicios().size(); i++) {
                    System.out.println(Sistema.getServicios().get(i).toString());
                }
                byte cond = 0;
                while (cond == 0){
                    System.out.println("Ingrese el codigo del servicio:");

                    int codigoServicio = sc.nextInt();
                    System.out.println("Si desea seguir agregando servicios pulse 0 \n Si ha terminado de agregar escriba -1");
                    cond = sc.nextByte();

                }

                break;

            }else{
                System.out.println("Error - Código de cliente inexistente"); //si el codigo no exsite le da error y lo regresa al menu
                menuTecnico();

            }
        }

    }
    public static void reportarFaltaInsumos(){
        System.out.println("---- Reportar faltas de insumos ---- \n --Correo-- \n De:"+ Usuario.getNombre());
        System.out.println("Fecha (dd/mm/aaaa): ");
        String fecha = sc.nextLine();
        System.out.println("Para: "+ Reporte.getCorreo());
        System.out.println("Descripción: ");
        String descripcion = sc.nextLine();






    }


}
