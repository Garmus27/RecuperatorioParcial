import java.time.LocalDate;

public class Donacion {
    private TipoDonacion tipoDonacion;
    private String descripcion;
    private LocalDate fecha;

    @Override
    public String toString() {
        return
                "tipoDonacion= " + tipoDonacion +
                ", descripcion= " + descripcion +
                ", fecha= " + fecha ;
    }

    private Donante donante;

    public Donante getDonante() {
        return donante;
    }

    public void setDonante(Donante donante) {
        this.donante = donante;
    }

    public TipoDonacion getTipoDonacion() {
        return tipoDonacion;
    }

    public void setTipoDonacion(TipoDonacion tipoDonacion) {
        this.tipoDonacion = tipoDonacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}