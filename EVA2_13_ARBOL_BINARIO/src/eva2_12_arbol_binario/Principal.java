package eva2_12_arbol_binario;

public class Principal {

    public static void main(String[] args) {
        Arbol miArbol = new Arbol();
        miArbol.agregarNodo(new Nodo (13));
        miArbol.agregarNodo(new Nodo (10));
        miArbol.agregarNodo(new Nodo (18));
        miArbol.agregarNodo(new Nodo (2));
        miArbol.agregarNodo(new Nodo (11));
        miArbol.agregarNodo(new Nodo (17));
        miArbol.agregarNodo(new Nodo (20));
        
        miArbol.imprimePostOrder();
        System.out.println("");
        
        miArbol.imprimePreOrder();
        System.out.println("");
        
        miArbol.imprimeInOrder();
    }

}
