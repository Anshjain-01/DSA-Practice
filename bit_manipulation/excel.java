public class excel {
    public static void main(String args[]){
        String str="AAA";
        // int n=str.charAt(0)-64;
        // System.out.print(n);
         int k=str.length()-1;
        int num=0;
   for(int i=0;i<str.length();i++){
     
    int value=(int)((str.charAt(i)-64) * Math.pow(26,k));
    num=value+num;
    k--;

   }
     System.out.print(num);
    }
}
