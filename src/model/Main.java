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
        //Iniciamos el juego...
        Juego juego = new Juego();

        //Creamos 4 personajes iniciales...

        Personaje ps = new Personaje("Pepe Argento", "SuperPepin");
        System.out.println("Nuevo personaje creado "+ps.getNombreFantasia());
        Personaje ps2 = new Personaje("Elmo", "ElmoSabeDondeVivesMan");
        System.out.println("Nuevo personaje creado "+ps2.getNombreFantasia());
        Personaje ps3 = new Personaje("Clark Kent", "Superman");
        System.out.println("Nuevo personaje creado "+ps3.getNombreFantasia());
        Personaje ps4 = new Personaje("Peter Parker", "Spiderman");
        System.out.println("Nuevo personaje creado "+ps4.getNombreFantasia());


        //Creamos algunos atributos...
        AtributoSimple atributo1 = new AtributoSimple(25.5f);
        AtributoSimple atributo2 = new AtributoSimple(35.5f);
        AtributoSimple atributo4 = new AtributoSimple(60f);
        AtributoSimple atributo5 = new AtributoSimple(100f);
        AtributoOperacion atributo3 = new AtributoOperacion("Velocidad", "Fuerza");
        AtributoCondicional atributoCondicional = new AtributoCondicional( "Fuerza", "Velocidad", atributo1, atributo5);

        ps2.addAtributo("PoderMaximo", atributoCondicional);
        ps2.addAtributo("Velocidad",atributo5);
        ps3.addAtributo("PoderMaximo", atributoCondicional);
        ps3.addAtributo("Velocidad",atributo4);
        ps3.addAtributo("Fuerza", atributo2);
        ps4.addAtributo("Velocidad",atributo4);


        System.out.println(atributoCondicional.getValor(ps3));

        //Creamos una liga
        Liga liga1 = new Liga("SuperCampeones", "SuperCampeones",PersonajesDB.personajes());
        System.out.println("La liga "+liga1.getNombreFantasia()+" ha sido creada.");
        System.out.println("Los miembros de liga "+liga1.getNombreFantasia()+"son "+liga1.getPersonajes());
        //Creamos una liga a la cual liga1 pertenece
        Liga liga2 = new Liga("SuperUalaseros", "SuperUalaseros");
        System.out.println("La liga "+liga2.getNombreFantasia()+" ha sido creada.");
        liga2.addIntegrante(ps4);
        System.out.println(ps4.getNombreFantasia()+" se ha unido a la liga "+liga2.getNombreFantasia());
        liga2.addIntegrante(liga1);
        System.out.println("La liga "+liga1.getNombreFantasia()+" se ha unido a "+liga2.getNombreFantasia());
        System.out.println("Los miembros de "+liga2.getNombreFantasia()+" son "+liga2.getPersonajes());
        System.out.println("El promedio de poder de la liga "+liga2.getNombreFantasia()+" asciende a "+liga2.getValorAtributo("Velocidad"));

        //Creamos comparadores
        ComparatorNombre cNombre = new ComparatorNombre();
        ComparatorCompuesto cCompuesto = new ComparatorCompuesto();
        ComparatorCriterioSimple cCriterioSimple = new ComparatorCriterioSimple("Velocidad");
        cCompuesto.addComparator(cCriterioSimple);

        System.out.println("¡Se enfrentan dos personajes! "+ps+" y "+ps4);
        juego.enfrentar(ps,ps4,cNombre);
        System.out.println("¡HORA DE LA BATALLA FINAL ULTRAVIOLENTA!");
        System.out.println("¡Se enfrentan! "+ps2+" y la liga "+liga2.getNombreFantasia());
        System.out.println("El promedio de poder de "+ps2.getNombreFantasia()+" es de "+ps2.getValorAtributo("Velocidad"));
        ps2.enfrentar(liga2, cCriterioSimple);



    }
}
