public class large {
    public static int largest(int arr[]){
        int large=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        return large;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,3,2};
        System.out.println(arr[arr.length-1]);
        System.out.print(largest(arr));


    }
}
