boolean almostIncreasingSequence(int[] a) 
{
    int count1=0,count2=0;
    for(int i=0;i<a.length-1;i++)
    {
        if(a[i]>=a[i+1])
        {
            count1++;
        }
    }
    for(int i=0;i<a.length-2;i++)
    {
        if(a[i]>=a[i+2])
        {
            count2++;
        }
    }
return (count1<=1)&&(count2<=1);
}
