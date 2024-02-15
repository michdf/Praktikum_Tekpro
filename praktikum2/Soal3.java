/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum2;
/*
 * Author : Micho Dhani F
 * Nim : 231524013
 * Kelas : 1A
 */

public class Soal3 {
    //Floating Point
    public static void main(String[] args){
        double x = 92.98;
        int nx = (int)Math.round(x);
        System.out.println(x);
        System.out.println(nx);
    }
}

/*
Output:
92.98
93

1. nilai nx dibulatkan kearah lebih besar, dikarenakan pembulatan yang dilakukan
   base on lebih dari ,5 atau kurang dari ,5
        Jika lebih dari ,5 bilangan dibulatkan ke arah yang lebih besar
        dan jika kurang dari ,5 bilangan dibulatkan ke arah yang lebih kecil

2. penggunaan cast (int) diperlukan agar output dari yang dihasilkan nx tidak menjadi desimal
    jika tanpa cast (int) maka tipe data nx perlu diubah ke double agar sesuai dengan nilai
    yang ingin dibulatkan sebelumnya
contoh: (dengan cast)
    Output : 93

contoh: (tanpa cast)
    Output : 93.00
*/
