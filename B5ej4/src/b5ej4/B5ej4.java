/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b5ej4;

/**
 *
 * @author quique
 */
public class B5ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personas persona1 = new Personas();
        Personas persona2 = new Personas();
        
        String pers1= persona1.nomPersona("Pepe");
        double peso1= persona1.pesoPersona(80);
        System.out.println("\n");
        String pers2= persona2.nomPersona("Ana");
        double peso2= persona2.pesoPersona(65);
        System.out.println("\n");
        if (peso1 > peso2){
        
            System.out.println("Pesa más "+pers1);
        } else {
        
            System.out.println("Pesa más "+pers2);
        }
        
        System.out.println("Diferencia de peso: "+(peso1 - peso2));
        
        
    }
    
}
