package b5ej2;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class B5ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        Doble calcular = new Doble();
        System.out.println("Introduce el numero 1");        
        calcular.setNumero1(sc.nextShort());
        System.out.println("Introduce el numero 2");        
        calcular.setNumero2(sc.nextShort());       
        calcular.sumar();        
        calcular.restar();
    }
    
}
