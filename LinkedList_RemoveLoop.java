package com.company;


public class LinkedList_RemoveLoop {
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
    public void findLoop()
    {
        LinkedList slow =head,fast=head;
        while(slow!=null&&fast!=null&& fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                System.out.println(" \n loop exits.........");
                return ;
            }
        }
        System.out.println(" \n loop not exits.........");
         return ;
    }
    public void removeLoop()
    {
        LinkedList slow =head,fast=head;
        while(slow!=null&&fast!=null&& fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                  break;
            }
        }
        LinkedList temp=head;
        while(temp.next!=slow)
              temp=temp.next;
        temp.next=null;
    }
    public void printList()
    {
        LinkedList temp=head;
        while(temp!=null)
        {
            System.out.print("  " +  temp.data);
            temp=temp.next;
        }
        return ;
    }

    public static void main(String [] args)
    {
        LinkedList_RemoveLoop obj=new LinkedList_RemoveLoop();
        obj.insertEnd(10);
        obj.insertEnd(9);
        obj.insertHead(1);
        obj.insertHead(2);
        obj.insertEnd(4);
        obj.insertAfter(obj.head.next.next,44);
        obj.insertAfter(obj.head.next,440);

        obj.printList();
        obj.head.next.next.next.next.next.next=obj.head.next.next.next;
        obj.findLoop();
        obj.removeLoop();
        obj.findLoop();
    }
}
