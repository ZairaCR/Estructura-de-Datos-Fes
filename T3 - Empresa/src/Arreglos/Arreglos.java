package Arreglos;


import java.util.Arrays;

/**
 *
 * @author michz
 */
public class Arreglos<T> implements Iterable<T> {
    private T[] data;
    private int tamanio;

    public Arreglos(int tamanio) {
        this.tamanio = tamanio;
        data = (T[]) new Object[tamanio];
    }
    
    public int getLongitud() {
        return this.tamanio;
    }
    
    public void setElemento(int indice, T valor) throws ArrayIndexOutOfBoundsException {
        
        data[indice] = valor;
    }

    public T getElemento(int indice) throws ArrayIndexOutOfBoundsException {
        if(indice >= this.tamanio || indice < 0) {
            throw new ArrayIndexOutOfBoundsException("Indice invalido");
        }
        return data[indice];
    }

    public void clear(T valor) {
        for(int i = 0; i < tamanio; i++) {
            data[i] = valor;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < tamanio;
            }

            @Override
            public T next() {
                return data[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}

