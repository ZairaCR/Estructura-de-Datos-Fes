/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package directoriohashmap;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author michz
 */
public class DirectorioHashMap {

    public static void main(String[] args) {
        HashMap<Long, String> direc = new HashMap<>();

        System.out.println("------Directorio------");
        Scanner clave = new Scanner(System.in);

        System.out.println("Ingrese el Nombre del contacto a registrar");
        String nombre = clave.nextLine();
        System.out.println("Ingrese el Numero a registrar");
        Long numero = clave.nextLong();
        direc.put(numero, nombre);

        System.out.println("""
                           
                           1 - Ingresar un nuevo numero
                           2 - Mostrar Contactos
                           3 - Finalizar
                           """);
        System.out.println("Ingrese el numero de la accion que desee realizar");
        int accion = clave.nextInt();

        while (accion != 3) {

            if (accion == 1) {
                System.out.println("Ingrese el Nombre del contacto a registrar");
                clave.nextLine();
                String nombre2 = clave.nextLine();
                System.out.println("Ingrese el Numero a registrar");
                Long numero2 = clave.nextLong();

                direc.put(numero2, nombre2);
            } else {
                if (accion == 2) {
                    System.out.println(direc);

                } else {
                    accion = 3;
                }
            }
            System.out.println("""
                               
                           1 - Ingresar un nuevo numero
                           2 - Mostrar Contactos
                           3 - Finalizar""");
            System.out.println("Ingrese el numero de la accion que desee realizar");
            accion = clave.nextInt();
        }
    }
}
