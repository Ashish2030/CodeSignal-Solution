String lineEncoding(String s)
 {
    String r="";
    int count=0;
     for(int i=0;i<s.length();i++)
     {
         count=0;
         for(int j=i;j<s.length();j++)
         {
             if(s.charAt(i)==s.charAt(j))
             {
                 count++;
             }
             else
             {
                 break;
             }
         }
         if(count>1)
         {
             r=r+String.valueOf(count)+String.valueOf(s.charAt(i));
             i=i+count-1;
         }
         else
         {
              r=r+String.valueOf(s.charAt(i));
         }
         
     }
    
     return r;

}
