/*The addBorder method takes an array of strings arr and adds a border of asterisks 
 around each string. It initializes a string a with a single asterisk, concatenates each string 
 with asterisks on both sides, and stores them in a new array arr1. 
 The first and last elements of arr1 are set to a string of asterisks, creating the top and bottom 
 borders, and the modified array is returned as the output.*/

public class AddBorderExample {
    public static void main(String[] args) {
        String[] input = {"abc", "def"};
        String[] result = addBorder(input);
        for (String line : result) {
            System.out.println(line);
        }
    }

    public static String[] addBorder(String[] arr) {
        String a = "*";
        String[] arr1 = new String[arr.length + 2];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            a = a + arr[i] + "*";
            count = a.length();
            arr1[i + 1] = a;
            a = "*";
        }

        String h = "";
        for (int i = 0; i < count; i++) {
            h = h + "*";
        }

        arr1[0] = h;
        arr1[arr1.length - 1] = h;
        return arr1;
    }
}
