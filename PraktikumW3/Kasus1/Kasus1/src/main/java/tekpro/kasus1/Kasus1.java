package tekpro.kasus1;

public class Kasus1 {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        
        //Memanggil Method untuk menambah menu makanan (harga dan stoknya juga)
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        
        //Menampilkan menu makanan yang stoknya tidak 0 (habis/kosong)
        menu.tampilMenuMakanan();
    }
}
