package com.mycompany.taller_06;
import java.util.Scanner;
public class Problema_01 {
     public static void main(String[] args) {
        double precio, n;
        double precio2;
        double envio;
        double subtotal;
        double desc;
        double totalcompra;
        double iva;
        double totiva;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el precio del primer producto: ");
        precio = teclado.nextDouble();
        System.out.println("Ingrese el precio del segundo producto: ");
        precio2 = teclado.nextDouble();
        System.out.println("Ingrese el costo del envio: ");
        envio = teclado.nextDouble();
        subtotal= precio + precio2;
        n = subtotal;
        iva = 1.21;
        totiva =  (subtotal + envio) * iva;
        System.out.println("El subtotal de su compra va a ser de: "+subtotal);
        System.out.println("El subtotal mas impuesto y costo de envio va a ser de: "+totiva);
        System.out.println("El impuesto aplicado es de: "+iva);
        
        if(n > 1000){
            desc = (subtotal * 20)/100;
            totalcompra = totiva - desc;
            System.out.println("El total de su compra va a ser de +: "+totalcompra);
                if(totalcompra > 5000){
                    System.out.println("El total de su compra va a ser -: "+totiva);
                }                  
            }
        else{
            if(subtotal == 1000){
                desc = (totiva * 15)/100;
                totalcompra = totiva - desc;
                System.out.println("El total de su compra va a ser de : "+totalcompra);
            }
        }
       
    }
}

