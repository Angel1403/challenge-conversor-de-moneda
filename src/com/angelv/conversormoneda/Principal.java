package com.angelv.conversormoneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaConversion consulta = new ConsultaConversion();
        Scanner scanner = new Scanner(System.in);
        int seleccion = 0;
        String moneda_base = "";
        String moneda_destino = "";
        double cantidad = 0.0;
        Moneda moneda = null;

        String menu = """
                ******************************************************************
                Por favor seleccione una opción de conversion de moneda
                1.- ARS - Peso argentino  -->  BRL - Real brasileño
                2.- ARS - Peso argentino  -->  COP - Peso colombiano
                3.- ARS - Peso argentino  -->  USD - Dólar estadounidense
                4.- ARS - Peso argentino  -->  BOB - Boliviano boliviano
                
                5.- BRL - Real brasileño  -->  ARS - Peso argentino
                6.- BRL - Real brasileño  -->  COP - Peso colombiano
                7.- BRL - Real brasileño  -->  USD - Dólar estadounidense
                8.- BRL - Real brasileño  -->  BOB - Boliviano boliviano
                
                9.- COP - Peso colombiano  -->  USD - Dólar estadounidense
                10.- COP - Peso colombiano  -->  BRL - Real brasileño
                11.- COP - Peso colombiano  -->  ARS - Peso argentino
                12.- COP Peso colombiano  -->  BOB - Boliviano boliviano
                
                13.- USD - Dólar estadounidense  -->  COP - Peso colombiano
                14.- USD - Dólar estadounidense  -->  BRL - Real brasileño
                15.- USD - Dólar estadounidense  -->  ARS - Peso argentino
                16.- USD - Dólar estadounidense  -->  BOB - Boliviano boliviano
                
                17.- BOB - Boliviano boliviano  -->  ARS - Peso argentino
                18.- BOB - Boliviano boliviano  -->  BRL - Real brasileño
                19.- BOB - Boliviano boliviano  -->  COP - Peso colombiano
                20.- BOB - Boliviano boliviano  -->  USD - Dólar estadounidense
                
                21.- Salir
                ******************************************************************
                """;

        while(seleccion != 21){
            System.out.println(menu);
            seleccion = scanner.nextInt();

            switch (seleccion){
                case 1:
                    moneda_base = "ARS";
                    moneda_destino = "BRL";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 2:
                    moneda_base = "ARS";
                    moneda_destino = "COP";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 3:
                    moneda_base = "ARS";
                    moneda_destino = "USD";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 4:
                    moneda_base = "ARS";
                    moneda_destino = "BOB";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 5:
                    moneda_base = "BRL";
                    moneda_destino = "ARS";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 6:
                    moneda_base = "BRL";
                    moneda_destino = "COP";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 7:
                    moneda_base = "BRL";
                    moneda_destino = "USD";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 8:
                    moneda_base = "BRL";
                    moneda_destino = "BOB";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 9:
                    moneda_base = "COP";
                    moneda_destino = "USD";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 10:
                    moneda_base = "COP";
                    moneda_destino = "BRL";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 11:
                    moneda_base = "COP";
                    moneda_destino = "ARS";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 12:
                    moneda_base = "COP";
                    moneda_destino = "BOB";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 13:
                    moneda_base = "USD";
                    moneda_destino = "COP";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 14:
                    moneda_base = "USD";
                    moneda_destino = "BRL";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 15:
                    moneda_base = "USD";
                    moneda_destino = "ARS";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 16:
                    moneda_base = "USD";
                    moneda_destino = "BOB";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 17:
                    moneda_base = "BOB";
                    moneda_destino = "ARS";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 18:
                    moneda_base = "BOB";
                    moneda_destino = "BRL";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 19:
                    moneda_base = "BOB";
                    moneda_destino = "COP";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                case 20:
                    moneda_base = "BOB";
                    moneda_destino = "USD";
                    System.out.println("Digite la cantidad que desea convertir: ");
                    cantidad = scanner.nextDouble();
                    moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
                    System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
                    break;
                default:
                    System.out.println("\n¡Hasta luego!");
                    break;
            }
        }
    }
}