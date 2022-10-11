/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd_listas;

/**
 *
 * @author michz
 */
public class ListaSimplemente_Ligada<T> {
    
    private Nodo<T> head;
    
    public ListaSimplemente_Ligada(){
      head = null;
    }
    public boolean esta_vacia(){
         return head == null;
    }
    
    public int get_tamanio(){
        int tamanio = 0;
        Nodo<T> aux = head;
        
        while(aux != null){
            aux = aux.getSiguiente();
            tamanio++;
        }
        return tamanio;
       
    }
    
    public void agregar_al_final (T valor){
        
        if (esta_vacia()) {
            Nodo <T> nuevoNodo = new Nodo<> (valor);
            head = nuevoNodo;
            return;           
        }
        
        Nodo<T> aux = head;
        while(aux.getSiguiente() != null){
            aux = aux.getSiguiente();            
        }
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        aux.setSiguiente(nuevoNodo);        
    }
    
    public void agregar_al_inicio (T valor){
        
        Nodo<T> nuevo = new Nodo<>(valor, head);
        head = nuevo;
                
    }
    
    public void agregar_despues_de (T referencia, T valor){
        
        Nodo<T> aux = head;
        while(aux.getDato() != referencia){
            aux = aux.getSiguiente();
        }
        Nodo<T> nuevo = new Nodo<>(valor, aux.getSiguiente());
        aux.setSiguiente(nuevo);
        
    }
    
    public void eliminar(int posicion){
         if(posicion < 0 || (this.get_tamanio() <= posicion || esta_vacia())) {
             
         }
          if(posicion == 0) {
            eliminar_primero();
            return;
        }

        int auxPosicion = 0;
        Nodo<T> NodoPre = null;
        Nodo<T> aux = head;

        while(aux.getSiguiente() != null && auxPosicion < posicion){
            NodoPre = aux;
            aux = aux.getSiguiente();
            auxPosicion++;
        }
        NodoPre.setSiguiente(aux.getSiguiente());
    }

    public void eliminar_primero() {
        if(esta_vacia()) return;
        head = head.getSiguiente();
    }
    
    public void eliminar_final() {
        if(esta_vacia()) return;
        if(get_tamanio() == 1) {
            eliminar_primero();
            return;
        }
        Nodo<T> nodoPre = null;
        Nodo<T> aux = head;
        while(aux.getSiguiente() != null){
            nodoPre = aux;
            aux = aux.getSiguiente();
        }
        nodoPre.setSiguiente(null);
    }
    
     public int buscar(T valor) {
        int posicion = 0;
        Nodo<T> aux = head;
        while(aux != null){
            if(aux.getDato() == valor) {
                return posicion;
            }
            aux = aux.getSiguiente();
            posicion++;
        }
        return -1;
    }
     
    public void actualizar(T a_buscar, T valor){
        if(buscar(a_buscar) < 0) return;

        Nodo<T> aux = head;
        while(aux != null && aux.getDato() != a_buscar){
            aux = aux.getSiguiente();
        }
        if(aux.getDato() != a_buscar) return;
        aux.setDato(valor);
    }

    /*@Override
    public String toString() {
        return "ListaSimplemente_Ligada{" + "head=" + head + '}';
    }*/
    
      @Override
    public String toString() {
        String ListaSimplemente_Ligada = "";
        Nodo<T> aux = head;
        while(aux != null){
            ListaSimplemente_Ligada += aux;
            aux = aux.getSiguiente();
        }
        return ListaSimplemente_Ligada;
    }
       
}
