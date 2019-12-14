package eva2_12_arbol_binario;

public class Arbol {

    private Nodo root;

    public Arbol() {
        root = null;
    }

    public void agregarNodo(Nodo nuevo) {
        agregarNodoRec(root, nuevo);
    }

    private void agregarNodoRec(Nodo actual, Nodo nuevo) {
        if (root == null) { //Arbol vacio
            root = nuevo;
        } else {
            if (nuevo.getValor() > actual.getValor()) {//Mayor --> Derecha
                if (actual.getDerecha() == null) {//Vacio, hay espacio
                    actual.setDerecha(nuevo);
                } else {//Ya hay un nodo
                    agregarNodoRec(actual.getDerecha(), nuevo);
                }
            } else if (nuevo.getValor() < actual.getValor()) {//Menos --> Izquierda
                if (actual.getIzquierda() == null) {//Vacio, hay espacio
                    actual.setIzquierda(nuevo);
                } else {//Ya hay un nodo
                    agregarNodoRec(actual.getIzquierda(), nuevo);
                }
            } else {// El valor ya existe
                System.out.println("ya existe el valor " + nuevo.getValor());
            }
        }
    }

    public void imprimePostOrder() {
        postOrder(root);
    }

    private void postOrder(Nodo actual) {
        if (actual != null) {
            //Leer izq
            postOrder(actual.getIzquierda());
            //Leer der
            postOrder(actual.getDerecha());
            //Imprimir
            System.out.print(actual.getValor() + " - ");
        }
    }
    public void imprimeInOrder() {
        InOrder(root);
    }

    private void InOrder(Nodo actual) {
        if (actual != null) {
            InOrder(actual.getIzquierda());
            System.out.print(actual.getValor() + " - ");
            InOrder(actual.getDerecha());
        }
    }
    
    public void imprimePreOrder(){
        preOrder(root);
    }
    
    private void preOrder(Nodo actual){
        if (actual != null) {
            System.out.print(actual.getValor() + " - ");
            preOrder(actual.getIzquierda());
            preOrder(actual.getDerecha());
        }
    }
}
