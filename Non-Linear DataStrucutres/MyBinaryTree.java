import java.util.Scanner;

public class MyBinaryTree {
   static Scanner sc = null;
   public static void main(String args[]){
       sc = new Scanner(System.in);
       Node root = createTree();
       preOrder(root);
       System.out.println();
       postOrder(root);
       System.out.println();
       inOrder(root);
       System.out.println();
       System.out.println(height(root));
   }
   //Creating Binary Tree
   static Node createTree(){
        Node root = null;
        System.out.println("Enter data :");
        int data = sc.nextInt();
        if(data==-1){
            return null;
        }
        root = new Node(data);
        System.out.println("Enter left child of " + data + " :");
        root.left = createTree();
        System.out.println("Enter right child of " + data + " :");
        root.right = createTree();
        return root;
   }
   //Preorder Traversal
   public static void preOrder(Node root){
       if(root==null){
           return;
       }
       System.out.print(root.data + " ");
       preOrder(root.left);
       preOrder(root.right);

   }
   //Postorder Traversal
   public static void postOrder(Node root){
    if(root==null){
        return;
    }
   
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");

}
//Inorder Traversal
public static void inOrder(Node root){
    if(root==null){
        return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);

}
//Height of Binary Tree
public static int height(Node root){
    if(root==null)
        return -1;
    else{
        return Math.max(height(root.left),height(root.right))+1;
    }
   
}

}
class Node{
	Node left,right;
	int data;
	Node(int data){
		this.data = data;
	}
}
