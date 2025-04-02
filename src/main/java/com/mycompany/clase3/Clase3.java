/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase3;

/**
 *
 * @author SL-LAB1-PG8
 */
public class Clase3 {

    public static void main(String[] args) {
        
int nota=-80;
if ((nota>=0)&&(nota<=100)){
if (nota >=90){
        System.out.println("Excelente");
    }
else{
        if ((nota>=70)&&(nota<=89)){
        System.out.println("Aprobado");
        }
        else {
        System.out.println("Reprobado");
        }
        }
}else{
                System.out.println("Su nota es invalida");
                               }

    }
}
 /*//while
        int contador=5;
        /*while (contador<5){
            System.out.println("Hola "+contador);
            //contador=contador+3;
            contador++;
        }
        //do-while
        do {            
             System.out.println("Hola "+contador);
            //contador=contador+3;
            contador++;
        } while (contador<5);

        Altura de rectangulo
        double altura=4;
        double ancho=2;
        double area=altura*ancho;
        System.out.println("El area del rectangulo es: "+area);

        Positivo o negativo
        int numero=3;
        if (numero<0){
        System.out.println("El numero es negativo");
        }
        else {
        System.out.println("El numero "+numero+" es positivo");
    }

        Par o impar
        int numero=8;
        int op=numero%2;
        if (op==0){
            System.out.println("El numero "+numero+" es par");
        }
        else{
            System.out.println("El numero "+numero+" es impar");
        }
*/