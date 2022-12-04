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
        System.out.println((i + 1) + " " + "Generar Orden de servicios");
        System.out.println((i + 2) + " " + "Reportar falta");
        System.out.println((i + 3) + " " + "Salir");

        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione una opción: ");
        byte tecnico_op = sc.nextByte();
        switch (tecnico_op) {
            case 1 -> generarOrdenDeServicios();
            case 2 -> reportarFaltaInsumos();
            case 3 -> Sistema.inicializarSistema();
        }


    }
    public static void generarOrdenDeServicios(){

        System.out.println("---- Generar orden de servicios ----");

        for (int i = 0; i < Sistema.getClientes().size(); i++) {
            System.out.println(Sistema.getClientes().get(i).toString());
        }
        System.out.println("Ingrese código de cliente: ");
        String codigoCliente = sc.nextLine();
        for (Cliente c: Sistema.getClientes()){
            if(codigoCliente.equals(c.codigo)){
                System.out.println("Ingrese fecha de servicio (dd/mm/aaaa): ");
                String fecha = sc.nextLine();
                System.out.println("Ingrese tipo de vehículo (Solo el número) (1- automóvil, 2 motocicletas, 3- bus): ");
                String tipo = sc.nextLine();
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

                }

                break;



            }else{
                System.out.println("Error - Código de cliente inexistente");
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
