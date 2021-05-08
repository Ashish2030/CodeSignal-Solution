int arrayMaximalAdjacentDifference(int[] inputArray)
 {
     int max=-999;
     for(int i=0;i<inputArray.length-1;i++)
     {
         if(Math.abs(inputArray[i]-inputArray[i+1])>max)
         {
             max=Math.abs(inputArray[i]-inputArray[i+1]);
             
         }
         
     }
return max;
}
