package tekpro.kasus2;

/*
Author : Micho Dhani Firmansyah - 231524013
*/

public class Pesanan {
    private String namaProduk;
    private int jumlah;
    private int totalHarga;

    public Pesanan(String namaProduk, int jumlah, int totalHarga) {
        this.namaProduk = namaProduk;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
    }

    // Getter atribut namaProduk
    public String getNamaProduk() {
        return namaProduk;
    }

    // Getter atribut jumlah
    public int getJumlah() {
        return jumlah;
    }

    // Getter atribut totalHarga
    public int getTotalHarga() {
        return totalHarga;
    }
}
