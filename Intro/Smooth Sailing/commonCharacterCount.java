int commonCharacterCount(String s1, String s2) 
{
    int n1=s1.length();
    int n2=s2.length();
     int []freq1 = new int[26]; 
    int []freq2 = new int[26]; 
    Arrays.fill(freq1, 0); 
    Arrays.fill(freq2, 0);  
    int i, count = 0; 
    for (i = 0; i < n1; i++) 
        freq1[s1.charAt(i) - 'a']++; 
    for (i = 0; i < n2; i++) 
        freq2[s2.charAt(i) - 'a']++; 
    for (i = 0; i < 26; i++) 
        count += (Math.min(freq1[i], freq2[i])); 
  
    return count; 

}
