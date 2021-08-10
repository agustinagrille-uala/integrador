package model.comparator;

import model.enfrentable.Enfrentable;

import java.util.Comparator;
import java.util.List;

public class ComparatorCompuesto implements Comparator<Enfrentable> {
    private List<Comparator> comparators;

    public ComparatorCompuesto(){}

    public ComparatorCompuesto(List<Comparator> comparators) {
        this.comparators = comparators;
    }

    public boolean addComparator(Comparator c){
        this.comparators.add(c);
        return true;
    }

    public boolean addComparatorByIndex(Comparator c, int index){
        this.comparators.add(index,c);
        return true;
    }

    @Override
    public int compare(Enfrentable o1, Enfrentable o2) {
        //DUDAS
        return 0;
    }
}
