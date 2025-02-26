import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
public class MergeJSONFiles {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode json1 = objectMapper.readTree(new File("C:\\Users\\Acer\\IdeaProjects\\Jsonquestions\\target\\data1.json"));
            JsonNode json2 = objectMapper.readTree(new File("C:\\Users\\Acer\\IdeaProjects\\Jsonquestions\\target\\data2.json"));

            JsonNode mergedJson = mergeJson(json1, json2);

            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergedJson));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static JsonNode mergeJson(JsonNode mainNode, JsonNode updateNode) {
        Iterator<Map.Entry<String, JsonNode>> fields = updateNode.fields();
        while (fields.hasNext()) {
            Map.Entry<String, JsonNode> field = fields.next();
            ((com.fasterxml.jackson.databind.node.ObjectNode) mainNode).set(field.getKey(), field.getValue());
        }
        return mainNode;
    }
}
