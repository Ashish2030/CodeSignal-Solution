char firstDigit(String inputString)
 {
     for(int i=0;i<inputString.length();i++)
     {
         char a=inputString.charAt(i);
         if(Character.isDigit(a))
         {
             return a;
         }
     }
return inputString.charAt(0);
}
