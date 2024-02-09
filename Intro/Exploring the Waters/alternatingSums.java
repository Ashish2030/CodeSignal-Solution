/*The method calculates the alternating sums of the elements in an input array. 
It uses a flag variable to determine which sum to update and iterates through the array, 
adding elements to the corresponding sum based on the flag value. The resulting alternating 
sums are stored in a new array and returned as the output.*/

public class AlternatingSumsExample {
    public static void main(String[] args) {
        int[] a = {50, 60, 70, 80, 90};
        int[] result = alternatingSums(a);
        for (int num : result) {
            System.out.println(num);
        }
    }

    public static int[] alternatingSums(int[] a) {
        int[] arr = new int[2];
        int flag = 0;
        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < a.length; i++) {
            if (flag == 0) {
                sum = sum + a[i];
                flag = 1;
            } else {
                sum1 = sum1 + a[i];
                flag = 0;
            }
        }

        arr[0] = sum;
        arr[1] = sum1;
        return arr;
    }
}
