package espol.estudiante.proyecto.modulo;

import java.util.Scanner;

import static espol.estudiante.proyecto.modulo.Admin.administrarProoveedores;

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
            case 2 -> administrarProoveedores();
            case 3 -> Sistema.inicializarSistema();
        }


    }
    public static void generarOrdenDeServicios(){
        System.out.println("OZIL");
    }
}
