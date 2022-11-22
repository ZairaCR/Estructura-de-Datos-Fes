/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd_listas;

/**
 *
 * @author michz
 */
public class Colas<T> {

    private Nodo<T> Final, inicio;
    private int tamano;

    public Colas() {

        inicio = Final = null;
        this.tamano = 0;

    }

    public boolean isEmpy() {
        return inicio == null;

    }

    public int length() {

        return this.tamano;
    }

    public void enqueue(T ele) {
        Nodo<T> aux = new Nodo<>(ele);
        if (isEmpy() == true) {
            inicio = aux;
            tamano++;
        } else {
            Final.setSiguiente(aux);
            tamano++;
        }
        Final = aux;
    }

    public void dequeue() {

        inicio = inicio.getSiguiente();
        tamano--;

    }

    public String toString() {
        if (isEmpy()) {
            return "La pila esta vacia";

        } else {
            String Impre = "";
            Nodo<T> aux = inicio;
            while (aux != null) {
                Impre = Impre + aux.toString() + "\n";
                aux = aux.getSiguiente();
            }

            return Impre;
        }

    }

}
