boolean isIPv4Address(String inputString)
 {
      String a[]=inputString.split("\\.");
      if(a.length!=4)
          return false;
     for(int i=0;i<a.length;i++)
     {
         String u=a[i].trim();
         if(u.length()>3)
        {
            return false;
        }
         if(u.length()>1)
         {
             if(u.charAt(0)=='0')
             {  
                 return false;
             }
         }
         if(u.isEmpty()||u.matches(".*[a-zA-Z]+.*"))
         {
             return false;
         }
         
         int a11=Integer.parseInt(a[i]);
         if(a11>255 || a11<0)
         {
             return false;
         }
     }
return true;
}
