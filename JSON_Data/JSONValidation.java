import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONValidation {
    public static void main(String[] args) {
        String jsonString = "{ \"name\": \"Dhruv\", \"email\": \"dhruv9837758333@gmail.com\", \"age\": 22 }";
        if (isValidJson(jsonString)) {
            System.out.println("JSON is valid!");
        } 
		else {
            System.out.println("JSON is invalid!");
        }
    }

    public static boolean isValidJson(String json) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(json);

            return jsonNode.has("name") && jsonNode.has("email") && jsonNode.has("age");
        } 
		catch(Exception e) {
            return false; 
        }
    }
}