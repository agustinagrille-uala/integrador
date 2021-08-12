package model;

import model.atributo.Atributo;
import model.atributo.AtributoCondicional;
import model.atributo.AtributoOperacion;
import model.atributo.AtributoSimple;
import model.comparator.ComparatorCompuesto;
import model.comparator.ComparatorCriterioSimple;
import model.comparator.ComparatorNombre;
import model.enfrentable.Enfrentable;
import model.enfrentable.Liga;
import model.enfrentable.Personaje;
import model.juego.Juego;
import model.personajesDataBase.PersonajesDB;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Juego juego = new Juego();
        Personaje personaje = new Personaje("pepe", "AgusLaMejor");
        Personaje personaje2 = new Personaje("elmo", "Batman");
        Personaje ps3 = new Personaje("Messi", "SuperPelotin");
        Personaje ps4 = new Personaje("Alí", "BombardeadorMaster");


        AtributoSimple atributo1 = new AtributoSimple(25.5f);
        AtributoSimple atributo2 = new AtributoSimple(35.5f);
        AtributoSimple atributo4 = new AtributoSimple(60f);
        AtributoSimple atributo5 = new AtributoSimple(100f);
        AtributoOperacion atributo3 = new AtributoOperacion("Velocidad", "Fuerza");
        AtributoCondicional atributoCondicional = new AtributoCondicional( "Fuerza", "Velocidad", atributo1, atributo5);

        ps3.addAtributo("podermaximo", atributoCondicional);
        ps3.addAtributo("Velocidad",atributo4);
        ps3.addAtributo("Fuerza", atributo2);

        System.out.println(atributoCondicional.getValor(ps3));

        Liga liga1 = new Liga("SuperCampeones", "SuperCampeones", PersonajesDB.personajes());
        Liga liga2 = new Liga("SuperUalaseros", "SuperUalaseros");
        liga2.addIntegrante(liga1);
        System.out.println(atributo3.getValor(ps3));

        ComparatorNombre cNombre = new ComparatorNombre();
        ComparatorCompuesto cCompuesto = new ComparatorCompuesto();
        ComparatorCriterioSimple cCriterioSimple = new ComparatorCriterioSimple("Velocidad");
        cCompuesto.addComparator(cCriterioSimple);
        //juego.addEnfrentable(personaje,ps3,personaje2);
        //personaje.enfrentar(ps3, cCompuesto);

    }
}
