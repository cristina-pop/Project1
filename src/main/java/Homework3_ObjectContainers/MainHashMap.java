package Homework3_ObjectContainers;

import java.util.*;

public class MainHashMap {
    public static void main(String[] args) {

        Map<Persoane, List<Hobby>> hobbyPersoane = new HashMap<>();

        Hobby h1 = new Hobby("swimming", 2);
        Hobby h2 = new Hobby("cycling", 4);
        h1.addHobbyAddress(new Hobby.HobbyAddress("basin", "Romania"));
        h2.addHobbyAddress(new Hobby.HobbyAddress("circuit", "France"));
        h2.addHobbyAddress(new Hobby.HobbyAddress("circuit", "Romania"));

        List<Hobby> listHobby = new ArrayList<>();

        listHobby.add(h1);
        listHobby.add(h2);

        Persoane p1 = new Persoane("Mark", 22);
        Persoane p2 = new Persoane("Laura", 25);
        Persoane p3 = new Persoane("Sara", 16);
        Persoane p4 = new Persoane("Rob", 34);
        Persoane p5 = new Persoane("Paul", 41);
        Persoane p6 = new Persoane("Mircea", 46); // .....

        hobbyPersoane.put(p1, listHobby);
        hobbyPersoane.put(p2, listHobby);
        hobbyPersoane.put(p3, listHobby);
        hobbyPersoane.put(p4, listHobby);
        hobbyPersoane.put(p5, listHobby);
        hobbyPersoane.put(p6, listHobby);

        for (Map.Entry<Persoane, List<Hobby>> hobbies : hobbyPersoane.entrySet()) {
            System.out.println(hobbies.getKey() + "'\n' " + " " + hobbies.getValue());
        }
    }
}

