/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd_listas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michz
 */
public class PruebaColaPrioridadAcotada {

    public static void main(String[] args) {

        BoundedPriorityQueue<String> Barco = new BoundedPriorityQueue<String>(5);

        //isEmpy
        System.out.println("\n-------isEmpy()-------");
        System.out.println(Barco.is_empty());

        //lenght()
        System.out.println("\n-------length()-------");
        System.out.println(Barco.length());

        //enqueue( elem )
        System.out.println("\n-------enqueue()-------");
        try {
            Barco.enqueue(2, "niños");
            Barco.enqueue(1, "niñas");
            Barco.enqueue(3, "Mujeres");
            Barco.enqueue(3, "Hombre");
            Barco.enqueue(4, "Capitan");
        } catch (Exception ex) {
            Logger.getLogger(PruebaColaPrioridadAcotada.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("\n-------toString-------");

        System.out.println(Barco);

    }

}
