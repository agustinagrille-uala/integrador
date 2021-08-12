package model.enfrentable;

import model.atributo.Atributo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Personaje extends Enfrentable {

    private Map<String, Atributo> atributos;

    public Personaje(String nombre, String nombreFantasia) {
        super(nombre, nombreFantasia);
        this.atributos = new HashMap<>();
    }

    public boolean addAtributo(String key, Atributo atributo) {
         if(this.atributos.get(key) == null) {
            this.atributos.put(key, atributo);
            return true;
         } else {
            return false;
         }
    }

    @Override
    public float getValorAtributo(String key) {
            return this.atributos.get(key).getValor(this);
    }

    @Override
    public List<Personaje> getPersonajes() {
        List<Personaje> personajes = new ArrayList<>();
        personajes.add(this);
        return personajes;
    }

    @Override
    public String toString() {
        return "Identidad Supersecreta: "+nombre+"Identidad de Heroe/Villano: "+nombreFantasia;
    }
}