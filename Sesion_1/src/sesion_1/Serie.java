/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_1;
import java.util.*;
/**
 *
 * @author Swammy
 */
public class Serie {
    public static void main (String [] args){
            Scanner ent=new Scanner(System.in);
            int num, n1=1, resp=1;            
            while (resp==1){
                System.out.println("Ingrese la Cantidad de Veces: ");
                num=ent.nextInt();
                System.out.println("hey y entonces!");
                System.out.println("Swammy se la traga")
                for (int i=1; i<=num; i++){                                       
                    if (n1%2!=0){                       
                        System.out.print(n1 + ", ");
                        n1++;
                    }//fin del if de impar                    
                    else{                        
                        n1=n1*-1;
                        System.out.print(n1 + ", "); 
                        n1=(n1*-1)+1;                       
                    }//fin del else;
                    
                   
                }
                n1=1;
                System.out.println("\n\nDesea Continuar??? 1/2");
                resp=ent.nextInt();
            }
                
            }//fin del while
                
            }//fin del main
   


