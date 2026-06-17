class ArrayDemo
{
    public static void main(String A[])
    {
        int Arr[] = {10,20,30,40};

        int []Brr = {10,20,30,40}; 

        int crr[] = new int[4];

        crr[0] = 10;
        crr[1] = 20;
        crr[3] = 30;
        crr[4] = 40;

        System.out.println(Arr.length);
        System.out.println(Brr.length);
        System.out.println(crr.length);
    }
}