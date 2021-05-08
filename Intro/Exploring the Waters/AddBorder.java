String[] addBorder(String[] arr)
 {
     String a="*";
     String arr1[]=new String[(arr.length+2)];
     int count=0;
     for(int i=0;i<arr.length;i++)
     {
         a=a+arr[i]+"*";
          count=a.length();
         arr1[i+1]=a;
         a="*";
     }
     String h="";
     for(int i=0;i<count;i++)
     {
         h=h+"*";
     }
     arr1[0]=h;
     arr1[arr1.length-1]=h;
     return arr1;

}
