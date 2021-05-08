int[][] spiralNumbers(int n1) 
{
    int arr[][]=new int[n1][n1];
    int m=n1;
    int n=n1;
    int k=0;
    int l=0;
    int count=1;
    while(k<m&&l<n)
    {
          for(int i=l;i<n;i++)
          {
              arr[k][i]=count;
              count++;
          }
          k++;
            for(int i=k;i<m;i++)
          {
              arr[i][n-1]=count;
              count++;
          }
          n--;
          if(k<m)
          {
           for(int i=n-1;i>=l;i--)
           {
               arr[m-1][i]=count++;   
           }  
            m--;
          }
          if(l<n)
          {
               for(int i=m-1;i>=k;i--)
           {
               arr[i][l]=count++;   
           }  
            l++;
          }
          
          
    }
return arr;
}
