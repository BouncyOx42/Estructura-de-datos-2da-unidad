package eva2_7_lista_2;

public class Principal {

    public static void main(String[] args) {

        Nodo nodo1, nodo2, nodo3;
        nodo1 = new Nodo(32);
        nodo2 = new Nodo(17);
        nodo3 = new Nodo(5);
        
        nodo1.setSiguiente(nodo2);
        nodo2.setSiguiente(nodo3);
        
        Nodo temp = nodo1;
        while(temp != null){
            System.out.print(temp.getValor()+ " - ");
            temp = temp.getSiguiente();
        }

    }

}

class Nodo {

    private int valor;
    private Nodo siguiente;

    public Nodo() {
        this.siguiente = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
