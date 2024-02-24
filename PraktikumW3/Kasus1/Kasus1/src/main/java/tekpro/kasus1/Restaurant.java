package tekpro.kasus1;

public class Restaurant {
    private Food[] food;
    private byte id = 0;    
    
    public Restaurant(){
        this.food = new Food[10];
    }
    
    //Method untuk menambah menu makanan
    public void tambahMenuMakanan(String nama,double harga,int qty){
        this.food[id] = new Food(nama,harga,qty);
        id++;
    }
   
    // Method untuk menampilkan menu makanan yang tidak habis stoknya (stok = 0)
    public void tampilMenuMakanan(){
        for(int i = 0; i < id ; i++){
            if(!isOutofStock(i)){
                System.out.println(food[i].getNama()+ "[" + food[i].getStok() + "]" + "\tRp. " + food[i].getHarga());
            }
        }
    }
    
    //Function yang mereturn TRUE atau FALSE mengenai stok yang dimiliki makanan tersebut
    public boolean isOutofStock (int id){
        return food[id].getStok() == 0;
    }
}
