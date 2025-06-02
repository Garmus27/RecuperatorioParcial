import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tarea {
    private String descripcion;
    private Date fecha;
    private Sector sector;
    private List<Voluntario> voluntarios;

    public void addVoluntario(Voluntario voluntario) {
        if(voluntarios == null) voluntarios = new ArrayList<Voluntario>();
        voluntarios.add(voluntario);
        voluntario.realizarTarea(this);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
        this.sector.setTarea(this);
    }

    public List<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(List<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }
}