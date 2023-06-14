package Entidad;

import java.util.Scanner;

public class Circunferencia{
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        this.radio = input.nextDouble();
    }
    
    public double area(){
        return Math.PI * Math.pow(getRadio(), 2);
    }
    
    public double perimetro(){
        return Math.PI * 2 * getRadio();
    }
}
