import java.time.LocalDate;
import java.util.Date;

public class Cosecha {
    private LocalDate fecha;
    private double cantidadKg;
    private Cultivo cultivo;


    public double getCantidadKg() {
        return cantidadKg;
    }

    public void setCantidadKg(double cantidadKg) {
        this.cantidadKg = cantidadKg;
    }


    public Cultivo getCultivo() {
        return cultivo;
    }

    public void setCultivo(Cultivo cultivo) {
        this.cultivo = cultivo;
        cultivo.addCosecha(this);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return
                "fecha= " + fecha +
                ", cantidadKg= " + cantidadKg +
                ", cultivo= " + cultivo ;
    }
}