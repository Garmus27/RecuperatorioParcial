import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Capacitacion {
    private String tema;
    private Date fecha;
    private List<Voluntario> asistentes;
    private Capacitador capacitador;

    //punto 4
    public void mostrarAsistentes(){
        this.asistentes.forEach(Voluntario::mostrarAsistente);

    }

    public void addAsistentes(Voluntario voluntario) {
        if(asistentes == null) asistentes = new ArrayList<Voluntario>();
        asistentes.add(voluntario);
        voluntario.setCapacitacion(this);
    }

    public Capacitador getCapacitador() {
        return capacitador;
    }

    public void setCapacitador(Capacitador capacitador) {
        this.capacitador = capacitador;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Voluntario> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(List<Voluntario> asistentes) {
        this.asistentes = asistentes;
    }
}