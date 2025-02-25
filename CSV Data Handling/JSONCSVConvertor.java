package org.example;
import com.fasterxml.jackson.databind.*;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.*;
import java.util.*;

public class JSONCSVconvertor {
    private static final String JSON_FILE = "C:\\Users\\Dhruv Agarwal\\IdeaProjects\\CSVJAVA\\src\\main\\java\\org\\example\\students.json";
    private static final String CSV_FILE = "C:\\Users\\Dhruv Agarwal\\IdeaProjects\\CSVJAVA\\src\\main\\java\\org\\example\\students.csv";
    private static final String JSON_OUTPUT_FILE = "students_output.json";

    public static void main(String[] args) {
        jsonToCsv(JSON_FILE, CSV_FILE); 
        csvToJson(CSV_FILE, JSON_OUTPUT_FILE);  
    }

    public static void jsonToCsv(String jsonFilePath, String csvFilePath) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<Map<String, String>> students = objectMapper.readValue(new File(jsonFilePath), List.class);

            try (CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath))) {
                if (!students.isEmpty()) {
                    // Write CSV Header
                    writer.writeNext(students.get(0).keySet().toArray(new String[0]));
                }

                for (Map<String, String> student : students) {
                    writer.writeNext(student.values().toArray(new String[0]));
                }

                System.out.println("JSON converted to CSV: " + csvFilePath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void csvToJson(String csvFilePath, String jsonOutputFile) {
        try (CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {
            List<String[]> rows = reader.readAll();
            if (rows.isEmpty()) return;

            String[] headers = rows.get(0);
            List<Map<String, String>> studentList = new ArrayList<>();

            for (int i = 1; i < rows.size(); i++) {
                Map<String, String> student = new LinkedHashMap<>();
                for (int j = 0; j < headers.length; j++) {
                    student.put(headers[j], rows.get(i)[j]);
                }
                studentList.add(student);
            }

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(jsonOutputFile), studentList);
            System.out.println(" CSV converted to JSON: " + jsonOutputFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
