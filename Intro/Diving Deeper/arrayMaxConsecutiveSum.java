int arrayMaxConsecutiveSum(int[] arr, int k)
 {
     int max=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++)
     {
         int sum=0;
         int j=i+k-1;
         if(j<arr.length)
         {
             for(int m=i;m<=j;m++)
             {
                 sum=sum+arr[m];
             }
             if(sum>max)
             {
                 max=sum;
             }
         }
     }
     return max;

}
