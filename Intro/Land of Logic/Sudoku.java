static boolean x(int arr[])
{
    Arrays.sort(arr);
    int k=1;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]!=k)
        {
           return false; 
        }
        else
        {
            k++;
        }
    }
    return true;
}
boolean sudoku(int[][] grid)
 {
     int arr[]=new int[grid.length];
      int arr1[]=new int[grid.length];
     int k1=0;
    for(int i=0;i<grid.length;i++)
    {
        k1=0;
        for(int j=0;j<grid[0].length;j++)
        {
            arr[k1]=grid[i][j];
            arr1[k1]=grid[j][i];
            k1++;
        }
        Boolean t=x(arr);
        Boolean  t1=x(arr1);
        if(t1==false||t==false)
        {
            return false;
        }
    }
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            k1=0;
            for(int k=i*3;k<(i+1)*3;k++)
            {
                for(int l=j*3;l<(j+1)*3;l++)
                {
                   arr[k1]=grid[k][l];
                   k1++;
                }   
            }
             if(x(arr)==false)
                {
                    return false;
                }
        }
    }
   
       return true;
    }
    
       
    
    
    

