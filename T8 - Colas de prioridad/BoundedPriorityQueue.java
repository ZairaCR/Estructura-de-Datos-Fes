/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd_listas;

import java.util.Arrays;

/**
 *
 * @author michz
 */
public class BoundedPriorityQueue<T> {

    private Colas<T>[] data;
    private int tamanio;

    public BoundedPriorityQueue(int niveles) {
        data = new Colas[niveles];
        tamanio = 0;

    }

    public boolean is_empty() {
        if (tamanio == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int length() {
        return tamanio;
    }
    
    public int lengthCola(){
        return data.length;
    }

    public void enqueue(int priority, T elem) throws Exception  {

        if (priority < 0 || priority >= data.length) {
            throw new Exception("Prioridad fuera de los limites");
        }
        if (data[priority] == null) {
            data[priority] = new Colas<T>();

        } else {
            data[priority].enqueue(elem);
            tamanio++;
        }
    }

    public void dequeue() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null && !data[i].isEmpy()) {
                data[i].dequeue();
            }
        }
    }

        public String toString() {

        String Impre = "";
        for (int i = 0; i < data.length; i++) {
            Impre += i + ": ";
            if (data[i] != null && !data[i].isEmpy()) {
                Impre += data[i] + "\n";
            } else {
                Impre += "null\n";
            }
        }
        return Impre;
    }
}
