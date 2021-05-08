boolean stringsRearrangement(String[] inputArray) {
    boolean[] used = new boolean[inputArray.length];
    findSequence(inputArray, null, used, 0);
    return success;
}
 
boolean success = false; 
void findSequence(String[] a, String prev, boolean[] used, int n)
 {
    if (n == a.length) {
        success = true;
        return;
    }
    for (int i = 0; i < a.length; i++) {
        if (!used[i] && (prev == null || differByOne(prev, a[i])))
          {
            used[i] = true;
            findSequence(a, a[i], used, n+1);
            used[i] = false;
        }
    }
}
 
boolean differByOne(String a, String b) {
    int count = 0;
    for (int i = 0; i < a.length(); i++) {
        if (a.charAt(i) != b.charAt(i)) {
            count++;
        }
    }
    return count == 1;
}
       