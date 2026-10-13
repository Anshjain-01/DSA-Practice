public class bubblenew {
    public static void bubble_sort(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            int swap=0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        bubble_sort(arr);
        int arr2[]={2,3,1,4,7,5,4};
        bubble_sort(arr2);
    }
}
