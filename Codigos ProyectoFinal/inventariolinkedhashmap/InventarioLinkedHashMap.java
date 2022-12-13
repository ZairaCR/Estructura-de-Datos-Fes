/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventariolinkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author michz
 */
public class InventarioLinkedHashMap {

    public static void main(String[] args) {
        Map<String, Long> inventario = new LinkedHashMap<>();

        System.out.println("------Lista Inventario------");
        Scanner clave = new Scanner(System.in);

        System.out.println("Ingrese el Nombre del Producto");
        String nombre = clave.nextLine();
        System.out.println("Ingrese el Numero de Unidades actuales");
        Long numero = clave.nextLong();
        inventario.put(nombre, numero);

        System.out.println("""
                           
                           1 - Ingresar un nuevo producto/ Actualizacion de canridad de un producto
                           2 - Mostrar Lista inventario
                           3 - Finalizar
                           """);
        System.out.println("Ingrese el numero de la accion que desee realizar");
        int accion = clave.nextInt();

        while (accion != 3) {

            if (accion == 1) {
                System.out.println("Ingrese el Nombre del Producto");
                clave.nextLine();
                String nombre2 = clave.nextLine();
                System.out.println("Ingrese el Numero de Unidades actuales");
                Long numero2 = clave.nextLong();

                inventario.put(nombre2, numero2);
            } else {
                if (accion == 2) {
                    System.out.println(inventario);

                } else {
                    accion = 3;
                }
            }
            System.out.println("""
                               
                           1 - Ingresar un nuevo producto/ Actualizacion de canridad de un producto
                           2 - Mostrar Lista inventario
                           3 - Finalizar""");
            System.out.println("Ingrese el numero de la accion que desee realizar");
            accion = clave.nextInt();
        }
    }

}
