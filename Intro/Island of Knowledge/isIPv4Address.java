/*example, the input string is "192.168.0.1". The code splits it into an array 
with four parts: ["192", "168", "0", "1"]. Each part is checked for length, 
leading zeroes, alphanumeric characters, and valid integer range. 
Since all checks pass, the method returns true, indicating that the input is a valid IPv4 address.*/

public class Main {
    public static boolean isIPv4Address(String inputString) {
        String[] a = inputString.split("\\.");
        if (a.length != 4)
            return false;
        for (int i = 0; i < a.length; i++) {
            String u = a[i].trim();
            if (u.length() > 3) {
                return false;
            }
            if (u.length() > 1) {
                if (u.charAt(0) == '0') {  
                    return false;
                }
            }
            if (u.isEmpty() || u.matches(".*[a-zA-Z]+.*")) {
                return false;
            }
            int a11 = Integer.parseInt(a[i]);
            if (a11 > 255 || a11 < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "192.168.0.1";
        boolean isValid = isIPv4Address(input);
        System.out.println("Is the input a valid IPv4 address? " + isValid);
    }
}
