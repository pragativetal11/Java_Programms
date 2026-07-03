import java.lang.*;          //By default package

class Marvellous
{}

class Hello
{}

class GetClassDemo
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
        Hello hobj = new Hello();

        System.out.println(mobj.getClass());            //object class method
        System.out.println(hobj.getClass());


    }
}