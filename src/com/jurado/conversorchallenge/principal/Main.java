package com.jurado.conversorchallenge.principal;

import com.jurado.conversorchallenge.servicios.Conversor;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcionMoneda;
        double valorAConvertir;
        double resultadoConversion;

        while(true){

            System.out.println("****************************************");

            System.out.println("Sea bienvenido al conversor de monedas:");
            System.out.println();
            System.out.println("Las opciones disponibles son:");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción válida: ");

            System.out.println("****************************************");

            System.out.print("--> ");
            opcionMoneda = scanner.nextInt();

            if(opcionMoneda == 7){
                System.out.println("Gracias por usar el conversor de monedas");
                break;
            }

            System.out.println("Inserte el valor que desea convertir: ");
            System.out.print("-  ");
            valorAConvertir = scanner.nextDouble();

            switch(opcionMoneda){
                case 1:
                    resultadoConversion = Conversor.changeDollarToArgentinianPeso(valorAConvertir);
                    System.out.println("El valor de " + valorAConvertir + " dólares es de " + resultadoConversion + " pesos argentinos");
                    break;
                case 2:
                    resultadoConversion = Conversor.changeArgentinianPesoToDollar(valorAConvertir);
                    System.out.println("El valor de " + valorAConvertir + " pesos argentinos es de " + resultadoConversion + " dólares");
                    break;
                case 3:
                    resultadoConversion = Conversor.changeDollarToBrazilianReal(valorAConvertir);
                    System.out.println("El valor de " + valorAConvertir + " dólares es de " + resultadoConversion + " reales brasileños");
                    break;
                case 4:
                    resultadoConversion = Conversor.changeBrazilianRealToDollar(valorAConvertir);
                    System.out.println("El valor de " + valorAConvertir + " reales brasileños es de " + resultadoConversion + " dólares");
                    break;
                case 5:
                    resultadoConversion = Conversor.changeDollarToColombianPeso(valorAConvertir);
                    System.out.println("El valor de " + valorAConvertir + " dólares es de " + resultadoConversion + " pesos colombianos");
                    break;
                case 6:
                    resultadoConversion = Conversor.changeColombianPesoToDollar(valorAConvertir);
                    System.out.println("El valor de " + valorAConvertir + " pesos colombianos es de " + resultadoConversion + " dólares");
                    break;
                default:
                    System.out.println("La opción ingresada no es válida");
            }



        };


        scanner.close();
    }
}