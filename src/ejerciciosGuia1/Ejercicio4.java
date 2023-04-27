/*
 Dada una cantidad de grados centígrados se debe mostrar 
su equivalente en grados Fahrenheit. La fórmula correspondiente 
es: F = 32 + (9 * C / 5).
 */
package ejerciciosGuia1;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar grados centigrados: ");
        int celcius=leer.nextInt();
        int fahrenheit=32+(9*celcius/5);
        System.out.println("Su equivalente en Fahrenheit es de: "+fahrenheit+ " grados ");
    }
    
}
