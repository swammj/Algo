/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_1;

import java.util.Scanner;

/**
 *
 * @author Swammy
 */
public class Tablamulti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resp=1, N1, N2, c, product;//declaracion de variables y inicializacion de contadores
        Scanner entrada = new Scanner(System.in);        
        while (resp==1){//Comienzo del while principal
            System.out.println("Ingrese El Primer Numero:");
            N1=entrada.nextInt();
            System.out.println("Ingrese El Segundo Numero:");
            N2=entrada.nextInt();
            c=1;
            while (c<=N2){//comienzo del 2nd while
                product=N1*c;
                System.out.println(N1 + "X" + c + "=" + product);
                c++;
            }//fin 2nd while
            System.out.println("Continua 1/2:");
            resp=entrada.nextInt();
        }//fin while principal
    }//fin main
}