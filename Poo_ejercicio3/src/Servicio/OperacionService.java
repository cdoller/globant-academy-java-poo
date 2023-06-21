package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

public class OperacionService {

    public Operacion crearOperacion() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero y presione enter, luego el segundo y nuevamente enter");
        return new Operacion(input.nextInt(), input.nextInt());
    }

    public int sumar(Operacion op) {
        return op.getNumero1() + op.getNumero2();
    }

    public int restar(Operacion op) {
        return op.getNumero1() - op.getNumero2();
    }

    public int multiplicar(Operacion op) {
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
            System.out.print("Uno de los numeros es cero. ");
            return 0;
        } else {
            return op.getNumero1() * op.getNumero2();
        }
    }

    public double division(Operacion op) {
        if (op.getNumero2() == 0) {
            System.out.print("No se puede hacer division por cero. ");
            return 0;
        } else {
            return (double) op.getNumero1() / (double) op.getNumero2();
        }
    }
}
