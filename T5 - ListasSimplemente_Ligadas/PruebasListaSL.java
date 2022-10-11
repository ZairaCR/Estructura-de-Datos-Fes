/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd_listas;

/**
 *
 * @author michz
 */
public class PruebasListaSL {
     public static void main (String[] args){
          ListaSimplemente_Ligada<Integer> lista = new ListaSimplemente_Ligada<>();
        

        // Esta_vacia
        System.out.println("\n Esta vacia?");
        System.out.println(lista.esta_vacia());

        // get_tamanio
        System.out.println("\nTamaño de la listas");
        System.out.println(lista.get_tamanio());
        
        //agregar_al_final
        System.out.println("\nAgregar al final 10 ");
        lista.agregar_al_final(10);
        System.out.println(lista);
        System.out.println("Agrega al final 5");
        lista.agregar_al_final(5);
        System.out.println(lista);
        System.out.println("Agrega al final 2");
        lista.agregar_al_final(2);
        System.out.println(lista);
        

        // Agregar_al_inicio
        System.out.println("\nAgrega 15 al inicio");
        lista.agregar_al_inicio(15);
        System.out.println(lista);
        System.out.println("Agrega 20 al inicio");
        lista.agregar_al_inicio(20);
        System.out.println(lista);
        System.out.println("Agrega 25 al inicio");
        lista.agregar_al_inicio(25);
        System.out.println(lista);
        
        // agregar_despues_de
        System.out.println("\n Agregar despues de 5, un 4");
        lista.agregar_despues_de(5, 4);
        System.out.println(lista);
        
        //eliminar
        System.out.println("\n Eliminar posicion 4");
        lista.eliminar(4);
        System.out.println(lista);
        
        //eliminar_primero
        System.out.println("\n Eliminar primer elemento de la lista");
        lista.eliminar_primero();
        System.out.println(lista);
        
        //eliminar_final
        System.out.println("\n Eliminar elemento final de la lista");
        lista.eliminar_final();
        System.out.println(lista);
        
        //buscar_valor
        System.out.println("\nBuscar 10 en la lista");
        System.out.println("Posicion de 10: "+lista.buscar(10));
        
        //actualizar
        System.out.println("\nActualizar numero 4, por 5");
        lista.actualizar(4, 5);
        System.out.println(lista);
                
        
        
     }
}
