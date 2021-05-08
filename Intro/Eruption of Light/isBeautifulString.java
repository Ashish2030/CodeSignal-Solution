boolean isBeautifulString(String inputString) 
{
    int a[]=new int[26];
    int k=0;
    int count=0;
    for(char y='a';y<='z';y++)
    {
        count=0;
              for(int i=0;i<inputString.length();i++)
              {
                  if(y==inputString.charAt(i))
                  {
                      count++;
                  }
              }
              a[k++]=count;    
       }
       for(int i=1;i<26;i++)
       {
           if(a[i-1]<a[i])
           {
               return false;
           }
       }
       return true;
}

