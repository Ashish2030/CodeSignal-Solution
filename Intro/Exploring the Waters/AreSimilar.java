/*The method compares the elements of two integer arrays and determines if they are 
similar by checking for differences and the possibility of making the arrays identical with a single 
swap of two elements. If there are no differences between the arrays, the method returns true. 
If there are more than two differences or a different number of differences, it returns false. 
Otherwise, if exactly two differences exist and swapping those elements results in identical arrays, 
it returns true; otherwise, it returns false.*/

import java.util.ArrayList;

public class AreSimilarExample {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {3, 2, 1};
        boolean result = areSimilar(a, b);
        System.out.println(result);
    }

    public static boolean areSimilar(int[] a, int[] b) {
        ArrayList<Integer> a1 = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                a1.add(i);
            }
        }

        if (a1.size() == 0) {
            return true;
        }

        if (a1.size() != 2) {
            return false;
        }

        int x = a1.get(0);
        int y = a1.get(1);

        if (a[x] == b[y] && a[y] == b[x]) {
            return true;
        }

        return false;
    }
}
