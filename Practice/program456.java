/*
    Singly Linear Linked List
    1. InsertFirst
    2. InsertLast
    3. Display
    4.Count
    4.DeleteFirst
    5. DeleteLast
*/

class node
{
    public int data;
    public node next;                      

    node(int no)
    {
        this.data = no;
        this.next = null;
    }
}

class SinglyLL
{
    private node first;
    private int iCount;

    public SinglyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void Display()
    {
        node temp = first;

        if(first == null)
        {
            return;
        }

        while (temp != null) 
        {
            System.out.print("|" + temp.data + " | -> ");
            temp = temp.next;   
        }
        System.out.println("null");
    }

    public int Count()
    {
        return this.iCount;
    }

    public void InsertFirst(int iNo)
    {
        node newn = new node(iNo);

        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            newn.next = this.first;
            this.first = newn;
        }
        this.iCount++;
    }

    public void InsertLast(int iNo)
    {
        node temp = first;

        node newn = new node(iNo);

        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            while (temp.next != null) 
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
        this.iCount++;
    }

    public void InsertAtPos(int iNo, int iPos)
    {}

    public void DeleteFirst()
    {
        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = null;
        }
        else
        {
            first = first.next;
        }
        iCount--;
    }

    public void DeleteLast()
    {
        if(first == null)
        {
            return;
        } 
        else if(first.next == null)
        {
            first = null;
        }
        else
        {
            node temp = first;

            while (temp.next.next != null) 
            {
                temp = temp.next;
            }
            temp.next = null;
        }
        iCount--;
    }

    public void DeleteAtPos(int iPos)
    {}
}

class program456
{
    public static void main(String A[])
    {
        int iRet = 0;

        SinglyLL sobj = new SinglyLL();

        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of nodes are : " + iRet);

        sobj.InsertLast(101);
        sobj.InsertLast(111);
        sobj.InsertLast(121);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of nodes are : " + iRet);

        sobj.DeleteFirst();

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of nodes are : " + iRet);

        sobj.DeleteLast();

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of nodes are : " + iRet);


    }
}