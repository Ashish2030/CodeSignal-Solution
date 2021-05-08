int chessKnight(String cell)
 {
     int count=0;
     int y=Integer.parseInt(String.valueOf(cell.charAt(1)));
         if((int)cell.charAt(0)-2>=97&& y-1>=1)
         {
             count++;
         }
         if((int)cell.charAt(0)-2>=97 && y+1<=8)
         {
             count++;
         }
         if((int)cell.charAt(0)+2<=104&&y-1>=1)
         {
             count++;
         }
         if((int)cell.charAt(0)+2<=104&&y+1<=8)
         {
             count++;
         }
         if((int)cell.charAt(0)-1>=97&&y+2<=8)
         {
             count++;
         }
         if((int)cell.charAt(0)+1<=104&&y+2<=8)
         {
             count++;
         }
          if((int)cell.charAt(0)-1>=97&&y-2>=1)
         {
             count++;
         }
         if((int)cell.charAt(0)+1<=104&&y-2>=1)
         {
             count++;
         }
         return count;

}
