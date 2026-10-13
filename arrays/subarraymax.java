public class subarraymax {
    public static void max_sum_subarray(int arr[]){
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    
                    if(sum>max){
                        max=sum;
                    }
                }
                System.out.println("the sum is ="+sum);
                sum=0;
            }
        }
        System.out.println("The max of subarrays is :"+max);
    }
    public static void main(String args[]){
        // int arr[]={1,-2,6,-1,3};
        // max_sum_subarray(arr);
        int arr2[]={2,4,6,8,10};
        max_sum_subarray(arr2);

    }
}
