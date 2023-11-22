package com.mycompany.taller_06;
import java.util.Scanner;
public class Problema_04 {
     public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int opcion;
        System.out.println("Selecciones un numero del 1 al 12");
        System.out.println("==============================================================================================================");
        System.out.println("[1]");
        System.out.println("[2]");
        System.out.println("[3]");
        System.out.println("[4]");
        System.out.println("[5]");
        System.out.println("[6]");
        System.out.println("[7]");
        System.out.println("[8]");
        System.out.println("[9]");
        System.out.println("[10]");
        System.out.println("[11]");
        System.out.println("[12]");
        System.out.println("==============================================================================================================");
        opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:{
                System.out.println("No existe tal opcion");
            
        }
        } 
    }
}
