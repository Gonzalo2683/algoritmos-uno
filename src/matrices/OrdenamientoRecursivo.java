/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author alumnoFI
 */
public class OrdenamientoRecursivo {
    
    public static void main(String[] args) {
        
        int v[] = {2,3,1,4,5};
        
        System.out.println("-------------------");
        System.out.println("El maximo: " + posMaxVector(v, 0, 0));
        System.out.println("El maximo inv: " + posMaxVectorInverso(v, v.length - 1, v.length -1));
        
        System.out.println("-------------------");
        int com4[] = {1,3,5,7,9,11,13,15};
        
        System.out.println("-------------------");
        // System.out.println(b(0,7,13,com4));
        
        System.out.println("-------------------");
        System.out.println(bOrdenado(0,7,13,com4));
        
        
    }
    
    public static int posMaxVector(int[] v, int pos, int posmax) {
        if(pos > v.length - 1){
            return posmax;
        }
               
        if(v[pos] > v[posmax]) {
            posmax = pos;
        }
        
        return posMaxVector(v, pos + 1, posmax);
    }
    
    public static int posMaxVectorInverso(int[] v, int pos, int posmax) {
        if(pos < 0){
            return posmax;
        }
        
        if(v[pos] > v[posmax]) {
            posmax = pos;
        }
        
        return posMaxVectorInverso(v, pos - 1, posmax);
    }
    
    public static void SelectionSortRecursivo(int v[]){
        int pos = v[v.length - 1];
        int posmax = v[v.length - 1];
        
        //posMaxVectorInverso(v, pos - 1);
    }
    
    public static boolean b(int izq, int der, int x, int v[]) {
        if (izq > der) {
            return false;
        }
        else {
            int medio = (izq + der) / 2;
            if (v[medio] == x){
                return true;
            }
            else {
                return (b(izq, medio - 1, x, v)||b(medio + 1, der, x, v));
            }
        }
    }
    
    public static boolean bOrdenado(int izq, int der, int x, int v[]) {
        
        if (izq > der) {
            return false;
        }

        int medio = (izq + der) / 2;
               
        if (v[medio] == x){
            return true;
        }

        // voy por la iz
        if (x < v[medio]) {
            return bOrdenado(izq, medio - 1, x, v);
        }
        // voy por la derecha
        return bOrdenado(medio + 1, der, x, v);
        
        
    }
    
    public static void mostrar(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
    
    public static int cuentaIslas(int mapa[][], int M, int N){
        int cantidad = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int c = 0; c < mapa[0].length; c++) {
                if (mapa[i][c] < 2) {
                    cantidad = cantidad + islas(mapa, i, c);
                }
            }
        }
        return cantidad;
    }
    
    public static int islas(int mapa[][], int i, int c){
        return 1;
    }
    
}
