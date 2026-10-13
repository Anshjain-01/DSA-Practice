public class subarray {
    public static void sub_arrays(int arr[]){
        int ts=0,sum=0,max=Integer.MIN_VALUE;
       
        for(int i=0;i<arr.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                    if(sum>max){
                        max=sum;
                    }
                    if(sum<min){
                        min=sum;
                    }
                }
                System.out.print(","+"the sum is ="+sum);
                System.out.println();
                ts++;
                sum=0;

            }
            System.out.println("The max of subarrays is :"+max);
            System.out.println("The min of subarrays is :"+min);
            max=0;
            System.out.println();
        }
        System.out.print("The total number of subarrays is :"+ts);
        
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        sub_arrays(arr);

    }
}
