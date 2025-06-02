import java.util.Date;

public class Turno {
    private Date fecha;
    private String horario;

    public Turno(Date fecha, String horario) {
        this.fecha = fecha;
        this.horario = horario;
    }

    public Turno() {

    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}