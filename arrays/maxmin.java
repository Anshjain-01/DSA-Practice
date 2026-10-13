public class maxmin {
    public static void max_min(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The max value in the array is :"+max);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The min value in the array is :"+min);
    }
    public static void main(String args[]){
        int arr[]={4,2,8,10,7,1};
        max_min(arr);

    }
}
