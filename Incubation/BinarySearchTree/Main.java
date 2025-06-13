public class Main {
    public static void main(String[] args) {

        BinaryTree b=new BinaryTree();
        b.insertRec(5);
        b.insertRec(8);
        b.insertRec(10);
        b.insertRec(1);
        b.insertRec(18);
        b.insertRec(11);

        b.inorder(b.root);

    }
}