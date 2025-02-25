package org.example;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ModifyCSV{
    public static void main(String[] args) {
        String inputFile = "employees.csv";
        String outputFile = "updated_employees.csv";
        List<String[]> allRecords = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(inputFile))) {
            String[] record;
            while ((record = reader.readNext()) != null) {
                if (allRecords.isEmpty()) {
                    allRecords.add(record);
                    continue;
                }

                if (record[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(record[3]);
                    salary *= 1.10;
                    record[3] = String.format("%.2f", salary);
                }

                allRecords.add(record);
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        try (CSVWriter writer = new CSVWriter(new FileWriter(outputFile))) {
            writer.writeAll(allRecords);
            System.out.println("Updated file saved as: " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
