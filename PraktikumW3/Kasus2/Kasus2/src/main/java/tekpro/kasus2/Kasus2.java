package tekpro.kasus2;
import java.util.Scanner;

/*
Author : Micho Dhani Firmansyah - 231524013
*/

public class Kasus2 {
    private static final int MAX_PRODUK = 10;
    private static final int MAX_PESANAN = 10;

    private static Produk[] daftarProduk = new Produk[MAX_PRODUK];
    private static Pesanan[] daftarPesan = new Pesanan[MAX_PESANAN];
    private static int jumlahProduk = 0;
    private static int jumlahPesan = 0;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inisialisasiProduk();

        boolean lanjutPemesanan = true;

        while (lanjutPemesanan) {
            tampilkanMenu();

            System.out.print("Masukkan nomor produk yang ingin dipesan: ");
            int nomorProduk = scanner.nextInt() - 1;

            if (isValidProduk(nomorProduk)) {
                System.out.print("Masukkan jumlah yang ingin dipesan: ");
                int jumlah = scanner.nextInt();
                
                if (jumlah <= daftarProduk[nomorProduk].getStok()) {
                    Pesanan pesanan = new Pesanan(daftarProduk[nomorProduk].getNama(),jumlah,daftarProduk[nomorProduk].getHarga() * jumlah);
                    tambahPesanan(pesanan);
                    daftarProduk[nomorProduk].kurangiStok(jumlah);
                    System.out.println("Pesanan berhasil ditambahkan.");
                    
                } else {
                    System.out.println("Stok tidak mencukupi.");
                }
                
            } else {
                System.out.println("Nomor produk tidak valid.");
            }

            System.out.print("Apakah Anda ingin memesan lagi? (y/n): ");
            String input = scanner.next();
            if (!input.equalsIgnoreCase("y")) {
                lanjutPemesanan = false;
            }
        }

        tampilkanDaftarPesanan();
        System.out.println("Total Pembayaran: " + hitungTotalPembayaran());

        scanner.close();
    }

    // Method untuk menginisialisasi produk (berisi penambahan produk yang ingin dimasukkan)
    private static void inisialisasiProduk() {
        // Penambahan produk (beserta harga dan stoknya)
        tambahProduk("Nasi Goreng", 15000, 10);
        tambahProduk("Ayam Bakar", 20000, 10);
        tambahProduk("Soto Ayam", 12000, 10);
        tambahProduk("Mie Goreng", 10000, 10);
        tambahProduk("Bakso", 8000, 10);
        tambahProduk("Sate Ayam", 18000, 10);
        tambahProduk("Gado-Gado", 10000, 10);
        tambahProduk("Sop Ayam", 12000, 10);
        tambahProduk("Pecel Lele", 15000, 10);
        tambahProduk("Es Teh Manis", 5000, 10);
    }
    
    //Method untuk menambahkan produk
    private static void tambahProduk(String nama, int harga, int stok) {
        daftarProduk[jumlahProduk++] = new Produk(nama, harga, stok);
    }

    //Method untuk menambah pesanan produk
    private static void tambahPesanan(Pesanan pesanan) {
        daftarPesan[jumlahPesan++] = pesanan;
    }

    //Method untuk memvalidasi apakah nomor produk yang dimasukkan ada dalam menu
    private static boolean isValidProduk(int nomorProduk) {
        return nomorProduk >= 0 && nomorProduk < jumlahProduk;
    }

    //Method untuk menampilan menu yang tersedia
    private static void tampilkanMenu() {
        System.out.println("========= Menu Makanan =========");
        for (int i = 0; i < jumlahProduk; i++) {
            Produk produk = daftarProduk[i];
            System.out.println((i + 1) + ". " + produk.getNama() + " - Harga: " + produk.getHarga() + " - Stok: " + produk.getStok());
        }
    }

    //Method untuk menampilkan hasil akhir pemesanan, dan menunjukkan subtotal dari makanan yang dipesan
    private static void tampilkanDaftarPesanan() {
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesan; i++) {
            Pesanan pesanan = daftarPesan[i];
            System.out.println("- " + pesanan.getNamaProduk() + " (Banyak Pesanan: " + pesanan.getJumlah() + ") - Total: " + pesanan.getTotalHarga());
        }
    }
    
    //Function untuk menghitung total pembayaran akhir dari pesanan yang telah dipesan
    private static int hitungTotalPembayaran() {
        int total = 0;
        for (int i = 0; i < jumlahPesan; i++) {
            Pesanan pesanan = daftarPesan[i];
            total += pesanan.getTotalHarga();
        }
        return total;
    }
}