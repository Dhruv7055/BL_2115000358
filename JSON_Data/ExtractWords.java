import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ExtractWords {
    public static void main(String[] args) {
        try {
            ObjectMapper objectmapper = new ObjectMapper();
            JsonNode node = objectmapper.readTree(new File("C:\\Users\\Acer\\IdeaProjects\\Jsonquestions\\target\\data.json"));
            String name = node.get("name").asText();
            String email = node.get("email").asText();
            System.out.println("Name  " + name);
            System.out.println("email " + email);
        }
		catch (IOException e){
            e.printStackTrace();
        }
    }
}