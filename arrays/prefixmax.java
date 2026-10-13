public class prefixmax {
    public static void max_sum_subarray(int arr[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){

               sum=i==0? prefix[j] : prefix[j]-prefix[i-1];
                if(sum>max){
                        max=sum;
                    }
                sum=0;
            }
        }
        System.out.println("The max of subarrays is :"+max);
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        max_sum_subarray(arr);
        int arr2[]={2,4,6,8,10};
        max_sum_subarray(arr2);
        int arr3[]={-2,-3,4,-1,-2,1,5,-3};
        max_sum_subarray(arr3);
        int arr4[]={-1,-2,-3,-4};
        max_sum_subarray(arr4);

    }
}
