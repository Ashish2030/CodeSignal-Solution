int growingPlant(int upSpeed, int downSpeed, int desiredHeight)
 {
     int count=0;
     int count1=0;
     int x=0;
     while(true)
     {
         if(x>=desiredHeight)
         {
             break;
         }
         if(count%2==0)
         {
             x=x+upSpeed;
             count1++;
             count++;
         }
         else
         {
             x=x-downSpeed;
             count++;
         }
     }
     return count1;

}
