package model.enfrentable;

import java.util.*;

public class Liga extends Enfrentable {

    private List<Enfrentable> integrantes = new ArrayList<>();

    public Liga(String nombre, String nombreFantasia, List<Enfrentable> integrantes) {
        super(nombre, nombreFantasia);
        this.integrantes.addAll(integrantes);
    }

    public Liga(String nombre, String nombreFantasia) {
        super(nombre, nombreFantasia);
    }

    public boolean addIntegrante(Enfrentable... e) {
        this.integrantes.addAll(Arrays.asList(e));
        return true;
    }

    @Override
    public float getValorAtributo(String key) {
        DoubleSummaryStatistics valorPromedio = this.integrantes.stream()
                .mapToDouble(enfrentable -> enfrentable.getValorAtributo(key))
                .summaryStatistics();

        return (float)valorPromedio.getAverage();
    }

    @Override
    public List<Personaje> getPersonajes() {
        List<Personaje> tempPersonajes = new ArrayList<>();
        this.integrantes.forEach(e ->
                tempPersonajes.addAll(e.getPersonajes()));

        return tempPersonajes;
    }
}