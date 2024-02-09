/*The messageFromBinaryCode method decodes a binary code into a message by converting 8-bit binary 
substrings into their corresponding ASCII characters. It iterates through the binary code, 
accumulating 8 bits at a time until a complete substring is formed. It then converts the substring 
into an integer using Integer.parseInt with base 2, retrieves the corresponding ASCII character, and 
appends it to the decoded message.*/

public class Main {
    public static void main(String[] args) {
        String code = "010010000110010101101100011011000110111100100001";
        String message = messageFromBinaryCode(code);
        System.out.println("Decoded message: " + message);
    }
    
    static String messageFromBinaryCode(String code) {
        String t = "";
        String y = "";
        int count = 0;
        
        for (int i = 0; i < code.length(); i++) {
            t = t + code.charAt(i);
            count++;
            
            if (count == 8) {
                int y1 = Integer.parseInt(t, 2);
                y = y + String.valueOf((char) y1);
                count = 0;
                t = "";
            }
        }
        
        return y;
    }
}
