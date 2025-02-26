import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CsvToJson {
    public static void main(String[] args) {
        try {
            File csvFile = new File("C:\\Users\\Acer\\IdeaProjects\\Jsonquestions\\target\\data.json");
            CsvMapper csvMapper = new CsvMapper();
            CsvSchema csvSchema = CsvSchema.emptySchema().withHeader(); 

            MappingIterator<Map<String, String>> mappingIterator =
                    csvMapper.readerFor(Map.class).with(csvSchema).readValues(csvFile);
            List<Map<String, String>> data = mappingIterator.readAll();
            ObjectMapper jsonMapper = new ObjectMapper();
            String jsonOutput = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);

            System.out.println(jsonOutput);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}