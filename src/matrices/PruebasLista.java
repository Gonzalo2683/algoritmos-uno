/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author alumnoFI
 */
public class PruebasLista {
    
    public static void main(String[] args) {
        
        Lista lista = new Lista();
        NodoLista nd = new NodoLista(3);
        NodoLista nd2 = new NodoLista(5);
        NodoLista nd3 = new NodoLista(7);
        NodoLista nd4 = new NodoLista(9);
              
        lista.agregarFinal(nd);
        lista.agregarFinal(nd2);
        lista.agregarFinal(nd3);
        lista.agregarFinal(nd4);
        
        lista.borrar(9);
        lista.mostrar();
    }
    
}
