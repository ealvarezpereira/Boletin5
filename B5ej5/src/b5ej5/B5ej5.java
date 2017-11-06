package b5ej5;
 
import java.util.Scanner;

/**
 *
 * @author quique
 */
public class B5ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Numeros numero1 = new Numeros();
        
        System.out.println("Introduzca el numero 1");
        numero1.setNum1(sc.nextDouble());
        System.out.println("Introduzca el numero 2");
        numero1.setNum2(sc.nextDouble());
        System.out.println("Introduzca el numero 3");
        numero1.setNum3(sc.nextDouble());
        
        numero1.calcularMayor();
    }
    
}
