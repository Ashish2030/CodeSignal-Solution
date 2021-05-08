String[] allLongestStrings(String[] a)
 {
     int max=-999;
     int count=0;
for(int i=0;i<a.length;i++)
{
    String h=a[i];
    if(h.length()>max)
        max=h.length();
}
for(int i=0;i<a.length;i++)
{
    String h=a[i];
    if(h.length()==max)
        count++;
}
String  b[]=new String[count];
int k=0;
for(int i=0;i<a.length;i++)
{
    String h=a[i];
    if(h.length()==max)
        b[k++]=a[i];
}
return b;
}
