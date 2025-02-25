package org.example;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
class StudentDetails{
    public static void main(String args[]){
        String CSVFile="C:\\Users\\Divya Singh\\IdeaProjects\\CSVJAVA\\src\\main\\java\\org\\example\\Student.csv";
        try(CSVReader csv=new CSVReader(new FileReader(CSVFile))){
            String[] Record;
            boolean isHeader=true;
            while((Record=csv.readNext())!=null){
                if(isHeader){
                    isHeader=false;
                    continue;
                }
                String id=Record[0];
                String name=Record[1];
                String age=Record[2];
                String marks=Record[3];

                System.out.println("Students Details");
                System.out.println("Id is " +id);
                System.out.println("Name is "+name);
                System.out.println("Age is "+age);
                System.out.println("marks is "+marks);
            }
        }catch(IOException e){
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
