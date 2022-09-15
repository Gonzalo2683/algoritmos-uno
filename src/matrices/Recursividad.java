/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author alumnoFI
 */
public class Recursividad {
    
    public static void main(String[] args) {
        // System.out.println(fact(4));
        //System.out.println(pot(2, 3));
        //System.out.println(pot(9, 2));
        //System.out.println(pot(2, 0));
        //System.out.println(pot(2, 1));
        
        // mostrar(8);
        
        // 1 2 3 4 5
       //  System.out.println(divide(8, 2));
        System.out.println(invertir(123));
    }
    
    public static int fact(int n) {
        if(n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
    
    public static int pot(int a, int b) {
        if (b == 0) {
            return 1;
        }
        
        if (b== 1) {
            return a;
        }
        
        return a * pot(a, b - 1);
    }
    
    public static void mostrar(int n) {
        if (n == 0) {
            return;
        }
        // Print antes muestra el resultado antes. 8 7 6 5 4 .... n
        // System.out.println("" + n);
        //mostrar(n - 1);
        
        // Print despues muestra el resultado en orden de la pila 1 2 3 4 .... n
        System.out.println("" + n);
    }
    
    // recursividad cruzada
    public static boolean esPar(int n) {
        if (n == 0) {
            return true;
        }
        
        if (n == 1) {
            return false;
        }
        
        return esImpar(n - 1);
    }
    
    public static boolean esImpar(int n) {
        if (n == 0) {
            return false;
        }
        
        if (n == 1) {
            return true;
        }
        
        return esPar(n - 1);
    }
    
    // fib no me sale aùn
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    
    public static int divide(int a, int b){
        if(a == b){
            return 1;
        }
                
        if (a < b) {
            return 0;
        }
                
        return divide(a - b, b) + 1;
    }
    
    public static int invertir(int n){
        
        if (n < 10) {
            return n;
        }
        
        int digitos = n;
        int orden = 1;
        
        for (int i = 1; digitos > 10; i++) {
            digitos = digitos/10;
            orden = orden * 10;
        }
        
        return (n % 10) * orden + invertir(n/10);
        
    }
}
