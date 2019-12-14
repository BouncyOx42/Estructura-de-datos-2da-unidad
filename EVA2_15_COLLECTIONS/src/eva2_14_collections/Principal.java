package eva2_14_collections;

import java.util.LinkedList;

public class Principal {

    public static void main(String[] args) {
        LinkedList<String> iListaEnla = new LinkedList();
        iListaEnla.add("Hola");
        iListaEnla.add("mundo");
        iListaEnla.add("ya");
        iListaEnla.add("no");
        iListaEnla.add("quiero");
        iListaEnla.add("estudiar");
        iListaEnla.add("me quiero");
        iListaEnla.add("morir");
        iListaEnla.add("ya");
        iListaEnla.add("!!!!");
        iListaEnla.addFirst("");
        for (String string : iListaEnla){
            System.out.print(string + " - ");
        }
        System.out.println("");
        System.out.println("Cantidad de elementos " + iListaEnla.size());
        iListaEnla.remove(3);
        
        System.out.println(iListaEnla);
    }
}
