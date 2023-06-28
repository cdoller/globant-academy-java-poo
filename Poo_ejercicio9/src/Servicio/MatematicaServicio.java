package Servicio;

import Entidad.Matematica;

public class MatematicaServicio {

    private Matematica matematica = new Matematica();

    public MatematicaServicio() {
        matematica.setNum1((int)(Math.random() * 21 - 10));
        matematica.setNum2((int)(Math.random() * 21 - 10));
    }

    public int devolverMayor(){
        return  matematica.getNum1()>matematica.getNum2() ? matematica.getNum1() : matematica.getNum2();
    }
    
    public int devolverMenor(){
        return  matematica.getNum1()<matematica.getNum2() ? matematica.getNum1() : matematica.getNum2();
    }
    
    public double calcularPotencia(){
        return Math.pow((double)devolverMayor(), (double)devolverMenor());
    }
    
    public double calculaRaizCuadrada(){
        return Math.sqrt(Math.abs(devolverMenor()));
    }

    @Override
    public String toString() {
        return "MatematicaServicio{" + "matematica=" + matematica + '}';
    }
    
    
}
