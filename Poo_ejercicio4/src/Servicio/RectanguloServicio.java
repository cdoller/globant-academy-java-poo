package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

public class RectanguloServicio {

    public Rectangulo crearRectangulo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        double base = input.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = input.nextDouble();
        while(base*altura == 0){
            System.out.println("No puede ingresar valores iguales a cero. Ingrese nuevamente");
            System.out.print("Ingrese la base: ");
            base = input.nextDouble();
            System.out.print("Ingrese la altura: ");
            altura = input.nextDouble();
        }
        return new Rectangulo(base, altura);
    }
    
    public double calcularSuperficie(Rectangulo rectangulo){
        return rectangulo.getAltura()*rectangulo.getBase();
    }
    
    public double calcularPerimetro(Rectangulo rectangulo){
        return (rectangulo.getAltura()+rectangulo.getBase())*2;
    }
    
    public void dibujarRectangulo(Rectangulo rectangulo){
        for(int i=0; i<rectangulo.getAltura();i++){
            for(int j=0; j<rectangulo.getBase();j++){
                if(i==0 || i==rectangulo.getAltura()-1){
                    System.out.print("* ");
                }else{
                    if(j==0 || j==rectangulo.getBase()-1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
