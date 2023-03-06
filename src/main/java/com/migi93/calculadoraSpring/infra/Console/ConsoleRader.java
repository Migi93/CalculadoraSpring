package com.migi93.calculadoraSpring.infra.Console;

import com.migi93.calculadoraSpring.service.CalculadoraService;

import java.util.Scanner;


public class ConsoleRader {
    CalculadoraService calculadoraService;

    public ConsoleRader(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    public void init() {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String opcionConsola;
        int opcion = 1;
        String numeroOneAndTwo;
        float numOne;
        float numTwo;
        do {
            System.out.println("\n\n***MENU***");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("0.- Salir");
            System.out.println("Ingrese la accion a realizar: ");
            opcionConsola = sc.next();
            try {
                opcion = Integer.parseInt(opcionConsola);
            } catch (Exception e) {
                System.out.println("Debes meter un numero.");
            }
            switch (opcion) {
                case 0:
                    System.out.println("Hasta pronto!!");
                    break;
                case 1:
                    try {
                        System.out.println("Ingrese el primer numero: ");
                        numeroOneAndTwo = scanner.next();
                        numOne = Float.parseFloat(numeroOneAndTwo);
                        System.out.println("Ingrese el segundo numero: ");
                        numeroOneAndTwo = scanner.next();
                        numTwo = Float.parseFloat(numeroOneAndTwo);
                        System.out.printf("Resultado: %f", calculadoraService.suma(numOne, numTwo));
                    } catch (Exception e) {
                        System.out.println("Se debe ingresar un numero.");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Ingrese el primer numero: ");
                        numeroOneAndTwo = scanner.next();
                        numOne = Float.parseFloat(numeroOneAndTwo);
                        System.out.println("Ingrese el segundo numero: ");
                        numeroOneAndTwo = scanner.next();
                        numTwo = Float.parseFloat(numeroOneAndTwo);
                        System.out.printf("Resultado: %f", calculadoraService.resta(numOne, numTwo));
                    } catch (Exception e) {
                        System.out.println("Se debe ingresar un numero.");
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Ingrese el primer numero: ");
                        numeroOneAndTwo = scanner.next();
                        numOne = Float.parseFloat(numeroOneAndTwo);
                        System.out.println("Ingrese el segundo numero: ");
                        numeroOneAndTwo = scanner.next();
                        numTwo = Float.parseFloat(numeroOneAndTwo);
                        System.out.printf("Resultado: %f", calculadoraService.multiplicacion(numOne, numTwo));
                    } catch (Exception e) {
                        System.out.println("Se debe ingresar un numero.");
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Ingrese el primer numero: ");
                        numeroOneAndTwo = scanner.next();
                        numOne = Float.parseFloat(numeroOneAndTwo);
                        System.out.println("Ingrese el segundo numero: ");
                        numeroOneAndTwo = scanner.next();
                        numTwo = Float.parseFloat(numeroOneAndTwo);
                        try {
                            System.out.printf("Resultado: %f", calculadoraService.division(numOne, numTwo));
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                    } catch (Exception e) {
                        System.out.println("Se debe ingresar un numero.");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida!!");
            }
        } while (opcion != 0);
    }
}
