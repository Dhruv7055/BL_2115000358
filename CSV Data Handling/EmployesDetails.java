package org.example;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeesDetails {
    public static void main(String[] args) {
        String csvFile = "employees.csv";
        String[][] employees = {
                {"101", "Alice Johnson", "HR", "55000"},
                {"102", "Bob Smith", "IT", "75000"},
                {"103", "Charlie Brown", "Finance", "62000"},
                {"104", "David White", "Marketing", "68000"},
                {"105", "Emma Davis", "Operations", "72000"}
        };

        try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile))) {

            writer.writeNext(new String[]{"ID", "Name", "Department", "Salary"});
            for (String[] employee : employees) {
                writer.writeNext(employee);
            }

            System.out.println("CSV file written successfully: " + csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
