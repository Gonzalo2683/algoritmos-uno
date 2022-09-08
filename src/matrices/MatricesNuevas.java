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
            {1, 5, 8, 10},
            {4, 2, 6, 20},
            {7, 3, 9, 30},
            {11,12,13,40}
        };
        
        // mostrarMatriz(m);
        // System.out.print(maximomatriz(m));
        // mostrardiagonal(m);
        // System.out.print(maximomatriz(m));
        // mostrarcolumna(m, 0);
        // mostrarmatrizcomovectorDos(m);
        BubbleSortMatriz(m);
        mostrarMatriz(m);
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
            System.out.println("");
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
    
    public static void mostrarmatrizcomovector(int[][] m) {
        int i = 0;
        int j = 0;
        while (i < m.length) {            
            System.out.print(m[i][j] + "-");
            if (j == m[0].length -1){
                j = 0;
                i++;
            }
            else {
                j++;
            }
        }
    }
    
    public static void mostrarmatrizcomovectorDos(int[][] m) {
        int x = 0;
        int largo = m.length * m[0].length;
        
        while(x < largo) {
            int fila = x/m[0].length;
            int col = x % m[0].length;
            System.out.print(m[fila][col]);
            x++;
        }
        
    }
    
    public static int getM(int[][]m, int x){
        return m[x/m[0].length][x%m[0].length];
    }
    
    public static void putM(int[][]m, int x, int valor){
        m[x/m[0].length][x%m[0].length] = valor;
    }
    
    public static void BubbleSortMatriz(int[][]m){
        int largo = m.length * m[0].length;
        int ultimo = largo - 1;
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ultimo; j++) {
                if(getM(m,j) > getM(m, j+1)){
                    int aux = getM(m, j+1);
                    putM(m, j+1, getM(m,j));
                    putM(m,j,aux);
                }
            }
            ultimo--;
        }
    }
    
}
