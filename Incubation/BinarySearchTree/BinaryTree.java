class BinaryTree{
    Node root;
    void insertRec(int data)
    {
        root=insert(root,data);
    }
    Node insert(Node root,int n){
        if(root==null)
        {
            root = new Node(n);
        }
        else if(n<root.data)
        {
            root.left=insert(root.left,n);
        }
        else if(n>root.data)
        {
            root.right=insert(root.right,n);
        }
        return root;
    }
    void inorder(Node root) {
        if (root == null)
        {
            return;
        }
        inorder(root.left);

        if(root.left==null && root.right==null)
        {
            System.out.print("["+"-,"+root.data+",-"+"]");
        }
        else if(root.left==null && root.right!=null)
        {
            System.out.print("["+"-,"+root.data+","+root.right.data+"]");
        }
        else if(root.left!=null && root.right==null)
        {
            System.out.print("["+root.left.data+","+root.data+",-"+"]");
        }
        else
        {
            System.out.print("["+root.left.data+","+root.data+","+root.right.data+"]");
        }
        inorder(root.right);
    }
}