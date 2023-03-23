
package javaapplicatio1;
import java.util.Scanner;
public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingresa el numero a mostrar: ");
        int n = dato.nextInt();
        //Parte II
        int sum=0;
        int i;       
        for(i=0;i<=n;i+=2){
            sum = sum + i;
            System.out.println("Numeros pares:"+i);    

        }
        System.out.println("La suma es:"+sum); 
        }

    }
