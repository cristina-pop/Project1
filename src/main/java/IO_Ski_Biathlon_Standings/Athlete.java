package IO_Ski_Biathlon_Standings;

public class Athlete {

    private String name;
    private int number;
    private String country_code;

    public Athlete(int number, String name, String country_code) {
        this.name = name;
        this.number = number;
        this.country_code = country_code;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int price) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    @Override
    public String toString() {
        return "Athlete [name=" + name + ", number=" + number + ", country code=" + country_code
                + "]";
    }
}
