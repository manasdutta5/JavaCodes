package DataStructures.LinkedList;

public class Remove_Nth_NodeFromBackOfLL {


    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = null;

        int N = 4;
        System.out.println("Before deletion:");
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println("\n");
        deleteNthNode(head,N);

        System.out.println("After deletion:");
        temp = head;
        while(temp != null)
        {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }

    }

    public static void deleteNthNode(Node head, int N)
    {
        Node fast = head, slow = head;

        for(int i=1;i<=N;i++)
        {
            if(fast != null)
            {
                fast = fast.next;
            }
            else
            {
                if(i == N)
                {
                    //Deleting first node as
                    // in this case only N nodes are there
                    head = head.next;
                    return;
                }
            }
        }

        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        /*
        //Now slow is POINTING to Node to be deleted
        // Note that it isn't the Node to be deleted, it is pointing to it
        //means slow.next is the Node to be deleted
        //So delete slow.next by pointing slow.next to slow.next.next
        */

        slow.next = slow.next.next;
    }

}
