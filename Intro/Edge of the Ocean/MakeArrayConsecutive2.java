int makeArrayConsecutive2(int[] statues) 
{
int min=99999;
int max=-999;
for(int i= 0;i<statues.length;i++)
{
    if(statues[i]>max)
    {
        max=statues[i];
        
    }
    if(statues[i]<min)
    {
        min=statues[i];
        
    }
}
int diff=max-min;
return (diff+1-statues.length);
}
