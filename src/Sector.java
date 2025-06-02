import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sector {
    private String nombre;
    private String descripcion;
    private Tarea tarea;
    private List<Cultivo> cultivos;

    //punto 3
    public List<Cosecha> getCosechas(){
        return cultivos.stream().flatMap(cultivo -> cultivo.getCosechas().stream()).collect(Collectors.toList());
    }

    public void addCultivo(Cultivo cultivo) {
        if (cultivos == null) cultivos = new ArrayList<Cultivo>();
        cultivos.add(cultivo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public List<Cultivo> getCultivos() {
        return cultivos;
    }

    public void setCultivos(List<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }

    public List<Cosecha> getCosechasDelSector(){
        return null;
    }

}