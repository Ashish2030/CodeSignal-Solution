int avoidObstacles(int[] arr)
 {
     int max=-999;
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]>max)
         {
             max=arr[i];
         }
     }
     for(int i=1;i<=max+1;i++)
     {
         int flag=0;
         for(int j=0;j<arr.length;j++)
         {
            if(arr[j]%i==0)
            {
                 flag=0;
                break;
            }
            else
            {
                flag=1;
            }
                
         } 
         if(flag==1)
         {
             return i;
         }
        
     }
      return 0;
}
