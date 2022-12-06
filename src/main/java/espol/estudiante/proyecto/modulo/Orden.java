
package espol.estudiante.proyecto.modulo;
import espol.estudiante.proyecto.modulo.Servicio;
import java.util.ArrayList;

public class Orden{
    private String codigoCliente;
    private String fechaDeServicio;
    private String tipo;
    private String placa;
    private String service;

    private double precio;

    public Orden(String codigoCliente, String fechaDeServicio, String tipo, String placa, String service, double precio) {
        this.codigoCliente = codigoCliente;
        this.fechaDeServicio = fechaDeServicio;
        this.tipo = tipo;
        this.placa = placa;
        this.service = service;
        this.precio = precio;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public String getFechaDeServicio() {
        return fechaDeServicio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getService() {
        return service;
    }
    public double getPrecio(){
        return precio;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
