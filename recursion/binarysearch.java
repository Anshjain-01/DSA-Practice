public class binarysearch {
    static int bs(int target,int low,int high,int arr[]){
        if(low>high){
            return -1;
        }
       int mid=(low+high)/2;
        if(target==arr[mid]){
            return mid;
        }
        else if(target>arr[mid]){
            low=mid+1;
            return bs(target,low,high,arr);
        }
        else{
            high=mid-1;
           return bs(target,low,high,arr);
        }
        
    }

    //   static int search(int arr[],int target,int s, int e){
    //     if(s>e){
    //         return -1;
    //     }
    //     int m=s+(e-s)/2;
    //     if(arr[m]==target){
    //         return m;
    //     }
    //     if(target<arr[m]){
    //         return search(arr,target,s,m-1);
    //     }
    //      return search(arr,target,m+1,e);
    //   }
    public static void main(String args[]){
          int arr[]={6,9,14,27,90,101,110};
          int ans1=bs(130, 0, arr.length-1, arr);
        //  int ans= search(arr,101,0,arr.length-1);
        //  System.out.println(ans);
        System.out.println(ans1);
    }
}
