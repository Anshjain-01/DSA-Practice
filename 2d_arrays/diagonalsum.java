public class diagonalsum {
    public static void diagonal_sum(int mat[][]){
        int sum=0; 
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j){
                    sum+=mat[i][j];
                }
                if(i+j==mat.length-1 && i!=j){
                    sum+=mat[i][j];
                }
            }
        }
        System.out.println("The diagonal sum is :"+ sum);
    }
    public static void diagonal_sum_linear(int mat[][]){
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            if(i!=mat.length-1-i){
            sum+=mat[i][mat.length-i-1];
            }
        }
        System.out.println("The diagonal sum is :"+sum);
    }
    public static void main(String args[]){
      int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    //   diagonal_sum(mat);
      int mat2[][]={{1,2,3},{4,5,6},{7,8,9}};
    //   diagonal_sum(mat2);
    diagonal_sum_linear(mat);
    diagonal_sum_linear(mat2);
    }
}
