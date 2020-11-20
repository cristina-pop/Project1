package Homework3_ObjectContainers;

import java.util.*;

public class MainHashMap {
    public static void main(String[] args) {

        Map<Persoane, List<Hobby>> hobbyPersoane = new HashMap<>();

        Hobby h1 = new Hobby("swimming", 2);
        h1.addHobbyAddress(new Hobby.HobbyAddress("basin", "Romania"));

        List<Hobby> listHobby = new ArrayList<>();

        listHobby.add(h1);

        Persoane p1 = new Persoane("Mark", 22);
        hobbyPersoane.put(p1, listHobby);

        for (Map.Entry<Persoane, List<Hobby>> hobbies : hobbyPersoane.entrySet()) {
            System.out.println(hobbies.getKey() + " " + hobbies.getValue());
        }
//        persoane.put(new Persoane("Mark", 22), );
//        persoane.put(new Persoane("Laura", 25));
//        persoane.put(new Persoane("Sara", 16));
//        persoane.put(new Persoane("Rob", 34));
//        persoane.put(new Persoane("Paul", 41));
//        persoane.put(new Persoane("Mircea", 46)); // .....

    }
}

