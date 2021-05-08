boolean evenDigitsOnly(int n) 
{
    int temp=n;
    while(temp>0)
    {
        int y=temp%10;
        if(y%2!=0)
        {
            return false;
        }
        temp=temp/10;
        
    }
    return true;

}
