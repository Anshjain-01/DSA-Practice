public class kadane {
    public static void kadane_max(int arr[]){
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.print("The max of subarrays is :"+max);
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        kadane_max(arr);
    }
}
