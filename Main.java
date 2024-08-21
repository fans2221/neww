
abstract class Buku {
private String Judul;
private String Penulis;
private int Jumlah_Halaman;

//constructor
public Buku(String Judul, String Penulis, int Jumlah_Halaman){
    this.Judul = Judul;
    this.Penulis = Penulis;
    this.Jumlah_Halaman = Jumlah_Halaman;
}

//abstract
public abstract Double Harga();

//geter
public String getJudul(){
    return Judul;
}
public String getPenulis(){
    return Penulis;
}
public int getJumlah_Halaman(){
    return Jumlah_Halaman;
}

//seter
public void setJudul(String Judul){
    this.Judul = Judul;
}
public void setPenulis(String Penulis){
    this.Penulis = Penulis;
}
public void setHalaman(int Jumlah_Halaman){
    this.Jumlah_Halaman = Jumlah_Halaman;
}

//display
public void Tampilkan(){
    System.out.println("judul buku     = " + Judul);
    System.out.println("Penulis        = " + Penulis);
    System.out.println("Jumlah Halaman = " + Jumlah_Halaman);
    System.out.println("Harga Buku     = " + Harga());
}
    
}

//class turunan
class Agama extends Buku{
    public Agama(String Judul, String Penulis, int Jumlah_Halaman) {
        super(Judul, Penulis, Jumlah_Halaman);
    }
    @Override
    public Double Harga(){
        return 100000.00;
    }
}
class Sejarah extends Buku{
    public Sejarah(String Judul, String Penulis, int Jumlah_Halaman) {
        super(Judul, Penulis, Jumlah_Halaman);
    }
    @Override
    public Double Harga(){
        return 50000.00;
    }
}

public class Main {
    public static void main(String[] args) {
    Buku agama = new Agama("hidayah", "irfan", 150);
    Buku sejarah = new Sejarah("sejarah indonesia", "brasma", 200);

    System.out.println("buku ke 1 ");
    sejarah.Tampilkan();
    System.out.println("buku ke 2 ");
    agama.Tampilkan();
    }    
}