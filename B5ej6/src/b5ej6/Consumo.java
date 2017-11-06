package b5ej6;

/**
 *
 * @author quique
 */
public class Consumo {
    private int ventas;
    
    public Consumo (){}
    
    public Consumo (int ventas){
        this.ventas = ventas;
    }
    
    public void setVentas (int ventas){
        this.ventas = ventas;    
    }
    
    public void calcularVentas (){
        if (ventas <=100){
        
            System.out.println("Las ventas son bajas");
        } else if (ventas > 100 && ventas <=500){
        
            System.out.println("Las ventas son medias");
        } else if (ventas > 500 && ventas <=1000){
        
            System.out.println("Las ventas son altas");
        } else {
        
            System.out.println("Las ventas son de primera necesidad");
        }
    
    
    }
}
