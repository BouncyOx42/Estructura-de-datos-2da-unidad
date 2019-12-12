package eva2_8_lista_simple;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Lista {

    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        this.inicio = null;
        this.fin = null;
    }

    //devuelve true si la lista esta vacia
    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(Nodo nuevo) {
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public void addBegin(Nodo nuevo) {
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void insertAt(int pos, Nodo nuevo) throws Exception {
        int iTama = size();
        if ((pos < 0) || (pos >= iTama)) {
            throw new Exception("La posición es inválida");
        } else {
            if (pos == 0) {
                addBegin(nuevo);
            } else {
                int iCont = 0;
                Nodo temp = inicio;
                while (iCont < (pos - 1)) {
                    temp = temp.getSiguiente();
                    iCont++;
                }
                nuevo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevo);
            }
        }
    }

    public void Clear() {
        inicio = null;
        fin = null;
    }

    public void deleteAt(int pos) throws Exception {
        if (isEmpty()) {
            throw new Exception("La lista está vacia");
        }
        int iTama = size();
        if ((pos < 0) || (pos >= iTama)) {
            throw new Exception("La posición es inválida");
        }
        if (iTama == 1) {//solo hay un nodo
            Clear();
        } else {//muchos nodos
            if (pos == 0) {//Borrar el primer nodo
                inicio = inicio.getSiguiente();
            } else {
                int iCont = 0;
                Nodo temp = inicio;
                while (iCont < (pos - 1)) {
                    temp = temp.getSiguiente();
                    iCont++;
                }
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                if (pos == (iTama - 1)) {
                    fin = temp;
                }
            }
        }
    }

    public int getAt(int pos) {
        int iCont = 0;
        Nodo temp = inicio;
        while (iCont < pos) {
            temp = temp.getSiguiente();
            iCont++;
        }
        return temp.getValor();
    }

    public void print() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.print(temp.getValor() + " - ");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }

    public int size() {
        int iCont = 0;
        Nodo temp = inicio;
        while (temp != null) {
            iCont++;
            temp = temp.getSiguiente();
        }
        return iCont;
    }
}
