/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjunto;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author michz
 */
public class Conjunto<T> implements Iterable<T> {
    
    ArrayList<T> dato = new ArrayList<>();
    
    public int longitud(){
        return dato.size();
    }
    
    public boolean contiene(T elemento){
        return dato.indexOf(elemento) != -1;
    }
    
    public void agregar(T elemento){
        if(!contiene(elemento)){
            dato.add(elemento);
        }
    }
    
    public void eliminar(T elemento){
        dato.remove(elemento);     
    }
    
    public boolean equals(Conjunto<T> OtroConjunto){
        if(longitud() != OtroConjunto.longitud()) {
             return false;
        }
           
        for (int i = 0; i < longitud(); i++) {
            if(!OtroConjunto.contiene(dato.get(i))){
                   return false;
            }            
        }
        return true;  
    }
    
    public boolean esSubConjunto(Conjunto<T> OtroConjunto){
        if (longitud() > OtroConjunto.longitud()) {
            return false;           
        }
        
        for (int i = 0; i < longitud(); i++) {
            if(!OtroConjunto.contiene(dato.get(i))){
                   return false;
            } 
        }
          return true;
    }
    
    public void union(Conjunto<T> OtroConjunto) {
        for(int i = 0; i < OtroConjunto.longitud(); i++) {
            agregar(OtroConjunto.dato.get(i));
        }
    }

    public Conjunto<T> intersection(Conjunto<T> OtroConjunto) {
        Conjunto<T> ConInter = new Conjunto();
        for(int i = 0; i < longitud(); i++) {
            if(OtroConjunto.contiene(dato.get(i))) {
                ConInter.agregar(dato.get(i));
            }
        }
        return ConInter;
    }

    public Conjunto<T> difference(Conjunto<T> OtroConjunto) {
         Conjunto<T> ConDife = new Conjunto();
        for(int i = 0; i < longitud(); i++) {
            if(!OtroConjunto.contiene(dato.get(i))) {
                ConDife.agregar(dato.get(i));
            }
        }
        for(int i = 0; i < OtroConjunto.longitud(); i++) {
            if(!contiene(OtroConjunto.dato.get(i))) {
                ConDife.agregar(OtroConjunto.dato.get(i));
            }
        }
        return ConDife;
    }

    @Override
    public String toString() {
        return "Conjunto{" + "dato = " + dato + '}';
    }
    
    

   @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < dato.size();
            }

            @Override
            public T next() {
                return dato.get(index++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    
    
    
       
        
    
    
    
   
    
}

  
    
