int depositProfit(int deposit, int rate, int threshold)
 {
      double money = deposit;
    double newRate = rate;
     int count=0;
     while(money<threshold)
     {
         money=money+((money*rate)/100);
         count++;
        
     }
     return count;

}
