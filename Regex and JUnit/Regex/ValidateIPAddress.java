import java.util.regex.*;

public class ValidateIPAddress {
    public static boolean isValidIP(String ip) {
        String regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        return Pattern.matches(regex, ip);
    }

    public static void main(String[] args) {
        String[] testIPs = {"192.168.1.1", "255.255.255.255", "999.999.999.999", "123.045.067.089"};
        for (String ip : testIPs) {
            System.out.println("IP: " + ip + " is valid: " + isValidIP(ip));
        }
    }
}