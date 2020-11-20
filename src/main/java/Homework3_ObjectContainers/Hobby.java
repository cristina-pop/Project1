package Homework3_ObjectContainers;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    String name;
    int frequency;

    List<HobbyAddress> hobbyAddress= new ArrayList<HobbyAddress>();

    public Hobby(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    static class HobbyAddress {
        String address;
        String country;

        public HobbyAddress(String address, String country){
            this.address = address;
            this.country = country;
        }

        public String getAddress() {
            return address;
        }

        public String getCountry() {
            return country;
        }
        @Override
        public String toString() {
            return "Hobby{" +
                    "adresa='" + getAddress() + " " + getCountry() + '\'' +
                    '}';
        }
    }
    public void addHobbyAddress(HobbyAddress hA) {
        hobbyAddress.add(hA);
    }

}
