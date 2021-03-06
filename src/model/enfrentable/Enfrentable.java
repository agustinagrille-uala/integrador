package model.enfrentable;

import java.util.Comparator;
import java.util.List;

public abstract class Enfrentable {

    protected String nombre;
    protected String nombreFantasia;
    private String ejemplo;


    public Enfrentable(String nombre, String nombreFantasia, String ejemplo) {
        this.nombre = nombre;
        this.nombreFantasia = nombreFantasia;
        this.ejemplo = ejemplo23asfafsafssaf;
        }

    public Enfrentable enfrentar(Enfrentable e, Comparator<Enfrentable> c) {
        if(c.compare(this, e) == 1) {
            System.out.println("En la batalla final ultraviolenta ganó: "+this.getNombreFantasia());
            return this;
        } else {
            System.out.println("En la batalla final ultraviolenta ganó: "+e.getNombreFantasia());
            return e;
        }
    }

    public List<Personaje> ordenar(Comparator c) {
        List<Personaje> listOrdenada = this.getPersonajes();
        listOrdenada.sort(c);

        return listOrdenada;
    }

    public abstract float getValorAtributo(String key);

    public abstract List<Personaje> getPersonajes();

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
