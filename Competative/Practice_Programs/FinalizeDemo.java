import java.lang.*;          //By default package

class Marvellous
{
    public Marvellous()
    {
        System.out.println("Inside Constructor");
    }

    @Override   
    protected void finalize()
    {
        System.out.println("Inside Finalize Method");
    }
}

class FinalizeDemo
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
        
        mobj = null;        //Reference count becomes 0
        System.gc();

        System.out.println("End of Main");
    }
}