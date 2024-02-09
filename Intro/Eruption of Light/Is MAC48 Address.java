/* The isMAC48Address method checks whether a given string represents a valid MAC-48 address, 
which is commonly used for identifying network interfaces. It verifies the address format by checking 
the presence of a hyphen at the end, splitting the string by hyphens, and ensuring there are exactly 
6 elements. It also validates each element to have a length of 2 characters and only 
contains digits (0-9) or uppercase letters (A-F). If all the validations pass, it returns true; 
otherwise, it returns false. */

public class MACAddressValidator {
    public static void main(String[] args) {
        String mac = "00-1B-63-84-45-E6";
        boolean isValid = isMAC48Address(mac);
        System.out.println(isValid); // Output: true
    }

    public static boolean isMAC48Address(String inputString) {
        if (inputString.charAt(inputString.length() - 1) == '-') {
            return false;
        }

        String[] a = inputString.split("-");
        if (a.length != 6) {
            return false;
        } else {
            for (int i = 0; i < a.length; i++) {
                String q = a[i];
                if (q.length() != 2) {
                    return false;
                } else {
                    for (int j = 0; j < 2; j++) {
                        if (((q.charAt(j) >= 'A') && (q.charAt(j) <= 'F')) || (Character.isDigit(q.charAt(j)))) {

                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
