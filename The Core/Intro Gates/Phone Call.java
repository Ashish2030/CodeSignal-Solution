int phoneCall(int min1, int min2_10, int min11, int s)
 {
     int count=0;
     if(s>=min1)
     {
         s=s-min1;
         count++;
     }
 while(s>=min2_10&&count<10)
 {
     s=s-min2_10;
     count++;
 }
if(s>min11)
{
    count=count+s/min11;
}
 return count;

}
