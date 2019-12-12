package eva2_3_gcd;

import java.util.Scanner;

public class Principa {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        System.out.println("Ingrese numero 1: ");
        int iVal1 = a.nextInt();
        System.out.println("Ingrese numero 2: ");
        int iVal2 = a.nextInt();
        
        System.out.println("El numero maximo divisor es: "+gcd(iVal1,iVal2));
        
    }

    public static int gcd(int iVal1, int iVal2) {
        if (iVal1 % iVal2 == 0) {
            return iVal2;
        } else {
            return gcd(iVal2, iVal1 % iVal2);
        }
    }

}
