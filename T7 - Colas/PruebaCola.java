/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd_listas;

/**
 *
 * @author michz
 */
public class PruebaCola {
    
    public static void main(String[] args) {
        
        Colas<String> FilaGames = new Colas<>();
        
        //isEmpy
        System.out.println("\n-------isEmpy()-------");
        System.out.println(FilaGames.isEmpy());  
        
        //lenght()
        System.out.println("\n-------length()-------");
        System.out.println(FilaGames.length());
        
        //enqueue( elem )
        System.out.println("\n-------enqueue()-------");
        FilaGames.enqueue("Final Fantasy");
        FilaGames.enqueue("Halo");
        FilaGames.enqueue("Zelda");
        FilaGames.enqueue("Rocket League");
        FilaGames.enqueue("Kirby");
        FilaGames.enqueue("Pokemon");
        
        System.out.println(FilaGames);
        
        //dequeue
        FilaGames.dequeue();
        
        //toString
        System.out.println("\n-------toString-------");
        System.out.println(FilaGames);
        
      
    }
    
}
