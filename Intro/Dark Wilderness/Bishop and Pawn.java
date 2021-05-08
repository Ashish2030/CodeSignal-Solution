boolean bishopAndPawn(String bishop, String pawn) 
{
    if(bishop.charAt(0)==pawn.charAt(0))
    {
        if(Integer.valueOf(bishop.charAt(1))==Integer.valueOf(pawn.charAt(1)-1))
        {
            return true;
        }
        
    }
    else
    {
         if(Math.abs(Integer.valueOf(bishop.charAt(0))-Integer.valueOf(pawn.charAt(0)))==Math.abs(Integer.valueOf(bishop.charAt(1))-Integer.valueOf(pawn.charAt(1))))
        {
            return true;
        }
    }
    return false;

}
