package b5ej1;

/**
 *
 * @author quique
 */
public class Condicion {
    
    private int num1;
    
    public Condicion() {}
    
    public Condicion (int num1){
    
        this.num1=num1;
    }
    
    public void setNum1 (int num1){
    
        this.num1 = num1;
    
    }   
    public void hacerCondicion (){
    
        if (num1 > 0){
            
            System.out.println("El numero es positivo");
        }
    
    }
    
}
