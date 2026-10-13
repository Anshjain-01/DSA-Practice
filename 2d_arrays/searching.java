public class searching {
    public static boolean  search(int mat[][], int key){
        int row=0;
        int column=mat[0].length-1;
        while(row<mat.length && column>=0){
            if(key==mat[row][column]){
                System.out.print("The key is found at :"+"("+row+","+column+")");
                return true;
            }
            else if(key>mat[row][column]){
                row++;
            }
            else{
                column--;
            }
        }
        System.out.print("Key not found ");
        return false;
    }
    public static void main(String args[]){
        int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key=25;
        search(mat, key);
        }

    }
    

