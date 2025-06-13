//public class validParantheses {
//    private int arr[];
//    private int top;
//    private int capacity;
//    Stack(int size) {
//        arr = new int[size];
//        capacity = size;
//        top = -1;
//    }
//    public void push(int x) {
//        if (isFull()) {
//            System.out.println("OverFlow\nProgram Terminated\n");
//            System.exit(1);
//        }
//
//        System.out.println("Inserting " + x);
//        arr[++top] = x;
//    }
//
//    public int pop() {
//        if (isEmpty()) {
//            System.out.println("STACK EMPTY");
//            System.exit(1);
//        }
//        return arr[top--];
//    }
//
//    public int size() {
//        return top + 1;
//    }
//
//    public Boolean isEmpty() {
//        return top == -1;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}