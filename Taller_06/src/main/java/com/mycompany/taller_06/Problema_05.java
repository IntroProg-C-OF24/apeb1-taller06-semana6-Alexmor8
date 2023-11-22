package com.mycompany.taller_06;
import java.util.Scanner;
public class Problema_05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
            System.out.println("Eliga una de las siguientes opciones: ");
            System.out.println("==============================================");
            System.out.println("[1]");
            System.out.println("[2]");
            System.out.println("[3]");
            System.out.println("[4]");
            System.out.println("==============================================");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Suma");
                    break;
                case 2:
                    System.out.println("Resta");
                    break;
                case 3:
                    System.out.println("Multiplicacion");
                    break;
                case 4:
                    System.out.println("Division");
                    break;
                default:{
                    System.out.println("No existe tal opcion");
                }     
            }
    }
}
