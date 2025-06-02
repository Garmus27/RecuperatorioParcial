import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cultivo {
    private String especie;
    private TipoCultivo tipoCultivo;
    private Date fechaSiembra;
    private List<Cosecha> cosechas;

    public void addCosecha(Cosecha cosecha) {
       if (cosechas == null) cosechas = new ArrayList<Cosecha>();
       cosechas.add(cosecha);
       cosecha.setCultivo(this);
    }

    public List<Cosecha> getCosechas() {
        return cosechas;
    }

    public void setCosechas(List<Cosecha> cosechas) {
        this.cosechas = cosechas;
    }

    @Override
    public String toString() {
        return
                "especie='" + especie +
                ", tipoCultivo=" + tipoCultivo +
                ", fechaSiembra=" + fechaSiembra ;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public TipoCultivo getTipoCultivo() {
        return tipoCultivo;
    }

    public void setTipoCultivo(TipoCultivo tipoCultivo) {
        this.tipoCultivo = tipoCultivo;
    }

    public Date getFechaSiembra() {
        return fechaSiembra;
    }

    public void setFechaSiembra(Date fechaSiembra) {
        this.fechaSiembra = fechaSiembra;
    }
}