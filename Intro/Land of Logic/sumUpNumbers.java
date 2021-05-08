

int sumUpNumbers(String inputString) 
  {
     char a[]=inputString.toCharArray();
     int flag=0;
     String r="";
     int sum=0;
     for(int i=0;i<a.length;i++)
     {
         if(Character.isDigit(a[i]))
         {
           r=r+String.valueOf(a[i]);
           flag=1;
         }
         else
         {
             if(flag==1)
             {
                 sum=sum+Integer.valueOf(r);
                 r="";
                 flag=0;
             }

         }
         
     }
     if(!r.isEmpty())
     {
          sum=sum+Integer.valueOf(r);
     }
     return sum;
     
      

  }
