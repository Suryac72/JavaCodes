public class BinarySearchTree {
    public static void main(String args[]){
         BST a = new BST();
         Node root = null;
         root = a.insert(root, 8);
         root = a.insert(root, 3);
         root = a.insert(root, 6);
         root = a.insert(root, 10);
         root = a.insert(root, 4);
         root = a.insert(root, 7);
         root = a.insert(root, 1);
         root = a.insert(root, 14);
         root = a.insert(root, 13);
      
 
    } 
 }

class Node{
    int data;
    Node left;
    Node right;
}

class BST{
    //Creating a Binary Search Tree

    public Node createNewNode(int data){
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;

        return node;
    }
    //Inserting node in Binary search Node

    public Node insert(Node root,int  val){
        if(root==null){
           return  createNewNode(val);
        }
        if(val < root.data){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }

    //Deleting a node in Binary Search Tree

    public node delete(Node root,int val){
        if(root==null){
            return null;
        }
        if(val<root.data){
            root.left = delete(root.left,val);
        }
        else{
            root.right = delete(root.right,val);
        }
    }
   
}

