/*
Escribir un programa que pida dos números enteros por teclado 
y calcule la suma de los dos. El programa deberá 
después mostrar el resultado de la suma
 */
package ejerciciosGuia1;


import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese dos numeros: ");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        int suma=num1+num2;
        
        System.out.println("La suma de los numeros es: "+suma);
        
    }
    
}
