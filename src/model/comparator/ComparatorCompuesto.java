package model.comparator;

import model.enfrentable.Enfrentable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorCompuesto implements Comparator<Enfrentable> {
    private List<Comparator> comparators;

    public ComparatorCompuesto(){
        comparators = new ArrayList<>();
    }

    public ComparatorCompuesto(List<Comparator> comparators) {
        this.comparators = comparators;
    }

    public boolean addComparator(Comparator... c){
        this.comparators.addAll(Arrays.asList(c));
        return true;
    }

    public boolean addComparatorByIndex(Comparator c, int index){
        this.comparators.add(index,c);
        return true;
    }

    @Override
    public int compare(Enfrentable o1, Enfrentable o2) {
        int var = 0;
        //this.comparators.forEach(e -> System.out.println(var));
        for (Comparator c : comparators) {
            var = c.compare(o1, o2);
        }
        return var;
    }
}
