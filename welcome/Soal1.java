/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.welcome;

/**
 *
 * @author ASUS TUF
 */
public class Soal1 {
    public static void main(String[] args){
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte)(angka1 + angka2);
        
        System.out.println("Hasil 1"+ hasil);
    }
}
/*
Output = Hasil 1-125

Hasil 1 didapat dari "Hasil 1"

-125 didapat dari :
Rentang Byte -128 sampai 127
kalau lebih bakal ngulang dari -128 lagi
jika 125 + 6 maka jika dihitung satu per satu maka akan menjadi seperti berikut:
126 -> 127 -> -128 -> -127 -> -126 -> -125

*/