public class sorting {
    public static void bubble_sortD(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selection_sortD(int arr[]){
        for(int i=0;i<arr.length-2;i++){
            int max_pos=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[max_pos]<arr[j]){
                    max_pos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[max_pos];
            arr[max_pos]=temp;
        }
    }
    public static void insertion_sortD(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void counting_sortD(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
       int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=count.length-1;i>0;i--){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void print_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        // int arr[]={3, 6, 2, 1,8, 7, 4, 5, 3, 1};
        // bubble_sortD(arr);
        // print_array(arr);
        // selection_sortD(arr);
        // print_array(arr);
        // insertion_sortD(arr);
        // print_array(arr);
        // Arrays.sort(arr);
        // print_array(arr);
        // Arrays.sort(arr,Collections.reverseOrder());
        // print_array(arr);
        int arr2[]={2,3,1,5,3,6,3,8};
        counting_sortD(arr2);
        print_array(arr2);

    }
}
