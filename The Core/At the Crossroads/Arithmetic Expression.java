boolean arithmeticExpression(int a, int b, int c)
 {
     double a1=a;
     float p=(float)(a1/b);
     System.out.println(p);
     if(a+b==c)
     {
         return true;
     }
     else if(a-b==c)
     {
         return true;
     }
     else if(a*b==c)
     {
         return true;
     }
     else if(p==c)
     {
         return true;
     }
     else
     {
         return false;
     }

}
