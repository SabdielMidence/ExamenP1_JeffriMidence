/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_jeffrimidence;

import java.util.Scanner;

/**
 *
 * @author sabdi
 */
public class Examen1P1_JeffriMidence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean respuesta = true;
        
        while(respuesta){//inciio del while
            System.out.println("1- Sumador Binario");
            System.out.println("2- Estrella de David");
            System.out.println("3- Salir del programa");
            int opcion = sc.nextInt();
            
            switch(opcion){//inicio del menu
                case 1:
                    System.out.println("Ingrese el primer numero: ");
                    int primer1 = sc.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    int segundo2 = sc.nextInt();
////////
                    if (primer1>48 || primer1<49 || segundo2>48 || segundo2<49){//inicio del if
                        int suma = primer1+segundo2;
                        System.out.println(suma+"");
                    }//fin del if
                    else {
                        System.out.println("Los números deben de tener el mismo número de bits");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese un tamano para la figura: ");
                    int tama = sc.nextInt();
                    for(int i=0;i<tama;i++){//inicio del for 
                        System.out.print("+");
                    }//fin del for    
                    for (int j=1;j<tama;j++){
                    System.out.println("*");
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("MUCHAS GRACIAS POR UTILIZAR EL PROGRAMA");
                    respuesta = false;
                    break;
                default:
                    System.out.println("Su respuesta es incorrecta ");
                    break;
            }//fin del menu
        }//fin del while
    }//fin del main
    
}//fin del class
