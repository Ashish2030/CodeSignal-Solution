int[] alternatingSums(int[] a)
 {
     int arr[]=new int[2];
     int flag=0;
     int sum=0;
     int sum1=0;
     for(int i=0;i<a.length;i++)
     {
         if(flag==0)
         {
             sum=sum+a[i];
             flag=1;
         }
         else
         {
              sum1=sum1+a[i];
             flag=0;
         }
     }
     arr[0]=sum;
     arr[1]=sum1;
     return arr;

}
