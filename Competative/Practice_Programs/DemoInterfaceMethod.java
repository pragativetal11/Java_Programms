interface Circle
{

    //Chracteristics    (public static final)
    float PI = 3.14f;   

    //Behaviours    (public abstract)
    float Area(float Redius);
    float Circumference(float Radius);

}

class Marvelloys implements Circle
{
    //Error due to missing body of area and circumference
}

class DemoInterfaceMethod
{
    public static void main(String A[])
    {
        Marvelloys mobj = new Marvelloys();

    }
}