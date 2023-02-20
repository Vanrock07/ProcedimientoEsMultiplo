/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedimiento.esmultiplo;

import java.util.Scanner;

/**Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 *
 * @author Ivan Ramirez
 */
public class ProcedimientoEsMultiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Indique el multiplo a eavluar");
        num1 = leer.nextInt();
        System.out.println("Indique el divisor");
        num2 = leer.nextInt();
        
        multiplo(num1,num2);   
    }
    
    public static void multiplo(int num1, int num2){
        
        float multiplo;
        
        multiplo = num1%num2;
        
        if (multiplo == 0){
            System.out.println("Este numero es multiplo de " + num2);
            
        } else 
            System.out.println("Este numero no es multiplo de " + num2);
               
}
}   