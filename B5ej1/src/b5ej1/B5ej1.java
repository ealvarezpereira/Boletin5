package b5ej1;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class B5ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Condicion numero1 = new Condicion();
        
        System.out.println("Introduce el numero");
        numero1.setNum1(sc.nextInt());
        
        numero1.hacerCondicion();
        
    }
    
}
