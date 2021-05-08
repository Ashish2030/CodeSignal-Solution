boolean palindromeRearranging(String str)
 {   
   int a[]=new int[256] ;
     Arrays.fill(a, 0); 
   for(int i=0;i<str.length();i++)
   {
       a[(int)str.charAt(i)]++;
   }
   int c=0;
   for(int i=0;i<256;i++)
   {
      if((a[i] & 1)==1)
      {
          c++;
      }
   }
   if(c>1)
   {
       return false;
   }
   return true;
} 
     
