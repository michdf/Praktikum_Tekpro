package tekpro.kasus2;

/*
Author : Micho Dhani Firmansyah - 231524013
*/

public class Produk {
    private String nama;
    private int harga;
    private int stok;

    public Produk(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    
    //Getter atribut nama
    public String getNama() {
        return nama;
    }

    // Getter atribut harga
    public int getHarga() {
        return harga;
    }

    // Getter atribut stok
    public int getStok() {
        return stok;
    }

    // Method untuk mengurangi jumlah stok pada produk
    public void kurangiStok(int jumlah) {
        stok -= jumlah;
    }
}
