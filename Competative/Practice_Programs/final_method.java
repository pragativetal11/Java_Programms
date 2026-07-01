class Demo
{
    public void fun()
    {   System.out.println("Inside Demo Fun");  }

    public final void gun()
    {   System.out.println("Inside Demo Gun");  }
}

class Hello extends Demo
{
    public void gun()
    {   System.out.println("Inside Hello Gun"); }
}

class final_method
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();
        hobj.fun();
        hobj.gun();
    }
}