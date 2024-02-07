/*The fileNaming method takes an array of names and modifies any duplicate names to ensure uniqueness.
It uses a LinkedHashSet called uniqueNames to keep track of unique names encountered so far.
For each name in the input array, if it is a duplicate, the method appends a number in parentheses
to create a modified name that is not present in the uniqueNames set, 
and stores it back into the array*/

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static String[] fileNaming(String[] names) {
        if (names.length == 0) {
            return names;
        }
        
        Set<String> uniqueNames = new LinkedHashSet<>();
        uniqueNames.add(names[0]);
        String newName = "";
        int flag = 0;
        int count = 0;
        
        for (int i = 1; i < names.length; i++) {
            newName = "";
            flag = 0;
            count = 0;
            
            if (uniqueNames.contains(names[i])) {
                newName = names[i];
                
                while (uniqueNames.contains(newName)) {
                    if (flag == 1) {
                        newName = names[i];
                    }
                    
                    newName = newName + "(" + String.valueOf(++count) + ")";
                    flag = 1;
                }
                
                names[i] = newName;
                uniqueNames.add(names[i]);
            } else {
                uniqueNames.add(names[i]);
            }
        }
        
        return names;
    }

    public static void main(String[] args) {
        String[] names = { "file", "file", "file(1)", "file(2)", "file" };
        String[] result = fileNaming(names);
        
        for (String name : result) {
            System.out.println(name);
        }
    }
}
