public class operations {
    public static void get_ith(int num, int i){
        if((num&(1<<i))!=0){
            System.out.print("The ith bit is "+ 1);
        }
        else{
            System.out.print("The ith bit is "+0);
        } 
    }
    public static int set_ith(int num,int i){
        int bitmask=1<<i;
        return (num|bitmask);
    }
    public static int clear_ith(int num, int i){
        int bitmask=(~(1<<i));
        return num&bitmask;
    }
    public static int update_ith(int num, int i, int newbit){
        // if(newbit==0){
        //     return clear_ith(num, i);
        // }
        // else{
        //     return set_ith(num, i);
        // }
        num=clear_ith(num, i);
        int bitmask=newbit<<i;
        return num|bitmask;
        
    }
    public static int clearibits(int num, int i){
    //     i=i-1;
    //     while(i>=0){
            
    //         num=clear_ith(num, i);
    //         i--;
    //     }
    //    return num;
    // if(i==0){
    //     return num;
    // }
    // num=clear_ith(num, i-1);
    // return clearibits(num, i--);
         int bitmask=~0<<i;
        return num&bitmask;
    }
    public static int bitsinrange(int num, int i, int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return num& bitmask;
    }
    public static void main(String args[]){
        // get_ith(7, 3);
        // System.out.print(set_ith(8, 2));
        // System.out.print(clear_ith(10, 1));
        // System.out.print(update_ith(10, 2, 1));
        // System.out.print(clearibits(15, 2));
        System.out.print(bitsinrange(10, 2, 4));

    }
}
