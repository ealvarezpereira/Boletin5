/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b5ej6;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class B5ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Consumo consumo = new Consumo();
        System.out.println("Inserta el numero de ventas");
        consumo.setVentas(sc.nextInt());
        consumo.calcularVentas();
    }
    
}
