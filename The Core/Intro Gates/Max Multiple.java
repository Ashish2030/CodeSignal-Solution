int maxMultiple(int divisor, int bound)
 {
     double a=(double)bound;
     int b=(int)Math.floor(a/divisor);
     return b*divisor;

}
