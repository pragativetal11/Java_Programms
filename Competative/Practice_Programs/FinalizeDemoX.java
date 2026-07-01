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

class FinalizeDemoX
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
        Marvellous mobj2 = mobj;

        mobj = null;        //Reference count becomes 1(mobj2 pointing to marvellous)
        System.gc();

        System.out.println("End of Main");
    }
}