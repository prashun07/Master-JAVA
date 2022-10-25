package CoreJava;

import java.util.Scanner;

public class lowerMatrix {
    public  static void main(String[] args){
        System.out.println("Enter the Row and Column for matrix");
        int row,col;
        Scanner scanner=new Scanner(System.in);
        row=scanner.nextInt();
        col=scanner.nextInt();
        int [][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        printOriginMatrix(arr,row,col);
        printLowerMatrix(arr,row,col);


    }

    private static void printLowerMatrix(int[][] arr, int row, int col) {
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i<j) {
                arr[i][j]=0;
                }
            }
        }
        printOriginMatrix(arr,row,col);
    }

    private static void printOriginMatrix(int[][] arr,int row,int col) {
        if(row!=col){
            System.out.println("Unequal row and column");
            System.exit(1);
        }
        else{
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
