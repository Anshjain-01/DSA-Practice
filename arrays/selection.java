public class selection {
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length-2;i++){
            int min_pos=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[min_pos]>arr[j]){
                    min_pos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_pos];
            arr[min_pos]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={2,3,1,5,7,6};
        selection_sort(arr);
    }
}
