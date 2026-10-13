public class binarysearch {
    public static int binary_search(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int key=7;
        int index=binary_search(arr, key);
        if(index==-1){
            System.out.print("Not found");
        }
        else{
            System.out.print(index);
        }

    }
}
