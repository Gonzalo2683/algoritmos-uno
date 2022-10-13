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
        
        //lista.borrar(9);
        
        System.out.print("Largo de la lista: " + lista.cantElementos());
        
        
        // Obtener elemento.
        NodoLista obtenido = lista.obtenerElemento(nd3);
        //System.out.println("Original: " + nd3.getDato());
        //System.out.println("Encontrado: " + obtenido.getDato());
        
        // Borrar nodo lista.
        lista.borrarElemento(nd4);
        
        lista.mostrar();
    }
    
}
