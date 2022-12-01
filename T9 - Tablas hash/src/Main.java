/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author michz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         HashTable<String, String> Directorio = new HashTable<>(5);
        Directorio.add("Zaira", "Natacion");
        Directorio.add("Luis", "Guitarra");
        Directorio.add("Michelle", "Futbol");
        Directorio.add("Katia", "Danza");

        System.out.println(Directorio.valueOf("Zaira"));
        System.out.println(Directorio.valueOf("Luis"));
        System.out.println(Directorio.valueOf("Katia"));

        Directorio.remove("Katia");
        System.out.println(Directorio.valueOf("Katia"));

        Directorio.add("Selene", "Tejer");
        System.out.println(Directorio.valueOf("Selene"));
    }
    
}
