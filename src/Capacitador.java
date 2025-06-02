public class Capacitador extends Persona {
    private String especialidad;
    private Capacitacion capacitacion;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Capacitacion getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(Capacitacion capacitacion) {
        this.capacitacion = capacitacion;
        this.capacitacion.setCapacitador(this);
    }
}