public class power2 {
    public static boolean power_of_two(int num){
        return (num & (num-1))==0;
    }
    public static void main(String args[]){
       ;
        System.out.print( power_of_two(89));
    }
}
