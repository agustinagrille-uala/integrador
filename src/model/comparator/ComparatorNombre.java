package model.comparator;

import model.enfrentable.Enfrentable;

import java.util.Comparator;

public class ComparatorNombre implements Comparator<Enfrentable> {
    @Override
    public int compare(Enfrentable o1, Enfrentable o2) {
        if(o1.getNombreFantasia().length() > o2.getNombreFantasia().length())
            return 1;
        else if (o1.getNombreFantasia().length() < o2.getNombreFantasia().length())
            return -1;
        else
            return 0;
    }
}
