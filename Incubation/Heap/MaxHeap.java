public class MaxHeap {
    int[] heap;
    int size = 0;
    Node root;
    Node head;
    MaxHeap(int size)
    {
        heap = new int[size];
    }
    void insert(Node node) {
        Node n = root;
        if(root==null)
        {
            head = node;
            root = node;
            return;
        }
        if(node.data<n.data)
        {
            node.right = node;
            root = node;
        }
        else
        {
            head.left =
        }

//        if(check)
//        {
//            heap[size] = val;
//            size++;
//        }
//        else
//        {
//            size = size-1;
//            for(int i=size;i>=1;i--)
//            {
//                heap[size--] = heap[i-1];
//            }
//        }
//        heap[size] = val;
//        int i = size;
//        size++;
//
//        while (i > 0 && heap[i] > heap[(i-1)/2]) {
//            swap(heap , i , (i-1)/2);
//            i = (i - 1) / 2;
//        }
    }
    int Max() {
        if (size == 0)
        {
            return -1;
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;

        int i = 0;
        while (i<size)
        {
           int left = (2*i)+1;
           int right = (2*i)+2;
           int largest = i;

            if (left<size && heap[left] > heap[largest])
            {
                largest = left;
            }
            if (right<size && heap[right] > heap[largest])
            {
                largest = right;
            }

            if (largest == i)
            {
                break;
            }
            swap(heap , i , largest);
            i = largest;
        }
        return max;
    }
    void swap(int[] arr,int i ,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void print() {
        for (int i = 0; i < size; i++)
            System.out.print(heap[i] + " ");
        System.out.println();
    }

}