package org.example;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Dhruv Agarwal\\IdeaProjects\\CSVJAVA\\src\\main\\java\\org\\example\\Employeewithemail";

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        String phoneRegex = "^[0-9]{10}$";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] record;
            String[] header = reader.readNext();

            boolean hasErrors = false;

            while ((record = reader.readNext()) != null) {
                String email = record[3];
                String phone = record[4];

                boolean emailValid = emailPattern.matcher(email).matches();
                boolean phoneValid = phonePattern.matcher(phone).matches();

                if (!emailValid || !phoneValid) {
                    hasErrors = true;
                    System.out.println("Invalid Record: " + String.join(", ", record));
                    if (!emailValid) System.out.println(" Invalid Email: " + email);
                    if (!phoneValid) System.out.println(" Invalid Phone Number: " + phone);
                }
            }

            if (!hasErrors) {
                System.out.println(" All records are valid!");
            }

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}

