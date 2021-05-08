String longestDigitsPrefix(String inputString)
 {
     int max=Integer.MIN_VALUE;
     String r="";
     int flag=0;
     for(int i=0;i<inputString.length();i++)
     {
         if(Character.isDigit(inputString.charAt(i)))
         {
             r=r+String.valueOf(inputString.charAt(i));
             flag=1;
         }
         else
         {
            if( flag==1)
            {
                return r;
            }
            else
            {
                return r;
            }
         }
     }
     return r;
 }