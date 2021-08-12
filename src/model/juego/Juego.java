package model.juego;

import model.enfrentable.Enfrentable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Juego {
    private List<Enfrentable> enfrentables;

    public Juego(){
        this.enfrentables = new ArrayList<>();
    }

    public List<Enfrentable> getQuienesVencen(Enfrentable e, Comparator c){
        return null;
    }

    public Enfrentable enfrentar(Enfrentable e1, Enfrentable e2, Comparator c){
        if(e1 != e2) {
            if (c.compare(e1, e2) > 1) {
                System.out.println("En la batalla final ultraviolenta ganó " + e1.getNombreFantasia());
                return e1;
            }else {
                System.out.println("En la batalla final ultraviolenta ganó " + e2.getNombreFantasia());
                return e2;
            }
        }
        return null;
    }

    public boolean addEnfrentable(Enfrentable... e){
        this.enfrentables.addAll(Arrays.asList(e));
        return true;
    }

    public List<Enfrentable> ordenarPersonajes(Comparator c){
        List<Enfrentable> listaOrdenada = (List<Enfrentable>) this.enfrentables.stream().sorted(c).collect(Collectors.toList());
        return listaOrdenada;

    }

}
