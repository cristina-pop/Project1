package Homework3_ObjectContainers;

import java.util.Comparator;
import java.util.Objects;

public class NameComparator implements Comparator<Persoane> {
    @Override
     public int compare(Persoane o1, Persoane o2) {
         return o1.getName().compareTo(o2.getName());
     }
}