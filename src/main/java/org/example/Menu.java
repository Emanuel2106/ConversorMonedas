package org.example;

import java.util.Scanner;

public class Menu {

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== Conversor de Monedas =====");
            System.out.println("1. Convertir moneda");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.println("⚠️ Entrada no válida. Ingrese un número.");
                scanner.next();  // Limpiar entrada incorrecta
            }

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    solicitarDatos(scanner);
                    break;
                case 2:
                    System.out.println("👋 ¡Gracias por usar el conversor de monedas!");
                    break;
                default:
                    System.out.println("⚠️ Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 2);

        scanner.close();
    }

    private void solicitarDatos(Scanner scanner) {
        System.out.print("Ingrese la cantidad a convertir: ");

        while (!scanner.hasNextDouble()) {
            System.out.println("⚠️ Por favor, ingrese un número válido.");
            scanner.next();  // Limpiar entrada incorrecta
        }
        double cantidad = scanner.nextDouble();

        System.out.print("Ingrese la moneda de origen (USD, EUR, etc.): ");
        String monedaOrigen = scanner.next().toUpperCase();

        System.out.print("Ingrese la moneda de destino (USD, EUR, etc.): ");
        String monedaDestino = scanner.next().toUpperCase();

        double tasaCambio = ApiService.obtenerTasaCambio(monedaOrigen, monedaDestino);

        if (tasaCambio != -1) {
            double resultado = cantidad * tasaCambio;
            System.out.printf("💰 %.2f %s equivale a %.2f %s\n", cantidad, monedaOrigen, resultado, monedaDestino);
        } else {
            System.out.println("❌ No se pudo realizar la conversión. Verifique las monedas ingresadas.");
        }
    }

}
