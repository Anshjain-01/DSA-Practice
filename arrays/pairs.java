public class pairs {
    public static void pairs_in_array(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ arr[i]+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.print("The total number of pairs is "+tp);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        pairs_in_array(arr);

    }
}
