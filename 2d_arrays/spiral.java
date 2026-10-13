import java.util.*;
public class spiral {
    public static void spiral_mat(int mat[][]){
        int lenght=mat.length;
        for(int i=0;i<lenght;i++){
            int row=i,column=i;
            while(column<lenght){
                System.out.print(mat[row][column]+" ");
                column++;
            }
            row++;
            column--;
            while(row<lenght){
                System.out.print(mat[row][column]+" ");
                row++;
            }
            row--;
            column--;
            while(column>i){
                System.out.print(mat[row][column]+" ");
                column--;
            }
            while(row>i){
                System.out.print(mat[row][column]+" ");
                row--;
            }
        lenght--;
        }
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
        spiral_mat(matrix);
    }
}
