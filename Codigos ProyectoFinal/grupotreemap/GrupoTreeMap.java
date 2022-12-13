/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupotreemap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author michz
 */
public class GrupoTreeMap {

    public static void main(String[] args) {

        Map<Long, String> lista = new TreeMap<>();

        System.out.println("------Lista Alumn@s------");
        Scanner clave = new Scanner(System.in);

        System.out.println("Ingrese el Nombre del alumn@");
        String nombre = clave.nextLine();
        System.out.println("Ingrese el Numero de cuenta del alumn@");
        Long numero = clave.nextLong();
        lista.put(numero, nombre);

        System.out.println("""
                           
                           1 - Ingresar un nuevo Alumn@
                           2 - Mostrar Lista alumn@s
                           3 - Finalizar
                           """);
        System.out.println("Ingrese el numero de la accion que desee realizar");
        int accion = clave.nextInt();

        while (accion != 3) {

            if (accion == 1) {
                System.out.println("Ingrese el Nombre del alumn@");
                clave.nextLine();
                String nombre2 = clave.nextLine();
                System.out.println("Ingrese el Numero de cuenta del alumn@");
                Long numero2 = clave.nextLong();

                lista.put(numero2, nombre2);
            } else {
                if (accion == 2) {
                    System.out.println(lista);

                } else {
                    accion = 3;
                }
            }
            System.out.println("""
                               
                           1 - Ingresar un nuevo alumn@
                           2 - Mostrar Lista Alumn@s
                           3 - Finalizar""");
            System.out.println("Ingrese el numero de la accion que desee realizar");
            accion = clave.nextInt();
        }
    }
}
