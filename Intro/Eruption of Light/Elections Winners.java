int electionsWinners(int[] votes, int k)
 {
     if(k==0)
     {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<votes.length;i++)
        {
            if(votes[i]>max)
            {
                max=votes[i];
            }
        }
         int count1=0;
         for(int i=0;i<votes.length;i++)
         {
             if(votes[i]==max)
             {
                 count1++;
             }
         }
         if(count1>1)
         {
             return 0;
         }
         else
         {
             return 1;
         }
     }
     int count=0;
     for(int i=0;i<votes.length;i++)
     {
         int flag=0;
         int temp=votes[i]+k;
         for(int j=0;j<votes.length;j++)
         {
             if(temp<=votes[j])
             {
                 flag=1;
                 break;
             }
         }
           if(flag==0)
           {
             count++;
           }
     }
 return count;

}
