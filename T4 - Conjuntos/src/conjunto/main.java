/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conjunto;

/**
 *
 * @author michz
 */
public class main {
     public static void main(String[] args) {
         
         Conjunto<Integer> Conjunto1 = new Conjunto();
         Conjunto<Integer> Conjunto2 = new Conjunto();
         
         Conjunto1.agregar(18);
         Conjunto1.agregar(20);
         Conjunto1.agregar(14);
         Conjunto1.agregar(13);
         Conjunto1.agregar(7);
         Conjunto1.agregar(3);
         Conjunto1.agregar(4);
         Conjunto1.agregar(9);
         Conjunto1.agregar(16);
         Conjunto1.agregar(11);
         Conjunto2.agregar(4);
         Conjunto2.agregar(16);
         Conjunto2.agregar(8);
         Conjunto2.agregar(5);
         Conjunto2.agregar(10);
         Conjunto2.agregar(19);
         Conjunto2.agregar(13);
         Conjunto2.agregar(9);
         Conjunto2.agregar(11);
         Conjunto2.agregar(20);
         Conjunto2.agregar(12);
         
         System.out.println(Conjunto1);
         System.out.println(Conjunto2);
         
         System.out.println("\nLa longitud del conjunto 1 es " + Conjunto1.longitud());
         
         System.out.println("La longitud del conjunto 2 es " + Conjunto2.longitud());
         
         System.out.println("\n ***Eliminar elemento***");
         Conjunto2.eliminar(12);
         System.out.println(Conjunto2);
         
         System.out.println("\nConjunto1 == Conjunto2?   " + Conjunto1.equals(Conjunto2) );
         
         System.out.println("\nConjunto1 es SubConjunto de Conjunto2?  " + Conjunto2.esSubConjunto(Conjunto1));
         
         
         
        Conjunto<Integer> conjunto_interseccion = Conjunto1.intersection(Conjunto2);
        System.out.println("\nInterseccion entre Conjunto1 y Conjunto2:  " + conjunto_interseccion);
        
        Conjunto<Integer> conjunto_diferencia = Conjunto1.difference(Conjunto2);
        System.out.println("\nDiferencia entre Conjunto1 y Conjunto2:  " + conjunto_diferencia);
        
       Conjunto1.union(Conjunto2);
        System.out.println("\nConjunto1 u Conjunto2: " + Conjunto1);
        
     
        
        
         
         
    
}
    
}
   
