package espol.estudiante.proyecto.modulo;

public class Factura {
    private String codigo;
    private String nombreEmpresa;
    private int año;
    private String mes;

    public Factura(String codigo, String nombreEmpresa, int año, String mes) {
        this.codigo = codigo;
        this.nombreEmpresa = nombreEmpresa;
        this.año = año;
        this.mes = mes;
    }
}
