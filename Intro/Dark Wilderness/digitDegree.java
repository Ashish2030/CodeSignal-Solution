int digitDegree(int n)
 {
     int k=n;
     
     int sum=0;
     int count=0;
     while(String.valueOf(k).length()>1)
     {
         int temp=k;
         sum=0;
         count++;
     while(temp>0)
     {
         sum=sum+temp%10;
         temp=temp/10;
     }
     k=sum;
     
     }
    return count;

}
