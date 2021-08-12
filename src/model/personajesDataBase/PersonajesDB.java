package model.personajesDataBase;

import model.atributo.AtributoSimple;
import model.enfrentable.Enfrentable;
import model.enfrentable.Personaje;

import java.util.List;

public class PersonajesDB {

    public static List<Enfrentable> personajes(){
        AtributoSimple atributo1 = new AtributoSimple(25.5f);
        AtributoSimple atributo2 = new AtributoSimple(35.5f);
        AtributoSimple atributo4 = new AtributoSimple(60f);
        AtributoSimple atributo5 = new AtributoSimple(100f);
        String atributoName = "Velocidad";

        //Creamos una lista de personajes
         List<Enfrentable> lista = List.of(new Personaje("Agus","AgusGrosa"),
                                         new Personaje("Ali", "BombardeadorMaster"),
                                         new Personaje("Messi", "SuperPelotin"),
                                         new Personaje("elmo", "Batman"));
        lista.forEach(e -> ((Personaje)e).addAtributo(atributoName,atributo1));

        return lista;
    }
}
