package eva2_5_primos;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Ingresa un numero:");
        int no = a.nextInt();
        if (esPrimoIneficiente(no)) {
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }

    public static boolean esPrimoIneficiente(int valor) {
        boolean bResu = true;
        for (int i = 2; i < valor; i++) {
            if ((valor % i) == 0) {
                bResu = false;
                break;
            }
        }
        return bResu;
    }
    
    public static boolean esPrimoEficiente(int valor){
        return false;
    }

}
