public class Main {
    static int findMax(int left , int right , int[] arr)
    {
        int maximum = 0;
        int index = 0;
        for(int i=left;i<=right;i++)
        {
           if(arr[i]>maximum)
           {
               maximum = arr[i];
               index = i;
           }
        }
        return index;
    }
    public static void main(String[] args) {
        MaxHeap max = new MaxHeap(20);
        int arr[] = {27,19,35,11,5,30};
        max.print();

        int start = 0;
        while(start<arr.length)
        {
            Node newNode = new Node(arr[start]);
            max.insert(newNode);
        }
//        int left = 0;
//        int right = arr.length-1;
//        int maximumIndex = 0;
//        int count = 0;
//        while(count<arr.length)
//        {
//            maximumIndex = findMax(left , right ,arr);
//            max.insert(arr[maximumIndex]);
//            System.out.println(left+" "+right);
//            left = maximumIndex-1;
//            right = maximumIndex+1;
//            if(left<0)
//            {
//                left = left+2;
//            }
//            if(right>arr.length-1)
//            {
//                right = right-2;
//            }
//            count++;
//        }
        max.print();
    }
}