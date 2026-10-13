public class stock {
    public static int stockprofit(int arr[]){
        int bp=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            if(bp<arr[i]){
                int profit=arr[i]-bp;
                maxprofit=Math.max(maxprofit, profit);
            }
            else{
                bp=arr[i];
            }
        }
        return maxprofit;
    }

    public static void main(String args[]){
       
        int arr[]={7,1,5,3,6,4};
        int ans=stockprofit(arr);
        System.out.print(ans);
    }
}
