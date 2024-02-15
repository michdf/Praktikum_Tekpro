/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum2;
import java.util.Scanner;
import java.math.BigInteger;

/*
Author : Micho Dhani F.
Nim : 231524013
Kelas : 1A
*/

public class Soal1 {
    //Data Types
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
                
        while (T > 0){
            BigInteger n = scan.nextBigInteger();
            BigInteger minByte = BigInteger.valueOf(Byte.MIN_VALUE);
            BigInteger maxByte = BigInteger.valueOf(Byte.MAX_VALUE);
            BigInteger minShort = BigInteger.valueOf(Short.MIN_VALUE);
            BigInteger maxShort = BigInteger.valueOf(Short.MAX_VALUE);
            BigInteger minInt = BigInteger.valueOf(Integer.MIN_VALUE);
            BigInteger maxInt = BigInteger.valueOf(Integer.MAX_VALUE);
            BigInteger minLong = BigInteger.valueOf(Long.MIN_VALUE);
            BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);
            
            if (n.compareTo(maxLong) > 0 || n.compareTo(minLong) < 0) {
                System.out.println(n + " can't be fitted anywhere.");
            }else{
                System.out.println(n + " can be fitted in:");
            }
            if (n.compareTo(maxByte) <= 0 && n.compareTo(minByte) >= 0) {
                System.out.println("* byte");
            }
            if (n.compareTo(maxShort) <= 0 && n.compareTo(minShort) >= 0) {
                System.out.println("* short");
            }
            if (n.compareTo(maxInt) <= 0 && n.compareTo(minInt) >= 0) {
                System.out.println("* int");
            }
            if (n.compareTo(maxLong) <= 0 && n.compareTo(minLong) >= 0) {
                System.out.println("* long");
            }
            T--;
        }
    }
}

/*
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
*/