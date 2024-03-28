package src.main;

import java.util.List;

public class RecordValidator {

    public static List<Record> validate(List<Record> records) {
        for (Record record : records) {
            if (record.getPrzetworzoneZrodlo() == null || record.getPrzetworzoneZrodlo().equals(record.getWzor())) {
                record.setMatching(true);
            } else {
                record.setMatching(false);
            }
        }
        return records;
    }

}
