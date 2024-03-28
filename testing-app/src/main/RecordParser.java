package src.main;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RecordParser {

    public static List<Record> parseRecords(String path) {
        List<Record> rekordy = new ArrayList<>();
        try {
            List<String> linie = Files.readAllLines(Paths.get(path));
            Record rekord = new Record();
            for (String linia : linie) {
                if (linia.startsWith("##########")) {
                    if (!rekord.getTytul().isBlank()) {
                        rekordy.add(rekord);
                    }
                    rekord = new Record();
                } else if (linia.startsWith("<TITLE>")) {
                    rekord.setTytul(linia.substring(7).trim());
                } else if (linia.startsWith("<ZRODLO>")) {
                    rekord.setZrodlo(linia.substring(8).trim());
                } else if (linia.startsWith("<####>")) {
                    rekord.setPrzetworzoneZrodlo(linia.substring(6).trim());
                } else if (linia.startsWith("<WZOR>")) {
                    rekord.setWzor(linia.substring(6).trim());
                }
            }
            if (rekord != null && rekord.getTytul() != null) {
                rekordy.add(rekord);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rekordy;
    }

}
