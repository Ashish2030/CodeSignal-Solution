int deleteDigit(int n)
 {
     int i=1;
     int ans=0;
    while(n/i>0)
    {
         int temp = (n / (i * 10))  * i  + (n % i); 
        i=i*10;
        ans=Math.max(temp,ans);
    }
return ans;
}
