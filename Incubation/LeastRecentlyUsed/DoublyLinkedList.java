public class DoublyLinkedList {
    Node head;
    Node tail;
    int size = 0;
    int count = 0;
    DoublyLinkedList(int size)
    {
        this.size = size;
    }
    void putData(int data , int data2)
    {
        Node node = new Node(data , data2);

        if(count<size)
        {
            if(head==null)
            {
                head  = tail = node;
                count++;
            }
            else
            {
                Node n = tail;
                node.prev = n;
                n.next = node;
                tail = node;
                count++;
            }
            System.out.println("Node created");
        }
        else
        {
            Node n = head;
            while(n.next!=null)
            {
                n = n.next;
            }
            n.next = node;
            node.prev = n;

            head.next = null;
        }
    }
    void getData(int data)
    {
        Node n = head;
        Node nCopy = null;

        if(tail.data==data)
        {
            System.out.println(tail.data2);
            return;
        }
        while(n.next!=null)
        {
            if(n.data == data)
            {
                System.out.println(n.data2);
            }
            n = n.next;
        }

        nCopy = n.prev;

        if(n.next!=null)
        {
            n.prev.next = n.next;
            n.next.prev = n.prev;
            while(n.next!=null)
            {
                n = n.next;
            }
            n.next = nCopy;
            nCopy.prev = n;
        }
    }
    void printData()
    {
        Node n = head;
        while(n.next!=null)
        {
            System.out.println(n.data2);
            n = n.next;
        }
    }
}