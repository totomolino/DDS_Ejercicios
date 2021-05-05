package domain.empresa;

import java.util.Scanner;

public class empresa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner respuesta1 = new Scanner(System.in);
        boolean salida = true;

        while(salida)
        {
            System.out.println("Elija el numero correspondiente a su estrategia:\n 1. EnvioEstandar \n 2. EnvioUPS \n 3. EnvioFEDEX");
            int estrategiaElegida = scanner.nextInt();

            System.out.println("Indique cuanto pesa su paquete:");
            int unPeso = scanner.nextInt();

            Paquete unPaquete = new Paquete(unPeso);

            Envio nuestroEnvio = new Envio("Argentina", "Madaquecua", estrategiaElegida, unPaquete);

            int precio = nuestroEnvio.calcularPrecio();

            System.out.println("El precio es: " + precio + "\n");

            System.out.println("¿Desea salir? Si/No");
            String respuesta = respuesta1.nextLine();

            if(respuesta.equals("Si") || respuesta.equals("s") || respuesta.equals("si") || respuesta.equals("SI") || respuesta.equals("S") || respuesta.equals("Por Favor!")){
                System.out.println("Hasta la proxima!!");
                salida = false;
            }
        }
    }
}
