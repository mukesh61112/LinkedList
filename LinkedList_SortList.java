package com.company;
 class LinkedList1{
    int data;

    LinkedList1 next;
    LinkedList1(int data)
    {
        this.data=data;
        this.next=null;
    }

}
public class LinkedList_SortList {
    LinkedList1 head=null;
    public void insertHead(int data)
    {
        LinkedList1 newNode=new LinkedList1(data);
        LinkedList1 temp=head;

        if(temp==null)
        {
            head=newNode;
        }

        newNode.next=temp;
        head=newNode;

    }
    public void insertEnd(int data)
    {
        LinkedList1 newNode=new LinkedList1(data);
        LinkedList1 temp=head;
        if(head==null)
            System.out.println(" LL is empty");
        while(temp.next!=null)
              temp=temp.next;
        temp.next=newNode;
    }
    public  void printList()
    {
        LinkedList1 temp=head;

        while(temp!=null)
        {
            System.out.print(temp.data+" ");

            temp=temp.next;
        }
        System.out.println();
    }
    public void SortList()
    {
        LinkedList1 temp=head;
        int count=1;
        while(temp.next!=null)
        {
             count++;
             temp=temp.next;
        }
        LinkedList1 check=head;
        LinkedList1 mini=null;
        for(int i=1;i<=count;i++)
        {
            mini=check;
            LinkedList1 node=check.next;

            while(node!=null)
            {
                if(mini.data>node.data)
                      mini=node;
                node=node.next;
            }
            int p=mini.data;
            mini.data=check.data;
            check.data=p;
            check=check.next;
        }
    }

    public static void main(String [] args)
    {
         LinkedList_SortList obj=new LinkedList_SortList();
         obj.insertHead(10);
         obj.insertHead(2);
        obj.insertHead(7);
        obj.insertHead(9);
        obj.insertEnd(1);
      obj.printList();
      obj.SortList();
      obj.printList();
    }

}
