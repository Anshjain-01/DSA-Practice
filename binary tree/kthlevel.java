import java.util.*;
public class kthlevel{
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Info{
        Node node;
        int level;
    
        public Info(Node node,int level){
            this.node=node;
            this.level=level;
        }
    }

    public static void kth(Node root,int k){
        Queue<Info> q=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        q.add(new Info(root,1));
        q.add(null);
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(curr.level==k){
                    list.add(curr.node.data);
                }else{
                    if(curr.node.left!=null){
                        q.add(new Info(curr.node.left,curr.level+1));
                    }
                    if(curr.node.right!=null){
                        q.add(new Info(curr.node.right,curr.level+1));
                    }
                }
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
    public static void kthrec(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        kthrec(root.left, level+1, k);
        kthrec(root.right, level+1, k);
    }
    public static void main(String args[]){
         //     1
    //    /  \
    //   2     3
    //  / \   / \
    // 4   5 6    7

    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
   root.right.left=new Node(6);
   root.right.right=new Node(7);
     root.right.right.right=new Node(9);
//    kth(root, 4);
kthrec(root, 1, 2);

    }
}