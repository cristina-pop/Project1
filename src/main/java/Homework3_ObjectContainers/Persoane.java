package Homework3_ObjectContainers;

import java.util.Objects;

public class Persoane {
    private String name;
    private int age;

    public Persoane(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + name + '\'' +
                "varsta='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoane persoana = (Persoane) o;
        return age == persoana.age &&
                Objects.equals(name, persoana.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
