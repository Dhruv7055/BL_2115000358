package org.example;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class RecordSearch {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        boolean found = false;
        try (CSVReader read = new CSVReader(new FileReader(filePath))) {
            String[] record;
            read.readNext();

            while ((record = read.readNext()) != null) {
                String name = record[1];

                if (name.equals("Alice Johnson")) {
                    System.out.println("Record Found: " + String.join(", ", record));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Record Not Found.");
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
