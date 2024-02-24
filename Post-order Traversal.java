import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BST{
    Node root;
    BST(){
        this.root=null;
    }
    void insert(int data){
        Node newNode=new Node(data);
        if(root==null){
            root=newNode;
        }else{
            Node temp=root;
            while(true){
                if(newNode.data<temp.data){
                    if(temp.left==null){
                        temp.left=newNode;
                        break;

                    }else{
                        temp=temp.left;
                    }


                }else if(newNode.data>temp.data){
                    if(temp.right==null){
                        temp.right=newNode;
                        break;

                    }else{
                        temp=temp.right;
                    }
                }
            }

        }

    }
    void print(){
        printorder(this.root);
    } void printorder(Node root){
        if(root==null){
            return;
        }
        printorder(root.left);
        printorder(root.right);
        System.out.print(root.data+" ");
    }
}

class Main{
public static void main(String args[]){
        Scanner m=new Scanner(System.in);
         int n=m.nextInt();
          BST b=new BST();
          while(n>0){
               b.insert(n);
               n=m.nextInt();
           }
         b.print();
}
}
	
