package domain.cuentas;

import java.util.Scanner;

public class Main {

    public Main() {
    }

    public void ejecutarControl(String[] args) {
        Control miControl = new Control();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Ingrese su DNI: ");
            int dniIngresado = scanner.nextInt();

            System.out.println("Ingrese un valor de saldo: ");
            int saldoIngresado = scanner.nextInt();

            int cuantasCuentas = miControl.cuantasCuentasConSaldoMayor(dniIngresado, saldoIngresado);
            if (cuantasCuentas < 0) {
                System.out.println("No se encontro ningun cliente con dni " + dniIngresado + "\n");
            } else if (cuantasCuentas == 0) {
                System.out.println("No se encontro ninguna cuenta con saldo mayor a " + saldoIngresado + " del cliente de dni " + dniIngresado + "\n");
            } else {
                System.out.println("La cantidad de cuentas del DNI " + dniIngresado + ", que superan el saldo de $" + saldoIngresado + " es de " + cuantasCuentas);
                flag = false;
            }
        }
    }


}
