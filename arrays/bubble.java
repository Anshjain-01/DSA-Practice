public class bubble {
    public static void bubble_sort(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String args[]){
        int arr[]={5,4,3,1,2};
        bubble_sort(arr);
        int arr2[]={7,8,9,0,1,2,3};
        bubble_sort(arr2);

    }
}
