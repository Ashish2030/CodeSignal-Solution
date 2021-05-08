int digitsProduct(int product) 
{
      String r="";
    if(product<9&&product>0)
    {
        return product;
    }
    else if(product==0)
    {
        return 10;
    }
    else
    {
      
        for(int i=9;i>1;i--)
        {
            if(product%i==0)
            {
                r=r+String.valueOf(i);
                product=product/i;
                if(product%i==0)
                {
                    i++;
                }
                
            }
        }
    }
    if(product<2)
    {
        return Integer.valueOf((new StringBuffer(r).reverse().toString()));
        
    }
    else
    {
       return -1; 
    }


    
}