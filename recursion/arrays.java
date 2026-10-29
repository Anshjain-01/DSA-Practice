public class arrays {
    public static boolean sorted_array(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sorted_array(arr,i+1);
    }
    public static int searchfirst(int arr[], int key, int i){
        if (i==arr.length){
            return -1;
        }
        else if(arr[i]==key){
            return i;
        }
        else{
            return searchfirst(arr,key,i+1);
        }
    }
    public static int lastsearch(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isfound=lastsearch(arr, key, i+1);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;

    }
    public static void main(String args[]){
                int arr[]={1,2,3,4,5,2,4,7};
                // int arr1[]={2,3,6,2,6};
                // System.out.println(sorted_array(arr, 0));
                // System.out.println(sorted_array(arr1, 0));
                int key=4;
                int ans=lastsearch(arr, key, 0);
                if(ans==-1){
                    System.out.print("The key is not found ");
                }
                else{
                    System.out.print("The key is found at index :"+ans);
                }
    }
}
