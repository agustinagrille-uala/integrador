package model.enfrentable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Liga extends Enfrentable {

    private List<Enfrentable> integrantes;

    public Liga(String nombre, String nombreFantasia, List<Enfrentable> integrantes) {
        super(nombre, nombreFantasia);
        this.integrantes = integrantes;
    }

    public Liga(String nombre, String nombreFantasia) {
        super(nombre, nombreFantasia);
    }

    public boolean addIntegrante(Enfrentable e) {
        if(!this.integrantes.contains(e)) {
            this.integrantes.add(e);
            return true;
        }
        return false;
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
            tempPersonajes.add((Personaje) e));

        return tempPersonajes;
    }
}