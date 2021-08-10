package model.enfrentable;

import model.atributo.Atributo;

import java.util.List;
import java.util.Map;

public class Personaje extends Enfrentable {

    private Map<String, Atributo> atributos;

    public Personaje(String nombre, String nombreFantasia) {
        super(nombre, nombreFantasia);
    }

    public boolean addAtributo(String k, Atributo a) {
         if(this.atributos.get(k) == null) {
            this.atributos.put(k, a);
            return true;
         } else {
            return false;
         }
    }

    @Override
    public float getValorAtributo(String key) {
        if(this.atributos.get(key).getValor(this) == 0.0f) {
            return 0.0f;
        }else {
            return this.atributos.get(key).getValor(this);
        }
    }

    @Override
    protected List<Personaje> getPersonajes() {
        return this.getPersonajes();
    }
}