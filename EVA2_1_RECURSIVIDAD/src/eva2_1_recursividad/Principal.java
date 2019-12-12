package eva2_1_recursividad;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int Val1 = a.nextInt();
        for (int i = Val1; i >= 1; i--) {
            System.out.print(i + " - ");
        }
        System.out.println("");
        forFalso(Val1);
        System.out.println("");
        forFalso2(Val1, 1);
    }

    public static void forFalso(int Val1) {
        System.out.print(Val1 + " - ");
        if (Val1 > 1) {
            forFalso(Val1 - 1);
        }
    }
    
    public static void forFalso2 (int Val1, int inc){
        System.out.print(inc + " - ");
        if (inc < Val1) {
            forFalso2(Val1, inc+1);
        }
    }

}
