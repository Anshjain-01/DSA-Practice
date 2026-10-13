public class linear {
    public static int linearsearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int key=90;
        int arr[]={1,2,4,5,10,24,45};
        int index=linearsearch(arr, key);
        if(index==-1){
            System.out.print("Not Found");
        }
        else{
            System.out.print(index);
        }

    }
    
}
