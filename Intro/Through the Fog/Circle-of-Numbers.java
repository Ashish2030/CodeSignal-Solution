int circleOfNumbers(int n, int firstNumber)
 {
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
         arr[i]=i; 
     }
          int count=0;
          int temp=n/2;
          int i=firstNumber;
           int result=-1;
     while(true)
     {
         if(i==n-1)
         {
             count++;
             i=0;
             if(temp==count)
             {
             result=arr[i];
             break;
             }
         }
         else
         {
            count++;
             i++;
            if(temp==count)
            {
             result=arr[i];
             break;
            }
         }
     }
     return result;
}
