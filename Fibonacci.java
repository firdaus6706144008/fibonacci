/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;
/**
 *
 * @author Praktikum
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] bil = new int [100];
        bil[0] = 0;
        bil[1] = 1;
        int deret;
        
        Scanner input = new Scanner(System.in);
        System.out.println("masukan jumlah deret");
        String data = input .nextLine();
        
        deret = Integer.parseInt(data);
        
        for(int i =0; i<deret; i++){
            System.out.println(bil[i]+" ");
            bil[i + 2] = bil[i] + bil[i + 1];
        }
    }
    
}
