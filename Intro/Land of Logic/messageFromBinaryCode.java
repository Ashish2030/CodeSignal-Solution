 String messageFromBinaryCode(String code)
  {
      String t="";
      String y="";
      int count=0;
      for(int i=0;i<code.length();i++)
      {
          t=t+code.charAt(i);
          count++;
          if(count==8)
          {
              System.out.println(t);
             int y1=Integer.parseInt(t,2);
             y=y+String.valueOf((char)y1);
             count=0; 
             t="";
          }
          
      }
      return y;

}
