import java.util.regex.*;

public class ValidateCreditCard {
    public static boolean isValidCard(String cardNumber) {
        String visaRegex = "^4[0-9]{15}$";
        String masterCardRegex = "^5[1-5][0-9]{14}$";
        return Pattern.matches(visaRegex, cardNumber) || Pattern.matches(masterCardRegex, cardNumber);
    }

    public static void main(String[] args) {
        String[] testCards = {"4111111111111111", "5500000000000004", "1234567812345678", "4012888888881881"};
        for (String card : testCards) {
            System.out.println("Card: " + card + " is valid: " + isValidCard(card));
        }
    }
}