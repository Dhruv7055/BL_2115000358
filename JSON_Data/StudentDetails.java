import org.json.JSONArray;
import org.json.JSONObject;

public class StudentDetails {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();
        student.put("name", "Dhruv");
        student.put("age", 22);

        JSONArray subjects = new JSONArray();
        subjects.put("Maths");
        subjects.put("Science");
        subjects.put("Geography");

        student.put("subjects", subjects);

        System.out.println(student.toString(4));
    }
}

