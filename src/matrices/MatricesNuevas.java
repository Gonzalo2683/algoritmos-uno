/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author alumnoFI
 */
public class MatricesNuevas {
    
    public static void main(String[] args) {
        
        int[][] m = {
            {1, 2, 3, 10},
            {4, 5, 6, 20},
            {7, 8, 9, 30},
            {11,12,13,40}
        };
        
        // mostrarMatriz(m);
        // System.out.print(maximomatriz(m));
        // mostrardiagonal(m);
        // System.out.print(maximomatriz(m));
        mostrarcolumna(m, 0);
    }
    
    public static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (j == m[0].length - 1){
                    System.out.print(m[i][j]);
                }
                else {
                    System.out.print(m[i][j] + "-");
                }
            }
        }
    }
    
    public static int maximomatriz(int[][] m){
        int max = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] > max) {
                    max = m[i][j];
                }
            }
        }
        return max;
    }
    
    public static void mostrardiagonal(int[][] m){
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i][i]);
        }
    }
    
    public static void mostrarcolumna(int[][] m, int col){
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i][col]);
        }
    }
    
}
