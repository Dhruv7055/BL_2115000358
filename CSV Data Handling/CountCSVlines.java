package org.example;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVlines {
    public static void main(String args[]) {
        String csvFile = "employees.csv";
        int rowCount = 0;
        try (CSVReader csvReader = new CSVReader(new FileReader(csvFile))) {
            csvReader.readNext();
            while (csvReader.readNext() != null) {
                rowCount++;
            }
            System.out.println("Total Records (excluding header): " + rowCount);
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}

