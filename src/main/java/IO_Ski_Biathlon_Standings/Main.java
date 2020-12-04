package IO_Ski_Biathlon_Standings;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String... args) {
        List<Athlete> athletes = readAthletesFromCSV();

        for (Athlete b : athletes) {
            System.out.println(b);
        }
    }

    private static List<Athlete> readAthletesFromCSV() {
        List<Athlete> athletes = new ArrayList<>();
        Path pathToFile = Paths.get("src/main/resources/athlete_results.csv");
        System.out.println(pathToFile.toAbsolutePath());

        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.UTF_8)) {

            String line = br.readLine();

            while (line != null) {

                String[] attributes = line.split(",");
                Athlete athlete = createAthlete(attributes);
                athletes.add(athlete);
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return athletes;
    }

    private static Athlete createAthlete(String[] metadata) {
        int number = Integer.parseInt(metadata[0]);
        String name = metadata[1];
        String country_code = metadata[2];

        return new Athlete(number, name, country_code);
    }
}
