package src.main;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CsvGenerator {

    public static void generateCsv(List<Record> records, String outputPath) {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get(outputPath)))) {

            writer.println(";;;");
            writer.println("Liczba Testcase'ow;Liczba Poprawnych Testow;Liczba Niepoprawnych Testow;Procentowy status ukonczenia");
            int liczbaPoprawnych = (int) records.stream().filter(Record::isMatching).count();
            int liczbaTestow = records.size();
            int liczbaNiepoprawnych = liczbaTestow - liczbaPoprawnych;
            double procentUkonczenia = ((double) liczbaPoprawnych / liczbaTestow) * 100;
            writer.printf("%d;%d;%d;%.2f%%\n", liczbaTestow, liczbaPoprawnych, liczbaNiepoprawnych, procentUkonczenia);
            writer.println(";;;");
            for (Record record : records) {
                String status = record.isMatching() ? "Test Poprawny" : "Test Niepoprawny";
                writer.printf("%s;%s;%s;\n", record.getTytul(), record.getZrodlo(), status);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
