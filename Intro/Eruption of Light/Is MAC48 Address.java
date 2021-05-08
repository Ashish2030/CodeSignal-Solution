boolean isMAC48Address(String inputString) 
{
    if(inputString.charAt(inputString.length()-1)=='-')
    {
        return false;
    }
    String a[]=inputString.split("-");
    if(a.length!=6)
    {
        return false;
    }
    else
    {
        for(int i=0;i<a.length;i++)
        {
            String q=a[i];
            if(q.length()!=2)
            {
                return false;
            }
            else
            {
                for(int j=0;j<2;j++)
            {
                if(((q.charAt(j)>='A')&&(q.charAt(j)<='F'))||(Character.isDigit(q.charAt(j))))
                {
                    
                }
                else{
                    return false;
                }
            }
            }
        }
    }
return true;
}
