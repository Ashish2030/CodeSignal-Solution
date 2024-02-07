/*The validTime method checks if a given time string is in the format "HH:MM". 
It splits the string by the colon and verifies that there are exactly two parts. 
It then checks if the hour part is between 0 and 23, and if the minute part is between 0 and 59. 
If all conditions are met, the method returns true; otherwise, it returns false*/

public class Main {
    public static void main(String[] args) {
        String time = "15:45";
        boolean isValid = validTime(time);
        System.out.println("Is the time valid? " + isValid);
    }
    
    static boolean validTime(String time) {
        String[] a = time.split(":");
        int a1 = a.length;

        if (a1 != 2) {
            return false;
        } else {
            for (int i = 0; i < a1; i++) {
                String y = a[i];

                if (i == 0) {
                    if (Integer.parseInt(y) >= 0 && Integer.parseInt(y) <= 23) {
                        // Valid hour value
                    } else {
                        return false;
                    }
                } else {
                    if (Integer.parseInt(y) >= 0 && Integer.parseInt(y) <= 59) {
                        // Valid minute value
                    } else {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
