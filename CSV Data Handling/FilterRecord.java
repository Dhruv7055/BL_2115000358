package org.example;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
public class FilterRecord {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        try (CSVReader csvReader = new CSVReader(new FileReader(csvFile))) {
            String[] nextRecord;
            csvReader.readNext();
            System.out.println("Students who scored more than 80 marks:");
            while ((nextRecord = csvReader.readNext()) != null) {
                int marks = Integer.parseInt(nextRecord[3]);

                if (marks > 80) {
                    System.out.println("ID: " + nextRecord[0] + ", Name: " + nextRecord[1] +
                            ", Age: " + nextRecord[2] + ", Marks: " + nextRecord[3]);
                }
            }
        } catch (IOException | CsvValidationException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
