package com.company;

public class LinkedList_single_create {

    LinkedList head;
    static class LinkedList{
        int data;
        LinkedList next;
        LinkedList(int data)
        {
            this.data=data;
            this.next=null;
        }

    }
    public void printList()
    {
        LinkedList linkedList=head;
        while(linkedList!=null)
        {
            System.out.println(linkedList.data);
            linkedList=linkedList.next;
        }
    }


    public static void main(String [] args)
    {
           LinkedList_single_create obj=new LinkedList_single_create();

           obj.head=new LinkedList(1);
           LinkedList second=new LinkedList(2);
           LinkedList third=new LinkedList(3);


           obj.head.next=second;
           second.next=third;

           obj.printList();
    }
}

