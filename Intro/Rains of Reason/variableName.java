boolean variableName(String name) 
{
    int flag=0;
    if(Character.isDigit(name.charAt(0)))
    {
        return false;
    }
    for(int i=0;i<name.length();i++)
    {
        if((name.charAt(i)=='_')||(name.charAt(i)>='A'&&name.charAt(i)<='Z')||(name.charAt(i)>='a'&&name.charAt(i)<='z')||(Character.isDigit(name.charAt(i))))
        {
            flag=1;
        }
        else
        {
            return false;
        }   
    }
        return true;


}
