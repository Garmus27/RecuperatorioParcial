import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Voluntario extends Persona{
    public Turno turno;
    private List<Tarea> tareasRealizadas;
    private Capacitacion capacitacion;



    public void mostrarAsistente(){
        System.out.println("Nombre: "+ this.getNombre() + "DNI: "+ this.getDni());
    }

    @Override
    public String toString() {
        return
                "turno= " + turno +
                ", tareasRealizadas= " + tareasRealizadas +
                ", capacitacion= " + capacitacion;
    }

    public Voluntario(Date date, String time) {
        super();
        Turno turno = new Turno(date, time);
    }

    public void realizarTarea(Tarea tarea){
        if(this.tareasRealizadas==null) this.tareasRealizadas = new ArrayList<Tarea>();
        this.tareasRealizadas.add(tarea);
    }

    public Capacitacion getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(Capacitacion capacitacion) {
        this.capacitacion = capacitacion;

    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public List<Tarea> getTareasRealizadas() {
        return tareasRealizadas;
    }

    public void setTareasRealizadas(List<Tarea> tareasRealizadas) {
        this.tareasRealizadas = tareasRealizadas;
    }
}