class Node {
    Node left, right;
    int val;
    Node(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}

class BinaryTree {
    
    static void printInOrder(Node node) {
        if(node == null) return;
        printInOrder(node.left);
        printInOrder(node.right);
        System.out.print(node.val + " ");
    }
}

public class BT {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
    
            //      1
            //     / \
            //     2  3
            //    /\   \
            //   4  5   6

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        BinaryTree.printInOrder(a);
    }

}

