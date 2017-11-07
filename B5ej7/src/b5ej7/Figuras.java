package b5ej7;

/**
 *
 * @author quique
 */
public class Figuras {
    
    private final double PI = 3.14;
    private double base, altura, radio, scuadrado, scirculo, striangulo;
    
    public Figuras (){}
    
    public Figuras (double base, double altura, double radio){
        this.base = base;
        this.altura = altura;
        this.radio = radio;
    }
    
    public void setValores (double base, double altura, double radio){
        this.base = base;
        this.altura = altura;
        this.radio = radio;
    }
    
    public void calcularValores (){
        scuadrado = Math.pow(base, 2);
        scirculo = PI*Math.pow(radio, 2);
        striangulo = base*(altura/2);
    }
    
    
    public void elegirOpcion (int op){
        switch (op){
            case 1: System.out.println("Cuadrado; Superficie: "+scuadrado);
                break;
            case 2: System.out.println("Circulo; Superficie: "+scirculo);
                break;
            case 3: System.out.println("Triangulo; Superficie: "+striangulo);
                break;
            default: System.out.println("Error");
                break;
        }
    }
    
}
