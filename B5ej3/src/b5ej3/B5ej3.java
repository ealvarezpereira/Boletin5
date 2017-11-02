package b5ej3;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class B5ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Multi numero1 = new Multi();
        
        System.out.println("Introduce el numero");
        numero1.setNumero(sc.nextInt());
        numero1.sentencia();
        
    }
    
}
