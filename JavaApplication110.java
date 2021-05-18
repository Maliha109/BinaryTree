package javaapplication110;

public class JavaApplication110 {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        Node root = null;

       /* tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4); */
        
        tree.add(15);
        tree.add(100);
        tree.add(150);
        tree.add(50);
        tree.add(25);
        tree.add(10);
        tree.add(500);
        tree.infix();
        
        

    }
}
