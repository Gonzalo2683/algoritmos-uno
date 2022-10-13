/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author alumnoFI
 */
public class Lista implements ILista{
    NodoLista inicio;

    @Override
    public void Lista() {
        inicio = null;
    }

    @Override
    public void setInicio(NodoLista nodo) {
        inicio = nodo;
    }

    @Override
    public NodoLista getInicio() {
        return inicio;
    }

    @Override
    public void setFin(NodoLista f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NodoLista getFin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean esVacia() {
        return inicio == null;
    }

    @Override
    public void agregarInicio(NodoLista nodo) {
        if(esVacia()) {
            inicio = nodo;
            // fin = nodo en caso de tener un fin.
        }
        else {
            nodo.setSig(inicio);
            inicio = nodo;
        }
    }

    @Override
    public void agregarFinal(NodoLista nodo) {
        if(esVacia()) {
            inicio = nodo;
            // fin = nodo en caso de tener un fin.
        }
        else {
            NodoLista aux = inicio;
            while(aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(nodo);
        }
    }

    @Override
    public void borrarInicio() {
        if(!esVacia()) {
            inicio = inicio.getSig();
        }
    }

    @Override
    public void borrarFin() {
        if(!esVacia()) {
            if(inicio.getSig() == null) {
                borrarInicio();
            }
            else {
                NodoLista aux = inicio;
                while (aux.getSig() != null && aux.getSig().getSig() != null) {                
                    aux = aux.getSig();
                }
                aux.setSig(null);
            }
        }
    }

    @Override
    public void vaciar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrar() {
        NodoLista aux = inicio;
        System.out.println("");
        while (aux != null) {                
            System.out.println(aux.getDato());
            aux = aux.getSig();
        }
        System.out.println("");
    }

    @Override
    public void agregarOrd(NodoLista nodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borrarElemento(NodoLista nodo) {
        if (!esVacia()) {
            
            if (inicio == nodo) {
                borrarInicio();
            }
            else {
                NodoLista aux = inicio;

                while (aux.getSig() != null && aux.getSig() != nodo) {
                    aux = aux.getSig();
                } 
                
                if (aux.getSig() != null) {
                    aux.setSig(aux.getSig().getSig());
                }
            }                       
        }
    }

    @Override
    public int cantElementos() {
        int counter = 0;

        if (esVacia()) {
            return counter;
        }
        
        NodoLista aux = inicio;
        
        while (aux != null) {
            counter++;
            aux = aux.getSig();
        }
        return counter;
    }

    @Override
    public NodoLista obtenerElemento(NodoLista nodo) {
        NodoLista aux = inicio;
        
        while (aux != null) {            
            if (nodo == aux){
                return aux;
            }
            aux = aux.getSig();
        }
        return null;
    }

    @Override
    public void mostrarREC(NodoLista nodo) {
        if (nodo == null) {
            return;
        }
        
        // Si llamo primero la recursividad, muestro de forma inversa
        System.out.println(nodo.getDato());
        mostrarREC(nodo.getSig());
    }

    @Override
    public void mostrarInversoREC(NodoLista nodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean existeDatoREC(NodoLista nodo, int n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    // practico 6
    
    // ej 1
    @Override
    public boolean pertenece(int x) {
        if(esVacia()) {
            return false;
        }
        
        NodoLista aux = inicio;
        
        while (aux != null) {
            if (aux.getDato() == x) {
                return true;
            }
            aux = aux.getSig();
        }
        return false;
    }

    @Override
    public void borrar(int x) {
        if (!esVacia()) {
            
            if (inicio.getDato() == x) {
                borrarInicio();
            }
            else {
                NodoLista aux = inicio;

                while (aux.getSig() != null && aux.getSig().getDato() != x) {
                    aux = aux.getSig();
                } 
                
                if (aux.getSig() != null) {
                    aux.setSig(aux.getSig().getSig());
                }
            }                       
        }
    }
    
    // Practico_6_-_Estructuras-_Lista.pdf
    

    // Ejercicio 3
    // a)
    public boolean iguales(Lista l, Lista p) {
        if (l.esVacia() || p.esVacia()) {
            return false;
        }
        return iguales(l.inicio, p.inicio);
    }
    
    public boolean iguales(NodoLista nl, NodoLista np) {
        if (nl == null && np == null) {
            return true;
        }
        
        if (nl == null || np == null) {
            return false;
        }
        
        if (nl.getDato() != np.getDato()) {
            return false;
        }
        
        return iguales(nl.getSig(), np.getSig());
    }
    
    // b
    public Lista intercalar(Lista l, Lista p) {
        Lista nueva = new Lista();
        intercalar(l.inicio, p.inicio, nueva);
        return nueva;
    }

    /*public void intercalar(NodoLista nl, NodoLista np, Lista nueva) {
        if (nl != null && np != null) {
            if (nl.getDato() <= np.getDato()) {
                nueva.agregarFinal(nl);
                nueva.agregarFinal(np);
            }
            else {
                nueva.agregarFinal(np);
                nueva.agregarFinal(nl);
            }
            intercalar(nl.getSig(), np.getSig(), nueva);
        }
    }*/
    
    public void intercalar(NodoLista nl, NodoLista np, Lista nueva) {
        if (nl == null && np == null) {
            return;
        }
        
        if (nl != null && np == null) {
            intercalar(nl.getSig(), np, nueva);
            NodoLista nvo = new NodoLista(nl.getDato());
            nueva.agregarInicio(nvo);
            return;
        }
        
        if (nl == null && np != null) {
            intercalar(nl, np.getSig(), nueva);
            NodoLista nvo = new NodoLista(np.getDato());
            nueva.agregarInicio(nvo);
            return;
        }
        
        if (nl.getDato() <= np.getDato()) {
            intercalar(nl.getSig(), np, nueva);
            NodoLista nvo = new NodoLista(nl.getDato());
            nueva.agregarInicio(nvo);
            return;
        }
        
        if (nl.getDato() > np.getDato()) {
            intercalar(nl, np.getSig(), nueva);
            NodoLista nvo = new NodoLista(np.getDato());
            nueva.agregarInicio(nvo);
            return;
        }
        
    }
}
