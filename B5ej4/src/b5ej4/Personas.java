package b5ej4;

/**
 *
 * @author quique
 */
public class Personas {
    
    private String nombre;
    private double peso;
    
    public Personas (){}
    
    public Personas (String nombre, double peso){
        this.nombre = nombre;
        this.peso = peso;
    }
    
    public String nomPersona (String nombre){
        this.nombre= nombre;
        System.out.println(nombre);
        return nombre;
    }
    
    public double pesoPersona (double peso){
        this.peso = peso;
        System.out.println(peso);
        return peso;
    }
    
}
