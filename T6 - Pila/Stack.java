/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd_listas;

/**
 *
 * @author michz
 */
public class Stack<T> {

    private Nodo<T> peek;

    private int top;

    public Stack() {
        peek = null;
        this.top = 0;

    }

    /*public Stack(int length) {
        this.length = length;

    }*/
    public boolean isEmpy() {
        return peek == null;

    }

    public int length() {
        return this.top;

    }

    public T pop() {
        if (isEmpy() == true) {
            return null;
        } else {
            T element = peek.getDato();
            peek = peek.getSiguiente();
            this.top--;
            return element;
        }
    }

    public void push(T valor) {
        Nodo<T> aux = new Nodo<>(valor, peek);
        peek = aux;
        this.top++;

    }

    public T peek() {
        return peek.getDato();
    }

    /*public String toString() {
        if (isEmpy()) {
            return "La pila esta vacia";

        } else {
            String Impre = "";
            Nodo<T> aux = peek;
            while (aux != null) {
                Impre += aux.toString();
                aux = aux.getSiguiente();
            }

            return Impre;
        }

    }*/
    @Override
    public String toString() {
        if (isEmpy()) {
            return "La pila esta vacia";

        } else {
            String Impre = "";
            Nodo<T> aux = peek;
            while (aux != null) {
                Impre += aux.toString() + "\n";
                aux = aux.getSiguiente();
            }

            return Impre;
        }

    }
}
