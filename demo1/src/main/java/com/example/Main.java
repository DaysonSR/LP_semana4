package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese valor total de la cuenta: ");
        double valorCuenta = scanner.nextDouble();

        System.out.println("ingrese la propina: ");
        double porcentajePropina = scanner.nextDouble();
        porcentajePropina = porcentajePropina / 100;
        double valorPropina = valorCuenta * porcentajePropina;
        double valorTotal = valorCuenta + valorPropina;

        System.out.println("Valor de la cuenta: " + valorCuenta);
        System.out.println("Porcentaje de propina: " + porcentajePropina + '%');
        System.out.println("Valor de propina: " + valorPropina);
        System.out.println("valor total a pagar: " + valorTotal);


        System.out.println("ingrese la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

        

        System.out.println("ingrese el tiempo que espera pasar en trafico, en minutos: ");

        int tiempoEspera = scanner.nextInt();

        double tarifaBase = 4000;

        double valorKilometro = 900;

       double valorMinuto = 150;

       double x = distancia * valorKilometro;
       double y = tiempoEspera * valorMinuto;
       double precioTotal = tarifaBase + x + y;

       System.out.println("precio del viaje: " + "$" + precioTotal);




       System.out.println("quiere saber que dice este mensaje codificado:");
       String si = scanner.nextLine();
       
       System.out.println("Mensaje codificado: \"H0l4  MUnD0,  3st0  3s  Un  m3ns4j3  s3cr3t0\"");

       System.out.println("ingrese cualquier tecla para continuar con el proceso: ");

       String cualquier = scanner.nextLine();

       
       String mensaje = "H0l4  MUnD0,  3st0  3s  Un  m3ns4j3  s3cr3t0";

       // se remplazan los numeros por las letras

       mensaje = mensaje.replace("0", "o")
         .replace("3", "e")
         .replace("4", "a");

        // se convierten a mayusculas 

         mensaje = mensaje.toUpperCase();       

         // se imprime en la consola el mensaje codificado 
                         
         System.out.println(mensaje);


      
       scanner.close();



    }

}