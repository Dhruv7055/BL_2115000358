import java.util.regex.*;

public class ValidateSSN {
    public static void main(String[] args) {
        String[] ssns = {"123-45-6789", "123456789", "987-65-4321"};
        for (String ssn : ssns) {
            System.out.println(ssn + " is " + (isValidSSN(ssn) ? "valid" : "invalid"));
        }
    }

    public static boolean isValidSSN(String ssn) {
        Pattern pattern = Pattern.compile("^\\d{3}-\\d{2}-\\d{4}$");
        Matcher matcher = pattern.matcher(ssn);
        return matcher.matches();
    }
}