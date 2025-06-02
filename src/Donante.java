import java.util.ArrayList;
import java.util.List;

public class Donante extends Persona{
    private List<Donacion> donaciones;


    //ultimo punto
    public void mostrarDonaciones(){
        this.donaciones.forEach(System.out::println);
    }

    public void addDonacion(Donacion donacion){
        if(donaciones == null) donaciones = new ArrayList<>();
        donaciones.add(donacion);
        donacion.setDonante(this);
    }

    public List<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(List<Donacion> donaciones) {
        this.donaciones = donaciones;
    }
}