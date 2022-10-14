/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.arreglos;
import java.util.Arrays;

/**
 *
 * @author michz
 */
public class ClaseArreglos {
    
    int tamanio;
    Object Arreglo[];
    
    public ClaseArreglos(int Numero){
        tamanio =  Numero;
        Arreglo = new Object[Numero];
    }
    
    public int getLongitud(){
        return tamanio;
    }
    
    public void setElemento(int indice, Object objs){
        Arreglo[indice]=objs;
    }
    
    public Object getElemento(int indice){
        return Arreglo[indice];
    }
    
    public void limpiar(Object objs){
        for (int i = 0; i < Arreglo.length; i++) {
            Arreglo[i]=objs;
        }
    }

    @Override
    public String toString() {
        return "ClaseArreglos{" + "tamanio=" + tamanio + ", Arreglo=" + Arreglo + '}';
    }

    

    
}
    

