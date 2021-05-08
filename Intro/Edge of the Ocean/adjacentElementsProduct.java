int adjacentElementsProduct(int[] inputArray) 
{
    int max=-999;
    int pro=1;;
    for(int i=0;i<inputArray.length-1;i++)
    {
        pro=inputArray[i]*inputArray[i+1];
        if(pro>max)
        {
            max=pro;
        }
    }
    return max;

}
