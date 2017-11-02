package b5ej2;

/**
 *
 * @author quique
 */
public class Doble {
    
    private short num1;
    private short num2;
    
    
    public Doble(){}
    public Doble(short num1, short num2){    
        this.num1=num1;
        this.num2=num2;   
    }
    
    public void setNumero1 (short num1){         
        this.num1=num1;
    }
    
    public void setNumero2 (short num2){
        this.num2=num2;    
    }
    
    public void sumar (){
        int suma = num1+num2;
        System.out.println("Suma: "+suma);
    }
    
    public void restar (){
        if (num1>=num2){
            int resta = num1-num2;
            System.out.println("Resta: "+resta);
        }
    }   
}
