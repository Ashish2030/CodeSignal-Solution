String findEmailDomain(String address)
 {
     int flag=0;
     String r="";
     if(!address.contains("@"))
     {
         return r;
     }
for(int i=0;i<address.length();i++)
{
    if(flag==1)
    {
        r=r+address.charAt(i);
    }
    if(address.charAt(i)=='@')
    {
        flag=1;
    }
}
if(r.contains("@"))
{
    r=findEmailDomain(r);
}
return r;
}
