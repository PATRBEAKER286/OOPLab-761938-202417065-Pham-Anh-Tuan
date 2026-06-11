package hust.soict.dsai.lab01;

import java.util.Scanner;
public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matric1 = {{1,2},{3,4}};
        int[][] matric2 = {{5,6},{7,8}};
        int[][] mat1;
        int[][] mat2;
        System.out.print("0: default matric , 1: optional matric:");
        int choose = sc.nextInt();
        if(choose == 0){
            mat1 = matric1;
            mat2 = matric2;
        }
        else{
            int n,m;
            System.out.print("enter n,m:");
            n = sc.nextInt();
            m = sc.nextInt();
            mat1 = new int[n][m];
            mat2 = new int[n][m];
            System.out.println("enter matric1:");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    mat1[i][j] = sc.nextInt();
                } 
            }
            System.out.println("enter matric2:");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    mat2[i][j] = sc.nextInt();
                } 
            }
        }
        int r = mat1.length;
        int c = mat1[0].length;
        int[][] result = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
            } 
        }
        for (int i = 0; i < r; i++){ 
            for (int j = 0; j < c; j++){ 
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
