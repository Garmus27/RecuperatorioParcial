import java.sql.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cultivo manzana = new Cultivo();
        manzana.setEspecie("Red Love");
        manzana.setTipoCultivo(TipoCultivo.FRUTAL);
        manzana.setFechaSiembra(Date.valueOf(LocalDate.now()));

        Cultivo frutilla = new Cultivo();
        frutilla.setEspecie("Iberia");
        frutilla.setTipoCultivo(TipoCultivo.FRUTAL);
        frutilla.setFechaSiembra(Date.valueOf(LocalDate.now()));

        Sector sector1 = new Sector();
        sector1.setNombre("Frutales");
        sector1.setDescripcion("Manzano, Duraznero, Nogal, Olivo, etc");
        sector1.addCultivo(manzana);
        sector1.addCultivo(frutilla);

        Cultivo lavanda = new Cultivo();
        lavanda.setEspecie("Pure Mountain");
        lavanda.setTipoCultivo(TipoCultivo.AROMATICA);

        Cultivo cardamomo = new Cultivo();
        cardamomo.setEspecie("Intense colombian");
        cardamomo.setTipoCultivo(TipoCultivo.AROMATICA);

        Sector sector2 = new Sector();
        sector2.setNombre("Aromaticos");
        sector2.setDescripcion("Aromaticos como lavanda, cardamomo, oud, lino, menta, pachuli");

        Cosecha primeraCosecha = new Cosecha();
        primeraCosecha.setCultivo(manzana);
        primeraCosecha.setFecha(LocalDate.now());
        primeraCosecha.setCantidadKg(1500);

        Cosecha segundaCosecha = new Cosecha();
        segundaCosecha.setCultivo(manzana);
        segundaCosecha.setFecha(LocalDate.now().plusYears(1));
        segundaCosecha.setCantidadKg(2300);

        Tarea tarea1 = new Tarea();
        tarea1.setDescripcion("siembra de semillas");
        tarea1.setSector(sector1);
        tarea1.setFecha(Date.valueOf(LocalDate.now()));

        Tarea tarea2 = new Tarea();
        tarea2.setDescripcion("Riego de semillas");
        tarea2.setSector(sector1);
        tarea2.setFecha(Date.valueOf(LocalDate.now().plusMonths(2)));

        Domicilio domicilio1 = new Domicilio();
        domicilio1.setCalle("Las perinolas");
        domicilio1.setNumero("1111");
        domicilio1.setLocalidad("Los piedrasos");
        domicilio1.setProvincia("San Juan");

        Voluntario voluntario1 = new Voluntario(Date.valueOf(LocalDate.now()),"20:00");
        voluntario1.setNombre("El maquinola");
        voluntario1.setDni("485162354");
        voluntario1.setEmail("el_maquinola@gmail.com");
        voluntario1.setDomicilio(domicilio1);
        voluntario1.realizarTarea(tarea1);
        voluntario1.realizarTarea(tarea2);

        Domicilio domicilio2 = new Domicilio();
        domicilio2.setCalle("Carril Bonfante");
        domicilio2.setNumero("2222");
        domicilio2.setLocalidad("San Juan");
        Voluntario voluntario2 = new Voluntario(Date.valueOf(LocalDate.now()),"18:00");
        voluntario2.setNombre("Tito sama");
        voluntario2.setDni("485154354");
        voluntario2.setEmail("titosama@gmail.com");
        voluntario2.setDomicilio(domicilio2);

        Capacitacion capacitacion1 = new Capacitacion();
        capacitacion1.addAsistentes(voluntario2);
        capacitacion1.addAsistentes(voluntario1);
        capacitacion1.setTema("Procedimientos de seguridad ante siniestros");
        capacitacion1.setFecha(Date.valueOf(LocalDate.now()));

        Domicilio domicilio3 = new Domicilio();
        domicilio3.setCalle("cochabamba");
        domicilio3.setNumero("22322");
        domicilio3.setLocalidad("lomas de garompa");
        domicilio3.setProvincia("San Juan");

        Capacitador capacitador1 = new Capacitador();
        capacitador1.setNombre("riki");
        capacitador1.setEspecialidad("seguridad e higiene");
        capacitador1.setEmail("riki@gmail.com");
        capacitador1.setDomicilio(domicilio3);

        capacitacion1.setCapacitador(capacitador1);

        Domicilio domicilio4 = new Domicilio();
        domicilio4.setCalle("cochabamba");
        domicilio4.setNumero("22");
        domicilio4.setLocalidad("Capital");
        domicilio4.setProvincia("San Juan");

        Donante donante1 = new Donante();
        donante1.setNombre("oscar");
        donante1.setEmail("oscar@gmail.com");
        donante1.setDomicilio(domicilio4);

        Donacion donacion1 = new Donacion();
        donacion1.setDescripcion("Donacion de 1.000.000");
        donacion1.setFecha(LocalDate.now());
        donacion1.setTipoDonacion(TipoDonacion.DINERO);
        donacion1.setDonante(donante1);








    }
}