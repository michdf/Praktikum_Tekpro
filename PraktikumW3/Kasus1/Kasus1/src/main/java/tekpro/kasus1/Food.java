package tekpro.kasus1;

public class Food {
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    
    public Food(String nama,double harga,int qty ){
        this.nama_makanan = nama;
        this.harga_makanan = harga;
        this.stok = qty;
    }
    
    // Getter atribut nama_makanan
    public String getNama() {
        return nama_makanan;
    }
    
    //Getter atribut harga_makanan
    public double getHarga() {
        return harga_makanan;
    }

    //Getter atribut Stok
    public int getStok() {
        return stok;
    }
}


