boolean validTime(String time)
 {
     String a[]=time.split(":");
     int a1=a.length;
     if(a1!=2)
     {
         return false;
     }
     else
     {
         for(int i=0;i<a1;i++)
         {
             String y=a[i];
             if(i==0)
             {
                 if(Integer.valueOf(y)>=0&&Integer.valueOf(y)<=23)
                 {
                     
                 }
                 else
                 {
                     return false;
                 }
             }
             else
             {
                 if(Integer.valueOf(y)>=0&&Integer.valueOf(y)<=59)
                 {
                     
                 }
                 else
                 {
                     return false;
                 } 
             }
         }
     }
     return true;

}
