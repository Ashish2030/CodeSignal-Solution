int matrixElementsSum(int[][] a) 
{
    int sum=0;
    for(int i=0;i<a[0].length;i++)
    {
        for(int j=0;j<a.length;j++)
        {
            if(a[j][i]>0)
            {
                sum=sum+a[j][i];
            }
            else
            {
                break;
            }
        }
    }
    return sum;
    

}
