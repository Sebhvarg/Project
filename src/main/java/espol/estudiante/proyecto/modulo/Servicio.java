
package espol.estudiante.proyecto.modulo;

import espol.estudiante.proyecto.modulo.Terceros.Datos;
import espol.estudiante.proyecto.modulo.Usuarios.Sistema;

import static espol.estudiante.proyecto.modulo.Usuarios.Admin.administrarServicios;
import java.util.Scanner;

public class Servicio extends Datos {
    private Double precio;

    public Servicio( String codigo,String nombre, Double precio) {
        super(nombre, codigo);
        this.precio = precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio; //setter para modificar el precio en el metodo editarServicio.
    }
    
    public String toString() {
        return super.toString()+  ", Precio=" +precio;
    }
    static Scanner sc = new Scanner(System.in);
    public static void agregarServicio(){
        System.out.println("A continuación agregue un servicio:");//solicitud de datos al usuario
        System.out.println("Ingrese un nombre: ");
        String nombree = sc.nextLine();
        System.out.println("Ingrese el precio (ejemplo: 12.98): ");
        Double precioo = sc.nextDouble();
        int ind = (Sistema.getServicios().size()-1);//obtengo el indice el ultimo elemento del arraylist servicios
        int codigo1 = Integer.parseInt(((Sistema.getServicios()).get(ind)).codigo); //otengo el ultimo codigo del arrayList y lo transformo en entero.
        String codigoo = String.valueOf(codigo1+1); //para poder realizar la suma y generar el nuevo codigo en base al anterior, y lo vuelvo a transformar a string.
        Sistema.getServicios().add(new Servicio(codigoo,nombree, precioo)); //agrego el nuevo objeto servicio al arrayList
    }
    public static void editarServicio(){
        System.out.println("A continuacion edite el precio de un servicio:"); 
        System.out.println("Por favor,ingrese el codigo del servicio(XXX): "); //solicitud del codigo
        String codigo = sc.nextLine();
        boolean cond = false;
         for(Servicio s: Sistema.getServicios()){ //recorro la lista
        if(codigo != null && codigo.equals(s.codigo) ) { //metodo equals para saber si el codigo que ingresa el usuario existe en la lista
            System.out.println("Actualice el precio (ejemplo: 12,98): "); //actualizacion de precio
            Double precio1 = sc.nextDouble();
            s.setPrecio(precio1); //actualizacion mediante el metodo set
            cond = true;
        }
        }
         if(cond == false){ //solo cuando la condicion se mantenga false se ejecuta el codigo de error
            System.out.println("Error, codigo no existente");
            administrarServicios();
     }
    }

    public Double getPrecio() {
        return precio;
    }
}
