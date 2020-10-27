/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impar.e.par;

/**
 *
 * @author Micro
 */import java.util.Scanner;
public class ImparEPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada;
        int num;
        
        entrada = new Scanner(System.in);
        
        System.out.print ("Digite um número:");
        num = entrada.nextInt();
        if((num %2)==0){
        System.out.print("par");}
        
        else{ System.out.print("impar");}
    }
    
}
