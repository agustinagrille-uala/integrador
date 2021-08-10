package model.comparator;

import model.enfrentable.Enfrentable;

import java.util.Comparator;

public class ComparatorCriterioSimple implements Comparator<Enfrentable> {

    private String atributo;
    public ComparatorCriterioSimple(String atributo){
        this.atributo = atributo;
    };

    @Override
    public int compare(Enfrentable o1, Enfrentable o2) {
        if(o1.getValorAtributo(atributo) > o2.getValorAtributo(atributo))
            return 1;
        else if (o1.getValorAtributo(atributo) < o2.getValorAtributo(atributo))
            return -1;
        else
            return 0;

    }
}
