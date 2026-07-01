final class Demo
{
    public void fun()
    {   System.out.println("Inside Demo Fun");  }

    public void gun()
    {   System.out.println("Inside Demo Gun");  }
}

class Hello extends Demo        //Error
{
    public void gun()
    {   System.out.println("Inside Hello Gun"); }
}

class final_class
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();     //allowed

        Hello hobj = new Hello();
    }
}