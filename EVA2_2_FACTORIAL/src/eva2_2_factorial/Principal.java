package eva2_2_factorial;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Ingresa numero para factorial: ");
        int p = a.nextInt();
        System.out.println("Factorial de "+p+" = "+calculaFactorial(p));
    }

    public static int calculaFactorial(int iVal) {
        System.out.println("Inicio "+iVal);
        if (iVal == 0) {
            System.out.println("Fin");
            return 1;
        } else {
            return iVal * calculaFactorial(iVal - 1);
        }
    }

}
