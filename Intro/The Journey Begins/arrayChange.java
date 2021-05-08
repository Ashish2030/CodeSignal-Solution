int arrayChange(int[] inputArray) 
{

int result = 0;
		int x=0;
	for(int i=1;i<inputArray.length;i++)
    {
        if(inputArray[i-1]>=inputArray[i])
        {
          x=inputArray[i-1]-inputArray[i]+1;
          inputArray[i]=inputArray[i]+x;
          result=result+x;
        }
    }
		 
		return result;
}
