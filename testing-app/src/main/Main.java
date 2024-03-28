package src.main;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Record> rekordy = RecordParser.parseRecords("src/resources/Plik Konfiguracyjny.txt");
        List<Record> rekordy = RecordValidator.validate(RecordParser.parseRecords("src/resources/Plik Konfiguracyjny.txt"));
        for (Record rekord : rekordy) {
            System.out.println("Tytuł: " + rekord.getTytul());
            System.out.println(rekord.getZrodlo());
            System.out.println(rekord.getPrzetworzoneZrodlo());
            System.out.println(rekord.getWzor());
            System.out.println(rekord.isMatching());
        }

        CsvGenerator.generateCsv(rekordy, "src/resources/WynikiTestow.csv");
    }
}
