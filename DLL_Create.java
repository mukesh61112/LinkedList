package com.company;

public class DLL_Create {
    Node head;
    class Node {
        int data;
        Node pre, next;

        Node(int data) {

             this.data=data;
             this.next=null;
             this.pre=null;
           }
    }
    public void insertHead(int data)
    {
        Node newNode=new Node(data);
        newNode.next = head;
        newNode.pre = null;

        /* 4. change prev of head node to new node */
        if (head != null)
            head.pre = newNode;

        /* 5. move the head to point to the new node */
        head = newNode;
    }
    public void insertEnd(int data)
    {
        Node newNode=new Node(data);
        newNode.next=null;
        Node temp=head;
        if(head==null)
        {
            newNode.pre=null;
            head=newNode;
            return;
        }
        while(temp.next!=null)
             temp=temp.next;
        temp.next=newNode;
        newNode.pre=temp;
    }
    public void insertAfter(Node after,int data)
    {
        Node newNode=new Node(data);
        newNode.next=after.next;
        after.next=newNode;
        newNode.pre=after;
        if (newNode.next != null)
            newNode.next.pre = newNode;
    }
    public void insertBefor(Node befor,int data)
    {
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=befor)
             temp=temp.next;
        temp.next=newNode;
        newNode.pre=temp;
        newNode.next=befor;
        befor.pre=newNode;
    }


    public void printlist(Node node)
    {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.pre;
        }
    }
    public static void main(String [] args)
    {
       DLL_Create obj=new DLL_Create();
       obj.insertHead(1);
       obj.insertHead(2);
       obj.insertEnd(3);
       obj.insertAfter(obj.head.next,12);
       obj.insertBefor(obj.head.next.next,45);
       obj.printlist(obj.head);
    }
}
