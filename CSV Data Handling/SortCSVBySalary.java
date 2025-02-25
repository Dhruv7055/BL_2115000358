package org.example;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortCSVBySalary {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        List<String[]> records = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] record;
            String[] header = reader.readNext();

            while ((record = reader.readNext()) != null) {
                records.add(record);
            }

            records.sort(Comparator.comparingDouble(r -> -Double.parseDouble(r[3])));

            System.out.println(String.join(", ", header));
            int count = Math.min(5, records.size());
            for (int i = 0; i < count; i++) {
                System.out.println(String.join(", ", records.get(i)));
            }

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
