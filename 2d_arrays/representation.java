import java.util.*;
public class representation{
    public static void search(int mat[][], int target){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==target){
                    System.out.println("Found");
                    System.out.println("The target is found at index :"+i+" & "+j);
                    return;
                }
            }
        }
        System.out.println("Not Found");
    }
    public static void max(int mat[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
               if(max<mat[i][j]){
                max=mat[i][j];
               }
            }
        }
        System.out.print("The max of matrix is : "+max);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int matrix[][]= new int[3][3];
        // int n=3,m=3;
        System.out.print("Enter the values of matrix :");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                 matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                 System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
       max(matrix);
        
    }
}