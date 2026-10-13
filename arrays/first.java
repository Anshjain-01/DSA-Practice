public class first{
    public static void updatearray(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
        
    }
public static void main(String args[]){
    int arr[]=new int[45];
    System.out.println(arr.length);
    arr[0]=45;
    arr[1]=46;
    arr[2]=76;
    updatearray(arr);
    for(int i=0;i<3;i++){
        System.out.print(arr[i]+" ");
    }
}
}