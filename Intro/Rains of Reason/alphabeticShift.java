String alphabeticShift(String inputString) 
{
    String r="";
    for(int i=0;i<inputString.length();i++)
    {
       if(inputString.charAt(i)=='z')
       {
           r=r+String.valueOf('a');
       } 
       else if(inputString.charAt(i)=='Z')
       {
           r=r+String.valueOf('A');
       } 
       else 
       {
           int y=(int)inputString.charAt(i);
           y=y+1;
           r=r+String.valueOf((char)y);
       }
       
    }
return r;
}
