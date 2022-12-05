package espol.estudiante.proyecto.modulo;

public class Factura {
    private String codigo;
    private String nombreEmpresa;
    private String año;
    private String mes;

    public Factura(String codigo, String nombreEmpresa, String mes, String año) {
        this.codigo = codigo;
        this.nombreEmpresa = nombreEmpresa;
        this.año = año;
        this.mes = mes;
    }
}
