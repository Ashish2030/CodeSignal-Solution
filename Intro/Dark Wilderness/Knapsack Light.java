int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW)
 {
     int x=0;
     if(weight1+weight2<=maxW)
     {
         x=value1+value2;
     }
     else
     {
         if(value1>value2)
         {
             if(weight1<=maxW)
             {
               x=value1;  
             }
             else if(weight2<=maxW)
             {
                 x=value2;
             }
             else
             {
                 x=0;
             }
             
         }
         else
         {
             if(weight2<=maxW)
             {
               x=value2;  
             }
             else if(weight1<=maxW)
             {
                 x=value1;
             }
             else
             {
                 x=0;
             }
             
         }
     }
     return x;

}
