/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package largest_rows_columns;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Largest_Rows_Columns {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
         System.out.println("Enter number of row");
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        
        for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
        matrix[i][j]=ran.nextInt(2);
        }
        }
        System.out.println("Matrix here");
        for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            System.out.print(matrix[i][j]+" ");
        }
            System.out.println();
        }
        
        ArrayList<Integer> maxCols=new ArrayList<>();
        ArrayList<Integer> maxRow=new ArrayList<>();
        
        int maxOne=0;
        
        for(int  i=0; i<n; i++){
            int row=0;
            int col=0;
            for(int j=0; j<n; j++){
            if(matrix[i][j]==1){
            row++;
            }
             if(matrix[j][i]==1){
            col++;
            }
             if(row>maxOne){
             maxRow.clear();
             maxRow.add(i);
             maxOne=row;
             }
             else if(row==maxOne){
             maxRow.add(i);
             }
             if(col>maxOne){
             maxCols.clear();
             maxCols.add(i);
             maxOne=col;
             }
             else if(col==maxOne){
             maxCols.add(i);
             }
            }
        }
        
        System.out.println("Rows with 1s "+maxRow );
        System.out.println("Col with 0s  "+maxCols);
    }
    
}
