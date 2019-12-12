package eva2_8_lista_simple;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {

        Lista miLista = new Lista();
        miLista.add(new Nodo(4));//1
        miLista.add(new Nodo(100));//2
        miLista.add(new Nodo(15));//3
        miLista.add(new Nodo(32));//4
        miLista.add(new Nodo(65));//5
        miLista.addBegin(new Nodo(9999));//0
        miLista.print();
        try {
            miLista.insertAt(2, new Nodo(5555));
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.print();
        try {
            miLista.deleteAt(0);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.print();
        miLista.add(new Nodo(200));
        miLista.print();
        try {
            miLista.deleteAt(6);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.print();
        miLista.add(new Nodo(26));
        miLista.print();
        System.out.println("El valor en la posicion #3 es "+miLista.getAt(3));

    }

}
