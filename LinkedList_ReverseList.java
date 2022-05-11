package com.company;


public class LinkedList_ReverseList {
    LinkedList head;

    public  class LinkedList{
        int data;
        LinkedList next;
        LinkedList(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void insertHead(int data)
    {
        LinkedList newNode=new LinkedList(data);
        newNode.next=head;
        head=newNode;
    }


    public void insertEnd(int data)
    {
        LinkedList newNode=new LinkedList(data);
        if(head==null)
        {
            head=new LinkedList(data);
            return ;
        }
        newNode.next=null;
        LinkedList lastNode=head;

        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
        }

        lastNode.next=newNode;
        return ;
    }
    public void insertAfter(LinkedList temp,int data)
    {
        LinkedList newNode=new LinkedList(data);
        if(head==null)
        {
            System.out.println(" linked list is empty");
            return ;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void printList()
    {
        LinkedList temp=head;
        while(temp!=null)
        {
            System.out.print("  " +  temp.data);
            temp=temp.next;
        }
        System.out.println();
        return ;
    }

    public void reverseList()
    {
        LinkedList prev = null;
        LinkedList current = head;
        LinkedList next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

    }
    public static void main(String [] args)
    {
        LinkedList_ReverseList obj=new LinkedList_ReverseList();
        obj.insertEnd(10);
        obj.insertEnd(9);
        obj.insertHead(1);
        obj.insertHead(2);
        obj.insertEnd(4);
        obj.insertAfter(obj.head.next.next,44);
        obj.insertAfter(obj.head.next,440);


        obj.printList();
        obj.reverseList();
        obj.printList();

    }
}
