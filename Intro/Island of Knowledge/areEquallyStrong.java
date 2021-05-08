boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight)
 {
     int arr[]=new int[2];
     int arr1[]=new int[2];
     arr[0]=yourRight;
     arr[1]=yourLeft;
     arr1[0]=friendsRight;
     arr1[1]=friendsLeft;
     Arrays.sort(arr);
     Arrays.sort(arr1);
     for(int i=0;i<2;i++)
     {
         if(arr[i]!=arr1[i])
         {
             return false;
         }
     }
return true;
}
