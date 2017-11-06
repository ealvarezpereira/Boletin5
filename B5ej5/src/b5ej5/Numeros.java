package b5ej5;

/**
 *
 * @author quique
 */
public class Numeros {
    
    private double num1,num2,num3;
    
    public Numeros (){}
    
    public Numeros (double num1, double num2, double num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    public void setNum1 (double num1){
        this.num1 = num1;
    }
    
    public void setNum2 (double num2){
        this.num2 = num2;
    }
     
    public void setNum3 (double num3){
        this.num3 = num3;
    }
    
    public void calcularMayor (){
        if (num1>num2 && num1>num3){
        
            System.out.println("El numero 1 es mayor");
        } else if (num2>num3){
        
            System.out.println("El numero 2 es mayor");
        } else {
        
            System.out.println("El numero 3 es mayor");
        }
    
    
    }
    
    
}
