import java.util.*;
public class  Building{
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
   public static Node Insert(Node root,int val){
    if(root==null){
        root=new Node(val);
        return root;
    }
    if(root.data>val){
        root.left=Insert(root.left, val);
    }else{
        root.right=Insert(root.right, val);
    }
    return root;
   }
   public static void inorder(Node root){
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
   }
   public static boolean searching(Node root,int key){
    if(root==null){
        return false;
    }
    if(root.data==key){
        return true;
    }
    if(root.data>key){
        return searching(root.left, key);
    }else{
        return searching(root.right, key);
    }
   }

   public static Node delete(Node root,int val){
    if(root.data<val){
        root.right=delete(root.right,val);
    }else if(root.data>val){
        root.left=delete(root.left,val);
    }else{
        //  0 child leaf node
        if(root.left==null && root.right==null){
            return null;
        }
        // 1 child
        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }

        // 2 childs
        Node IS=findIS(root.right);
        root.data=IS.data;
        root.right=delete(root.right, IS.data);
    }
    return root;
   }

   public static Node findIS(Node root){
    while(root.left!=null){
    root=root.left;
    }
    return root;
   }

   public static void printinrange(Node root,int k1,int k2){
      
    if(root==null){
        return;
    }

    if(root.data>=k1 && root.data<=k2){
        printinrange(root.left, k1, k2);
        System.out.print(root.data+" ");
        printinrange(root.right, k1, k2);
    }else if(root.data<k1){
        printinrange(root.left, k1, k2);
    }else{
        printinrange(root.right, k1, k2);
    }
   }

   public static void printpath(ArrayList<Integer> path){
   for(int i=0;i<path.size();i++){
    System.out.print(path.get(i)+"->");
   }
   System.out.println("NUll");
   }
   public static void root2leaf(Node root,ArrayList<Integer> path){
         if(root==null){return;}
         path.add(root.data);
         if(root.left==null && root.right==null){
            printpath(path);
         }
         root2leaf(root.left, path);
         root2leaf(root.right, path);
         path.remove(path.size()-1);
   }
   public static boolean isValid(Node root,Node min,Node max){
    if(root==null){
        return true;
    }
    if(min!=null && root.data<=min.data){
        return false;
    }
    else if(max!=null && root.data>=max.data){
        return false;
    }
    return isValid(root.left, min, root) && isValid(root.right, root, max);
   }

   

    public static void main(String[] args) {
        
      int val[]={8,5,3,1,4,6,10,11,14};
     
      Node root=null;
      for(int i=0;i<val.length;i++){
        root=Insert(root, val[i]);
      }
    
    //   System.out.println();
    //   System.out.print(searching(root, 8));
    // Node ans=delete(root, 8);
    //  inorder(root);
    //  printinrange(root, 1, 14);
    // root2leaf(root, new ArrayList<>() );

    if(isValid(root, null, null)){
        System.out.print("valid bst");
    }else{
        System.out.print("Invalid bst");
    }
    }
}