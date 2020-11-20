package Homework3_ObjectContainers;

import java.util.Comparator;

public class AgeComparator implements Comparator<Persoane> {
    @Override
    public int compare(Persoane o1, Persoane o2) {
        return o1.getAge() - o2.getAge();
    }
}
