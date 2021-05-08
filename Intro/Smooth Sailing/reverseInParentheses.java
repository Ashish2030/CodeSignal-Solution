String reverseInParentheses(String inputString)
    {
      String temp="";
   Stack<Character> u=new Stack<>();
   String r="";
   int flag=0;
   int count=0;
   int i=0;
     while(i<inputString.length())
     {
         if(flag==0)
         {
            if(inputString.charAt(i)=='(')
           {
            u.push('(');
            count++;
             flag=1;
             i++;
           }
           else
           {
               r=r+String.valueOf(inputString.charAt(i++));
           }
         }
         else
        {
             while(count>0)
            {
                temp="";
                if(inputString.charAt(i)=='(')
                {
                     u.push('(');
                     count++;
                     i++;
                }
                else if(inputString.charAt(i)==')')
                {
                    while(u.peek()!='(')
                    {
                        temp=temp+String.valueOf(u.pop());
                    }
                    u.pop();
                    i++;
                    count--;
                     if(!u.isEmpty())
                     {
                      for(int k=0;k<temp.length();k++)
                      {
                          u.push(temp.charAt(k));
                      }
                    }
                }
                else
                {
                      u.push(inputString.charAt(i));
                      i++;
                }
            }
            if(u.isEmpty())
            {
                 r=r+temp.trim();
                 flag=0;
            }
         }
         
     }
     return r;
  }