int candies(int n, int m)
 {
     int l=0;
     if(n==m||n==1)
     {
         return m;
     }
     else
     {
         while(l<m)
         {
             l=l+n;
             
         }
         return l-n;
     }
}
