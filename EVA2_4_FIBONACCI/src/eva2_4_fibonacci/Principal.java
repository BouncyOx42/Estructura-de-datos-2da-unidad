package eva2_4_fibonacci;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Ingresa las posiciones:");
        int n = a.nextInt();
        System.out.println(fibo(n));
    }

    public static int fibo(int numero){
        if (numero==0) {
            return 0;
        }else if (numero == 1) {
            return 1;
        }else{
            return fibo(numero-1)+ fibo(numero-2);
        }
    }
}
