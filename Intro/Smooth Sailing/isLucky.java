boolean isLucky(int n)
 {
   String s = Integer.toString(n);
        int length = s.length();
        String p1 = s.substring(0, length/2);
        String p2 = s.substring(length/2, length);
        int sum1 = 0;
        int sum2 = 0;
        int onePart = Integer.valueOf(p1);
        int twoPart = Integer.valueOf(p2);

        while (onePart > 0) {
            sum1 += onePart % 10;
            onePart /=10;
        }

        while (twoPart > 0) {
            sum2 += twoPart % 10;
            twoPart /=10;
        }

        if (sum1 == sum2) {
            return true;
        }

        return false;
    }
    
