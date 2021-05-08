int[] extractEachKth(int[] inputArray, int k) 
{
    int arr[]=new int[inputArray.length];
    int q=0;
    int p=0;
    int count=1;
    int flag=1;
    
    for(int i=0;i<inputArray.length;i++)
    {
        if(count==k)
        {
            count=1;
            arr[i]=10101;
            flag=0;
        }
        else
        {
            arr[i]=inputArray[i];
            count++;
        q++;
        }
    }
    if(flag==1)
    {
        return inputArray;
    }
    else
    {
         int arr1[]=new int[q];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==10101)
            {
                
            }
            else
            {
                arr1[p]=arr[i];
                p++;
            }
        }
        return arr1;
        
    }
    
}
