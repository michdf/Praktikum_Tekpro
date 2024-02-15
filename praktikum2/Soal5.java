/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum2;
import java.util.Scanner;

/*
 * Author : Micho Dhani F
 * Nim : 231524013
 * Kelas : 1A
 */

public class Soal5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        String B = scan.nextLine();
        
        int sumPanjang = A.length()+B.length(); 
        System.out.println(sumPanjang);
        
        if (A.compareTo(B) >= 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        String NewA = A.substring(0,1).toUpperCase() + A.substring(1);
        String NewB = B.substring(0,1).toUpperCase() + B.substring(1); 
        System.out.println(NewA +" "+ NewB);
    }
}
