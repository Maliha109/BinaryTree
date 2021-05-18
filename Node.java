
package javaapplication110;

public class Node {

    int key;
    Node left, right;
   
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
    public Node(int key, Node left, Node right){
        this.key=key;
        this.left=left;
        this.right=right;
    }
}

