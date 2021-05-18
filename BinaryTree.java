package javaapplication110;
public class BinaryTree {
     // Root of Binary Tree
    Node root;
 
    // Constructors
    BinaryTree(int key)
    {
        root = new Node(key);
    }
 
    BinaryTree()
    {
        root = null;
    }
    
    private Node addRecursive(Node root, int value) {
    if (root == null) {
        return new Node(value);
    }

    if (value < root.key) {
        root.left = addRecursive(root.left, value);
    } else if (value > root.key) {
        root.right = addRecursive(root.right, value);
    } else {
        // value already exists
        return root;
    }

    return root;
}
    
    
    public void add(int value) {
    root = addRecursive(root, value);
}
    
    
    
    
    public void infix() {
    infix(root);
}

public void infix(Node r) {
    if (r != null) {
        if (r.left != null && r.right != null) {  //Check if it is a leaf
            System.out.print ("(");
        }
        infix(r.left);
        System.out.print(r.key+" ");
        infix(r.right);
        if (r.left != null && r.right != null) {  //Check if it is a leaf
            System.out.print (")");
        }
    }

}}