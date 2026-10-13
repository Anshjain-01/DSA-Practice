public class diameterTree{
     static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
     public static int height(Node root){
        if(root==null){return 0;}

        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    // Approch 1
    public static int diameter1(Node root){
        if(root==null){return 0;}

        int ldiam=diameter1(root.left);
        int lh=height(root.left);
        int rdiam=diameter1(root.right);
        int rh=height(root.right);
        int selfdiam=lh+rh+1;
        return Math.max(selfdiam,(Math.max(ldiam,rdiam)));
    }
    // Approach 2

    static class Info{
        int diam;
        int ht;

        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter2(Node root){
        if(root==null){
            return new Info(0,0);
        }
      
        Info linfo=diameter2(root.left);
        Info rinfo=diameter2(root.right);

        int diam=Math.max(Math.max(linfo.diam,rinfo.diam),linfo.ht+rinfo.ht+1);
        int ht=Math.max(linfo.ht,rinfo.ht)+1;

        return new Info(diam,ht);
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
   System.out.println("The diameter of the tree is :"+diameter1(root));
   System.out.println("The diameter of the tree is :"+diameter2(root).ht);
    }
}