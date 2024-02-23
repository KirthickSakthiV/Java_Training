import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Bst{
    Node root;
    Bst(){
        this.root=null;
    }
    void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node temp = root;
            while (true) {
                if (newNode.data < temp.data) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else if (newNode.data > temp.data) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {
                        temp = temp.right;
                    }

                }
            }
        }
    }
    void display()
    {
        displayRec(this.root);
    }
    void displayRec(Node root){
        if(root==null){
            return;
        }
        displayRec(root.left);
        System.out.println(root.data);
        displayRec(root.right);
    }
}

public class Tree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Bst tree1 = new Bst();
        for (int i = 0; i < n; i++) {
            tree1.insert(s.nextInt());

        }
        tree1.display();
    }
}


