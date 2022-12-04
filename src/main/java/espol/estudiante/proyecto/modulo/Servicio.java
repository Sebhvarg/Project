
package espol.estudiante.proyecto.modulo;

import java.util.Scanner;

public class Servicio extends Datos{
    private Double precio;

    public Servicio( String codigo,String nombre, Double precio) {
        super(nombre, codigo);
        this.precio = precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public String toString() {
        return super.toString()+  ", Precio=" +precio;
    }
    static Scanner sc = new Scanner(System.in);
    public static void agregarServicio(){
        System.out.println("A continuación agregue un servicio:");
        System.out.println("Ingrese un nombre: ");
        String nombree = sc.nextLine();
        System.out.println("Ingrese el precio (ejemplo: 12.98): ");
        Double precioo = sc.nextDouble();
        int ind = (Sistema.getServicios().size()-1);
        int codigo1 = Integer.parseInt(((Sistema.getServicios()).get(ind)).codigo);
        String codigoo = String.valueOf(codigo1+1);
        Sistema.getServicios().add(new Servicio(codigoo,nombree, precioo));
    }
    public static void editarServicio(){
        System.out.println("A continuacion edite el precio de un servicio:");
        System.out.println("Por favor,ingrese el codigo del servicio(XXX): ");
        String codigo = sc.nextLine();
        boolean cond = false;
         for(Servicio s: Sistema.getServicios()){
        if(codigo != null && codigo.equals(s.codigo) ) {
            System.out.println("Actualice el precio (ejemplo: 12.98): ");
            Double precio1 = sc.nextDouble();
            s.setPrecio(precio1);
            cond = true;
        }
        }
         if(cond == false){
            System.out.println("Error, codigo no existente");
     }
    }
}
