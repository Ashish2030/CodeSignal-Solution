// almostIncreasingSequence method successfully determined that the sequence {1, 3, 2, 4, 5} can be made into an 
// almost increasing sequence by removing at most one element. The method iterates through the array, counting the 
// number of instances where an element is greater than or equal to the next element. It uses two separate loops to handle 
// potential removals of adjacent elements. Finally, it returns true if both counts are less than or equal to 1, indicating that the condition is met.
// Initially, count1 and count2 are set to 0. The first loop compares each element with the next element, incrementing count1 if the current element is greater than or equal to the next element.
// The second loop compares each element with the element two positions ahead, incrementing count2 if the current element is greater than or equal to the element two positions ahead. 
// Finally, the method returns true if both count1 and count2 are less than or equal to 1.

public class Main {
    public static void main(String[] args) {
        int[] sequence = {1, 3, 2, 4, 5};
        boolean result = almostIncreasingSequence(sequence);
        System.out.println("Is the sequence almost increasing? " + result);
    }

    public static boolean almostIncreasingSequence(int[] a) {
        int count1 = 0;
        int count2 = 0;
        
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] >= a[i + 1]) {
                count1++;
            }
        }
        
        for (int i = 0; i < a.length - 2; i++) {
            if (a[i] >= a[i + 2]) {
                count2++;
            }
        }
        
        return (count1 <= 1) && (count2 <= 1);
    }
}
