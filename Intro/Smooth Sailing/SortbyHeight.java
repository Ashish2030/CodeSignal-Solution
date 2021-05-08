int[] sortByHeight(int[] arr)
{
    int n=arr.length;
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]==-1)
                break;
            else
            {
                if(arr[j]==-1)
                    continue;
                else
                {
                    if(arr[i]>arr[j])
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                    
                }
            }
        }
    }
    return arr;

}
