public class Linked {
    Node head;
    void insert(int data)
    {
        Node node = new Node(data);

        if(head==null)
        {
            head  = node;
        }
        else
        {
            Node n = head;

            while(n.next!=null)
            {
                n = n.next;
            }

            node.prev = n;
            n.next = node;
        }
    }

    void delete(int data1)
    {
        Node n = head;
        if( n.data == data1)
        {
            head = n.next;
            n.prev = null;
            return;
        }

        while(n.next!=null)
        {
            if(n.data == data1)
            {
                n.prev.next = n.next;
                n.next.prev = n.prev;
                return;
            }
            n = n.next;
        }
    }
    void disp()
    {
        Node n = head;
        while(n.next!=null)
        {
            n = n.next;
        }
        System.out.println(n.data);
        Node n1 = n.prev;
        while(n1.prev!=null)
        {
            System.out.println(n1.data);
            n1 = n1.prev;
        }
        System.out.println(n1.data);
    }
}