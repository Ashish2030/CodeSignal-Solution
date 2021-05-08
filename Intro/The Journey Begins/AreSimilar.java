boolean areSimilar(int[] a, int[] b) 
{
      ArrayList<Integer> a1=new ArrayList<>();
      for(int i=0;i<a.length;i++)
      {
          if(a[i]!=b[i])
          {
              a1.add(i);
          }
      }
      if(a1.size()==0)
      {
          return true;
      }
      if(a1.size()!=2)
      {
          return false;
      }
      int x=a1.get(0);
      int y=a1.get(1);
      if(a[x]==b[y]&& a[y]==b[x])
      {
          return true;
      }
      return false;
}
