/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd_listas;

/**
 *
 * @author michz
 */
public class PruebasNodo {
    
    public static void main (String[] args){
        Nodo<Integer> head = new Nodo(10);
        head.setSiguiente(new Nodo(20, null));
        head.getSiguiente().setSiguiente(new Nodo(30));
        System.out.println(head.getSiguiente().getSiguiente().getDato());
        
        head.getSiguiente().getSiguiente().setSiguiente(new Nodo(5,new Nodo(6)));
        Nodo<Integer> aux = head;
        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(new Nodo(7));
        
        aux = head;
        System.out.println("Transversal...");
        while (aux != null) {
            System.out.print(aux);
            aux = aux.getSiguiente();
        }
        
    
        
    }
    
}
