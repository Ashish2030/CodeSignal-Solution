int circleOfNumbers(int n, int firstNumber)
 {
     int count=n/2;
     int count1=0;
     while(true)
     {
         if(count1==count)
         {
             break;
         }
         count1++;
         if(firstNumber==n-1)
         {
             System.out.println(count1);
             firstNumber=0;
         }
         else
         {
                firstNumber++;
         }
     }
     return firstNumber; 

}
