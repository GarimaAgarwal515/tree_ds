class Node {
    int data;
    Node left;
    Node right;
    public Node(int data) {
        this.data = data;
        left = right = null;
    }

    }
    public class BinaryTree {
    Node root;
    public void Traversetree(Node node) {  //traversal in binary tree inorder
        if(node!=null){
            Traversetree(node.left);
            System.out.println("  "+node.data);
            Traversetree(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree= new BinaryTree();
        tree.root = new Node(5);
        tree.root.left = new Node(10);
        tree.root.right= new Node(20);
        tree.root.left.left=new Node(30);
        tree.root.left.right=new Node(40);
        tree.root.right.left=new Node(50);
        tree.root.right.right=new Node(60);
        System.out.println("\nBinary tree: ");
        tree.Traversetree(tree.root);
    }
}
