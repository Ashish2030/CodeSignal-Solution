int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW)
 {
     int val=0;
     int flag=0;
     if(value1>=value2 && maxW>=weight1)
     {
         val=val+value1;
         maxW=maxW-weight1;
         flag=1;
     }
      if(value2>=value1 && maxW>=weight2)
     {
          val=val+value2;
          maxW=maxW-weight2;
          flag=2;
     }
     if(maxW>=weight2 && flag!=2)
     {
         val=val+value2;
     }
     if(maxW>=weight1 && flag!=1)
     {
         val=val+value1;
     }
    return val; 

}
