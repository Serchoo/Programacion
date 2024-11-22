
import java.util.Scanner;

public class S7 {
    public static void main(String[] args) {
        Scanner lectura;
        int num = 0;
        boolean correcto = false;
        while(!correcto){
            lectura = new Scanner (System.in);
            System.out.print("Introduce un num :");
            if (lectura.hasNextInt()) {
                num = lectura.nextInt();
                if (num >= 0 && num <= 20) {
                    correcto = true;
                }
            }
        }

        System.out.println(0);
        //Multiplos del 1 al 100
        for(int i = 1; i <=100; i++){
            //Si el resto de la division es 0, es multiplo
            if (i % num == 0) {
                System.out.println(i);
            }
        }
    }
}
