
/*
    iRow = 6
    iCol = 6

    Output:-
          %    #   #     #
          %    %   #     #       
          %    %   %     #     
          %    %   %     %    
          
         
*/

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j= 0;

        //Filter for Diagonal pattern
        if(iRow != iCol)
        {
            System.out.println("Invalid Parameters");
            System.out.println("Number of Rows and Columns should be same");
            return;
        }
        
        for(i = 1; i<= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i >= j)              
                {
                    System.out.print("%\t");
                }
                else
                {
                    System.out.print("#\t");        //Space is required
                }
            }
            System.out.println();
        }
    }
}

class program218

{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter Number of Rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Number of Colums :");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1, iValue2);
    }
}