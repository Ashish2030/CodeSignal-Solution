boolean checkPalindrome(String inputString)
 {
StringBuffer a =new StringBuffer(inputString);
a.reverse();
String b=new String(a);
b=b.trim();
if(inputString.equals(b))
{
    return true;
}
else 
{
    return false;
}
}
