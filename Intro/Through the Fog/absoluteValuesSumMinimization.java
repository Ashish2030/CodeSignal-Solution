  int absoluteValuesSumMinimization(int[] a)
   {
       int temp=-1;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<a.length;i++)
       {
           int sum=0;
           for(int j=0;j<a.length;j++)
           {
               sum=sum+Math.abs(a[j]-a[i]);
           }
           if(sum<min)
           {
               temp=a[i];
               min=sum;
           }
       }
return temp;
}
