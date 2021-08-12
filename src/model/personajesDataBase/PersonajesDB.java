package model.personajesDataBase;

import model.enfrentable.Enfrentable;
import model.enfrentable.Personaje;

import java.util.List;

public class PersonajesDB {
    public static List<Enfrentable> personajes(){
        return List.of(new Personaje("Agus","AgusGrosa"),
                new Personaje("Ali", "BombardeadorMaster"),
                new Personaje("Messi", "SuperPelotin"),
                new Personaje("elmo", "Batman"));
    }
}
