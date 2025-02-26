import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.util.Iterator;

public class FilterJSONByAge {
    public static void main(String[] args) {
        String jsonArray = """
        [
            { "name": "xyz", "age": 22, "email": "xyz@gmail.com" },
            { "name": "abc", "age": 21, "email": "abc@gmail.com" },
            { "name": "def", "age": 22, "email": "def@gmail.com" }
        ]
        """;

        try {

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootArray = objectMapper.readTree(jsonArray);

            ArrayNode filteredArray = objectMapper.createArrayNode();

            for (JsonNode node : rootArray) {
                if (node.get("age").asInt() > 25) {
                    filteredArray.add(node);
                }
            }
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(filteredArray));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
