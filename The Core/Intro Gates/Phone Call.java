public class PhoneCall {
    public static int phoneCall(int min1, int min2_10, int min11, int s) {
        int count = 0;
        if (s >= min1) {
            s = s - min1;
            count++;
        }
        while (s >= min2_10 && count < 10) {
            s = s - min2_10;
            count++;
        }
        if (s > min11) {
            count = count + (s / min11);
        }
        return count;
    }

    public static void main(String[] args) {
        int min1 = 1;
        int min2_10 = 2;
        int min11 = 3;
        int s = 20;
        int result = phoneCall(min1, min2_10, min11, s);
        System.out.println("Total minutes: " + result);
    }
}
