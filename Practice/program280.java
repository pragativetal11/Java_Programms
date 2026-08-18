//library

package Marvellous;

public class StringX
{
    public int CountCapital(String str)
    {
        int iCount = 0;
        int i = 0;

        char Arr[] = str.toCharArray();             //converting string into character array

        for(i = 0; i < Arr.length; i++)           
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')          //count capital letters
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountSmall(String str)
    {
        int iCount = 0;
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)           
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')                      //count small letters
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountDigits(String str)
    {
        int iCount = 0;
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)           
        {
            if(Arr[i] >= '0' && Arr[i] <= '9')                      //count digits
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountSpace(String str)
    {
        int iCount = 0;
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)           
        {
            if(Arr[i] == ' ')                                       //count space
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountSpecial(String str)
    {
        int iCount = 0;
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)                 
        {
            if( (Arr[i] >= '!' && Arr[i] <= '/') ||                  //count special symbols
                (Arr[i] >= ':' && Arr[i] <= '@') ||
                (Arr[i] >= '[' && Arr[i] <= '`') ||
                (Arr[i] >= '{' && Arr[i] <= '~')
            )          
            {
                iCount++;
            }
        }
        return iCount;
    }

    public String Update(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();             //converting string into array

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == 'a' || Arr[i] == 'A')
            {
                Arr[i] = '_';
            }
        }

        String ret = new String(Arr);               //converting array into string

        return ret;
    }

    public String toUpperX(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();             //converting string into array

        for(i = 0; i < Arr.length; i++)
        {

            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                    Arr[i] = (char)(Arr[i] - 32);                  
            }
    }
        return new String(Arr);                     //Converting array into string(Anonomous object)
    }

    public String toLowerX(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();             //converting string into array

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                    Arr[i] = (char)(Arr[i] + 32);                  
            }
        }
        return new String(Arr);                     //Converting array into string(Anonomous object)
    }

    public String Toggle(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();             //converting string into array

        for(i = 0; i < Arr.length; i++)
        {

            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                    Arr[i] = (char)(Arr[i] + 32);                  
            }
            else                                    //issue in special symbols
            {
                Arr[i] = (char)(Arr[i] - 32);
            }
        }
        return new String(Arr);                     //Converting array into string(Anonomous object)
    }
}