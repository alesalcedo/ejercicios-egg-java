/*
Escribir un programa que lea un número entero por teclado 
y muestre por pantalla el doble, el triple y la raíz 
cuadrada de ese número.
 */
package ejerciciosGuia1;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numeros: ");
        int num=leer.nextInt();
        
        int doble=num*2;
        int triple=num*3;
        float raiz= (float) Math.sqrt(num);
        
        System.out.println("El numero ingresado es " +num+ " El doble es: "+doble+ " El triple es: "+triple+ " Y la raiz cuadrada es: "+raiz);
        
        
    }
    
}
