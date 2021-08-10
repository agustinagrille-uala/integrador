package model.enfrentable;

import java.util.Comparator;
import java.util.List;

public abstract class Enfrentable {

    protected String nombre;
    protected String nombreFantasia;

    public Enfrentable(String nombre, String nombreFantasia) {
        this.nombre = nombre;
        this.nombreFantasia = nombreFantasia;
    }

    public Enfrentable enfrentar(Enfrentable e, Comparator c) {
        return e;
    }

    public List<Personaje> ordenar(Comparator c) {
        return null;
    }

    public abstract float getValorAtributo(String key);

    protected abstract List<Personaje> getPersonajes();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }

    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }
}
