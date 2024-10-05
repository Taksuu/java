/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javae2;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class JavaE2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe um número");
        int n = scanner.nextInt();
        
        for (int i = 1; i <=10; i++)
            System.out.println(n + " x " + i + " = " + (n*i));
        scanner.close();
      
           
          
           
          
        
    }
}
