/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

public class CuentaServicio {

    private Scanner input = new Scanner(System.in);

    public Cuenta crearCuenta() {
        System.out.println("Ingrese el numero de cuenta, dni cliente y saldo actual");
        return new Cuenta(input.nextInt(), input.nextLong(), input.nextDouble());
    }

    public Cuenta crearCuentaAleatoria() {
        System.out.println("Se creara una cuenta con datos pseudo-aleatorios:");
        return new Cuenta((int) (Math.random() * (99999 - 9999 + 1) + 9999), (long) (Math.random() * (99999999 - 999999 + 1) + 999999), (double) (Math.random() * (1000 - 100 + 1) + 100));
    }

    public void ingresarDinero(Cuenta cuenta, double ingreso) {
        if (ingreso != 0) {
            cuenta.setSaldoActual(Math.abs(ingreso) + cuenta.getSaldoActual());
            System.out.println("Se ingresaron " + Math.abs(ingreso) + ". Su nuevo saldo es " + cuenta.getSaldoActual());
        } else {
            System.out.println("No se puden ingresar 0 cantidad de dinero.");
            return;
        }

    }

    public void retirarDinero(Cuenta cuenta, double retiro) {
        if (retiro != 0) {
            if (cuenta.getSaldoActual() >= Math.abs(retiro)) {
                cuenta.setSaldoActual(cuenta.getSaldoActual() - Math.abs(retiro));
                System.out.println("Se retiran " + Math.abs(retiro) + ". Su nuevo saldo es " + cuenta.getSaldoActual());
            } else {
                System.out.println("No se pudo realizar el retiro de dinero.");
                System.out.println("Saldo insuficiente. Su saldo es " + cuenta.getSaldoActual());
                System.out.println("Desea retirar TODO el saldo? Y/N");
                switch (input.next()) {
                    case "Y":
                        System.out.println("Se retiran " + cuenta.getSaldoActual() + ". Su nuevo saldo es 0.");
                        cuenta.setSaldoActual(0);
                        break;
                    case "N":
                        System.out.println("Retiro cancelado.");
                        break;
                    default:
                        System.out.println("Retiro cancelado.");
                        break;
                }
            }
        } else {
            System.out.println("No se pueden retirar 0 cantidad de dinero.");
            return;
        }

    }

    public void extraccionRapida(Cuenta cuenta) {
        System.out.println("Se retiran " + cuenta.getSaldoActual() * 0.2 + ". Su nuevo saldo es " + cuenta.getSaldoActual() * 0.8);
        cuenta.setSaldoActual(cuenta.getSaldoActual() * 0.8);
    }

    public double consultarSaldo(Cuenta cuenta) {
        return cuenta.getSaldoActual();
    }

    public void consultarDatos(Cuenta cuenta) {
        System.out.println("---------------------------");
        System.out.println("=> Cuenta Nro " + cuenta.getNumeroCuenta());
        System.out.println("=> Cliente: " + cuenta.getDniCliente());
        System.out.println("=> Saldo: " + cuenta.getSaldoActual());
        System.out.println("---------------------------");
    }
}
