/*The candies function takes two integers, n and m, representing the number of students and candies, respectively. 
If the number of students is equal to the number of candies or there is only one student, it returns the number of candies. 
Otherwise, it distributes the candies by repeatedly adding n candies to the total until there are no more candies left,
and returns the total number of candies distributed.*/

public class Main {
    public static int candies(int n, int m) {
        int l = 0;
        if (n == m || n == 1) {
            return m;
        } else {
            while (l < m) {
                l = l + n;
            }
            return l - n;
        }
    }

    public static void main(String[] args) {
        // Example usage
        int n = 3;
        int m = 10;
        int result = candies(n, m);
        System.out.println("Result: " + result);
    }
}
