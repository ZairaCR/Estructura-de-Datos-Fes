/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd_listas;

/**
 *
 * @author michz
 */
public class PruebasPila {

    public static void main(String[] args) {

        Stack<String> PilaNom = new Stack<>();

        // isEmpy
        System.out.println("\n-------isEmpy?-------");
        System.out.println(PilaNom.isEmpy());

        // length
        System.out.println("\n-------lengt-------");
        System.out.println("lengt : " + PilaNom.length());

        // push( value )

        PilaNom.push("Alison");
        PilaNom.toString();
        PilaNom.push("Katia");
        PilaNom.toString();
        PilaNom.push("Michelle");
        PilaNom.toString();
        PilaNom.push("Dana");
        PilaNom.toString();
        PilaNom.push("Paola");
        PilaNom.toString();

        // peek()
        System.out.println("\n-------Metodo peek()-------");
        System.out.println(PilaNom.peek());
        
        // pop()
        System.out.println("\n-------Metodo pop()-------");
        System.out.println(PilaNom.pop());

        // ToString
        System.out.println("\n-------toString-------");
        System.out.println(PilaNom);
        System.out.println(PilaNom.isEmpy());

    }

}
