package b5ej3;

/**
 *
 * @author quique
 */
public class Multi {
    
    private int numero;
    
    public Multi(){}
    
    public Multi (int numero){
        this.numero=numero;
    }
    
    public void setNumero (int numero){
        this.numero=numero; 
    }
    
    public void sentencia (){
        if (numero>0){
        
            System.out.println("El numero es positivo");
        } else if (numero==0){
        
            System.out.println("El numero es 0");
        } else {
        
            System.out.println("El numero es negativo");
        }
    
    }
    
}
