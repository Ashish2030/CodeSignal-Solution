String[] fileNaming(String[] names)
 {
     if(names.length==0)
     {
         return names;
     }
     Set<String>u=new LinkedHashSet<>();
     u.add(names[0]);
     String r="";
     int flag=0;
     int count=0;
     for(int i=1;i<names.length;i++)
     {
         r="";
         flag=0;
         count=0;
         if(u.contains(names[i]))
         {
            r=names[i]; 
             while(u.contains(r))
             {
                 if(flag==1)
                 {
                     r=names[i];
                 }
                 r=r+"("+String.valueOf(++count)+")";
                 flag=1;
             }
             names[i]=r;
             u.add(names[i]);
         }
         else
         {
           u.add(names[i]);  
         }
     }
     return names;
         

}
