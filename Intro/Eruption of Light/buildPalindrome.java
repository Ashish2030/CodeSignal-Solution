String buildPalindrome(String st)
 {
String str=new StringBuffer(st).reverse().toString();
for(int i=0;i<st.length();i++)
{
    if((st.substring(0,i)+str).equals(new StringBuffer(st.substring(0,i)+str).reverse().toString()))
    {
        return (st.substring(0,i)+str);
    }
}
return "a";
}
