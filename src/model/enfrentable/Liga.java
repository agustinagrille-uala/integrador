package model.enfrentable;

import java.util.ArrayList;
import java.util.List;

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
        this.integrantes.add(e);
        return true;
    }

    @Override
    public float getValorAtributo(String key) {
        return 0.0f;
    }

    @Override
    protected List<Personaje> getPersonajes() {
        List<Personaje> tempPersonajes = new ArrayList<>();

        this.integrantes.forEach(e -> {
            if(e instanceof Personaje) {
                tempPersonajes.add((Personaje) e);
            }
        });
        return tempPersonajes;
    }
}