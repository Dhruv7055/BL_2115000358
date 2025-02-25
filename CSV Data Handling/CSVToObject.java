package org.example;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
=
class Student {
    private int id;
    private String name;
    private int age;
    private double marks;

    public Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student { ID=" + id + ", Name='" + name + "', Age=" + age + ", Marks=" + marks + " }";
    }
}

public class CSVToObject {
    public static void main(String[] args) {
        String filePath = "students.csv";
        List<Student> students = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] record;
            reader.readNext();

            while ((record = reader.readNext()) != null) {
                int id = Integer.parseInt(record[0]);
                String name = record[1];
                int age = Integer.parseInt(record[2]);
                double marks = Double.parseDouble(record[3]);

                Student student = new Student(id, name, age, marks);
                students.add(student);
            }
        } catch (IOException | CsvValidationException | NumberFormatException e) {
            e.printStackTrace();
        }

        students.forEach(System.out::println);
    }
}

