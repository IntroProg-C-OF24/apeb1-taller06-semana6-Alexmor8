package com.mycompany.taller_06;
import java.util.Scanner;
public class Problema_03 {
     public static void main(String[] args) {
        double peso;
        String region;
        double costo;
        String nom = "local";
        String nom2 = "nacional";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el peso del paquete: ");
        peso = teclado.nextDouble();
        System.out.println("Ingrese si la region es local o nacional: ");
        region = teclado.nextLine();
        if (peso < 5){
            if (region.equals(nom));{
            costo = peso+5;
            System.out.println("El costo total es de: " + costo);
            if (peso > 5 && peso < 10){
                if (region.equals(nom2));{
                costo = peso + 10;
                System.out.println("El costo es de: " + costo);
            }
            }
        }
            
        }else{
            costo = peso + 15;
            System.out.println("El costo es de: " + costo);
        }   
    }
}
