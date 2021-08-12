package model;

import model.atributo.Atributo;
import model.atributo.AtributoCondicional;
import model.atributo.AtributoOperacion;
import model.atributo.AtributoSimple;
import model.comparator.ComparatorCompuesto;
import model.comparator.ComparatorCriterioSimple;
import model.comparator.ComparatorNombre;
import model.enfrentable.Enfrentable;
import model.enfrentable.Personaje;
import model.juego.Juego;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Juego juego = new Juego();
      Personaje personaje = new Personaje("pepe", "AgusLaMejor");
      Personaje personaje2 = new Personaje("elmo", "Batman");
      Personaje ps3 = new Personaje("Messi", "SuperPelotin");

      AtributoSimple atributo1 = new AtributoSimple(25.5f);
      AtributoSimple atributo2 = new AtributoSimple(35.5f);
      AtributoOperacion atributo3 = new AtributoOperacion(34.4f, "velocidad", "fuerza");

      ComparatorNombre comparator = new ComparatorNombre();


        juego.addEnfrentar(personaje);
        juego.addEnfrentar(ps3);
        juego.addEnfrentar(personaje2);

        System.out.println(juego.ordenarPersonajes(comparator));
      personaje2.enfrentar(personaje, comparator);

    }
}
