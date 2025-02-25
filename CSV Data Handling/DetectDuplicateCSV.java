package org.example;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class DetectDuplicateCSV {
    public static void main(String[] args) {
        String filePath = "students.csv";
        Set<String> uniqueIds = new HashSet<>();
        List<String[]> duplicateRecords = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] record;
            boolean isHeader = true;

            while ((record = reader.readNext()) != null) {
                // Skip header row
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String id = record[0].trim();

                if (!uniqueIds.add(id)) {
                    duplicateRecords.add(record);
                }
            }

            if (duplicateRecords.isEmpty()) {
                System.out.println("No duplicate records found!");
            } else {
                System.out.println("Duplicate records found:");
                for (String[] duplicate : duplicateRecords) {
                    System.out.println(String.join(", ", duplicate));
                }
            }

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
