import org.json.JSONObject;
import org.json.XML;

public class JsonToXmlConverter {
    public static void main(String[] args) {
        String jsonString = "{ \"name\": \"Dhruv\", \"age\": 22, \"city\": \"Agra\" }";
        JSONObject json = new JSONObject(jsonString);
        String xml = XML.toString(json);

        System.out.println(xml);
    }
}