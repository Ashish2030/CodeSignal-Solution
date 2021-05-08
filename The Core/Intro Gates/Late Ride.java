int lateRide(int n) 
{
    int k=n%60;
    int y=n/60;
    int sum=0;
    while(y>0)
    {
        sum=sum+y%10;
        y=y/10;
    }
    while(k>0)
    {
        sum=sum+k%10;
        k=k/10;
    }
    return sum;
}
