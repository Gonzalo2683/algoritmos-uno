/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

/**
 *
 * @author alumnoFI
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] v = {30,2,45,14,3,4,5,6,7,10,9};
        int[] v2 = new int[8];
        
        //SELECTIONSORT(v);
        //mostrar(v);
        
        // MERGE
        int[] v1 = {1,3,5,7,15,25};
        int[] v22 = {2,8,35,50};
        int[] vr = new int[v1.length + v22.length];
        //vr = MERGE(v1,v22);
        // mostrar(vr);
        
        //int bus = BPUNTOMEDIO(v1, 3);
        //System.out.println(bus);
        
        NUEVO2(v);
        mostrar(v);
    }
   
    public static void mostrar(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
    
    // ordenamiento selection
    public static void SELECTIONSORT(int[]v) {        
        for (int i = 0; i < v.length; i++) {
            int posMin = i;
            int min = v[i];
            
            for (int j = i; j < v.length; j++) {
                if (v[j] < min){
                    min = v[j];
                    posMin = j;
                }
            }
            
            int aux = v[i];
            v[i] = v[posMin];
            v[posMin] = aux;
        }
    }
    
    // ordenamiento burbuja
    public static void BURBUJA(int[]v){
        int ultimo = v.length - 1;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < ultimo; j++) {
                if (v[j] > v[j+1]){
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
            ultimo--;
        }
    }
    
    // ordenamiento inserccion
    public static void INSERTION(int[]v){
        for (int i = 0; i < v.length; i++) {
            int j = i;
            
            while (j > 0 && v[j] < v[j-1]) {                
                int aux = v[j];
                v[j] = v[j-1];
                v[j-1] = aux;
                j--;
            }
        }
    }

    public static int[] MERGE(int[] v1, int[] v2) {
        int i_1 = 0;
        int i_2 = 0;
        int i_r = 0;
        int [] vr = new int[v1.length + v2.length];
        
        while (i_1 < v1.length && i_2 < v2.length) {            
            if(v1[i_1] < v2[i_2]){
                vr[i_r] = v1[i_1];
                i_1++;
                i_r++;
            }
            else {
                vr[i_r] = v2[i_2];
                i_2++;
                i_r++;
            }
        }
        
        while(i_1 < v1.length){
            vr[i_r] = v1[i_1];
            i_1++;
            i_r++;
        }
        
        while(i_2 < v2.length){
            vr[i_r] = v2[i_2];
            i_2++;
            i_r++;
        }
        
        return vr;
        
    }
    
    
    // busqueda punto medio
    public static int BPUNTOMEDIO(int[]v, int buscado){
        int izquierda = 0;
        int derecha = v.length - 1;
        
        while(izquierda <= derecha){
            int ptomedio = (izquierda+derecha)/2;
            int valorPtoMedio = v[ptomedio];
            
            if (buscado == valorPtoMedio) {
                return ptomedio;
            }
            
            if (buscado < valorPtoMedio) {
                derecha = ptomedio;
            }
            else {
                izquierda = ptomedio;
            }
        }
        
        return -1;
    }
    
        
    public static void NUEVO2(int[]v){
        int posmin = 0;
        int posmax = 0;
        int min = v[0];
        int max = v[0];
        
        
        for (int i = 0, j = v.length; i < j; i++, j--) {
            for (int k = 0; k < j; k++) {
                if (v[k] < min) {
                    min = v[k];
                    posmin = k;
                }
                
                if (v[k] > max){
                    max = v[k];
                    posmax = k;
                }
            }
            
            int aux = v[i];
            v[i] = v[posmin];
            v[posmin] = aux;
            
            if (v[posmin] == max) {
                aux = v[j];
                v[j] = max;
                v[posmin] = aux;
                
            }
            
            aux = v[j];
            v[j] = max;
            v[posmax] = aux;
        }
    }
    
}
