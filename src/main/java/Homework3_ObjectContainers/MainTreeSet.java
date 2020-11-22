package Homework3_ObjectContainers;

import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        NameComparator nameComparator = new NameComparator();
        Set<Persoane> persons = new TreeSet<>(nameComparator);
        persons.add(new Persoane("Mihai", 35));
        persons.add(new Persoane("Ana", 23));
        persons.add(new Persoane("Liana", 42));

        for (Persoane persoana: persons) {
            System.out.println(persoana);
        }

        AgeComparator ageComparator = new AgeComparator();
        Set<Persoane> ageSortedPersons = new TreeSet<>(ageComparator);
        ageSortedPersons.addAll(persons);

        System.out.println("--");
        for (Persoane persoana: ageSortedPersons) {
            System.out.println(persoana);
        }
    }
}
