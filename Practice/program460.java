/*
    Doubly circular linked list
*/

class node
{
    public int data;
    public node next;
    public node prev;

    node(int no)
    {
        this.data = no;
        this.next = null;
        this.prev = null;
    }
}

class DoublyCL
{
    private node first;
    private node last;
    private int iCount;

    DoublyCL()
    {
        this.first = null;
        this.last = null;
        this.iCount = 0;
    }

    public void Display()
    {
        if(first == null && last == null)
        {
            return;
        }

        System.out.print("<=>");
        do
        {
            System.out.print(" | " + first.data + " | <=> ");
            first = first.next;
        }while(first != last.next);

        System.out.println();
    }

    public int Count()
    {
        if(first == null && last == null)
        {
            return iCount;
        }

        return iCount;
    }

    public void InsertFirst(int iNo)
    {
        node newn = null;
        newn = new node(iNo);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;

            newn.next = first;
            newn.prev = last;
        }
        else
        {
            newn.next = first;
            first.prev = newn;

            first = newn;
        }
        last.next = first;
        first.prev = last;

        iCount++;
    }

    public void InsertLast(int iNo)
    {
        node newn = null;

        newn = new node(iNo);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;

            newn.next = first;
            newn.prev = last;
        }
        else
        {
            last.next = newn;

            newn.prev = last;
            last = newn;
        }
        last.next = first;
        first.prev = last;

        iCount++;

    }

    public void InsertAtPos(int iNo, int iPos)
    {
        node newn = null;
        node temp = null;

        int i = 0;

        if(iPos < 1 || iPos > iCount+1)
        {
            return;
        }

        if(iPos == 1)
        {
            InsertFirst(iNo);
        }
        else if(iPos == iCount+1)
        {
            InsertLast(iNo);
        }
        else
        {
            newn = new node(iNo);

            temp = first;

            for(i = 1; i < iPos - 1; i++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next.prev = newn;

            temp.next = newn;
            newn.prev = temp;

            iCount++;
        }
    }

    public void DeleteFirst()
    {
        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            first = first.next;
        }
        last.next = first;
        first.prev = last;

        iCount--;
    }

    public void DeleteLast()
    {
        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            last = last.prev;
        }
        last.next = first;
        first.prev = last;

        iCount--;
    }

    public void DeleteAtPos(int iPos)
    {
        node temp = null;

        int i = 0;

        if(iPos < 1 || iPos > iCount)
        {
            return;
        }

        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == iCount)
        {
            DeleteLast();;
        }
        else
        {
            temp = first;

            for(i = 1; i < iPos - 1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;

            iCount--;
        }
    }

}

class program460
{
    public static void main(String A[])
    {
        int iRet = 0;

        DoublyCL dobj = new DoublyCL();

        dobj.InsertFirst(51);
        dobj.InsertFirst(21);
        dobj.InsertFirst(11);

        dobj.Display();
        iRet = dobj.Count();

        System.out.println("Number of nodes are : " + iRet);

        dobj.InsertLast(101);
        dobj.InsertLast(111);
        dobj.InsertLast(121);

        dobj.Display();
        iRet = dobj.Count();

        System.out.println("Number of nodes are : " + iRet);

        dobj.DeleteFirst();

        dobj.Display();
        iRet = dobj.Count();

        System.out.println("Number of nodes are : " + iRet);

        dobj.DeleteLast();

        dobj.Display();
        iRet = dobj.Count();

        System.out.println("Number of nodes are : " + iRet);

        dobj.InsertAtPos(105, 4);

        dobj.Display();
        iRet = dobj.Count();

        System.out.println("Number of nodes are : " + iRet);

        dobj.DeleteAtPos(4);

        dobj.Display();
        iRet = dobj.Count();

        System.out.println("Number of nodes are : " + iRet);
    }
}