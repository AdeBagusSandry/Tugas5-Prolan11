public class Warungpojok {
	public static void main (String[] args) {
	System.out.print("-- Makanan --\n\n");
	 Makanan makan1 = new Makanan();
     Makanan makan2 = new Makanan();	
	 Makanan makan3 = new Makanan();

	makan1.namamkn = "NASI GORENG";
    makan1.jenismkn = "NASI GORENG BUTO HIJO";
    makan1.harga = 12000;
    makan1.Informasimakanan();
	
	makan2.namamkn = "AYAM ";
    makan2.jenismkn = "AYAM PENYET";
    makan2.harga = 15000;
    makan2.Informasimakanan();
	
    makan3.namamkn = "MIE";
    makan3.jenismkn= "MIE GORENG JUMBO";
    makan3.harga = 8000;
    makan3.Informasimakanan();
	
	System.out.print("-- MINUMAN --\n\n");
	Minuman minum1 = new Minuman();
    Minuman minum2 = new Minuman();	
	Minuman minum3 = new Minuman();
	
	minum1.namamin = "KOPI";
	minum1.jenismin = "KOPI HITAM";
    minum1.harga = 5000;
    minum1.Informasiminuman();
	
	minum2.namamin = "JUICE";
	minum2.jenismin = "JUICE ALPUKET";
    minum2.harga = 8000;
    minum2.Informasiminuman();
	
	minum3.namamin = "TEH ";
	minum3.jenismin = "TEH MANIS";
    minum3.harga = 5000;
    minum3.Informasiminuman();
	
	System.out.print("-- INFORMASI WARUNG --\n\n");
	Warung warungpojok = new Warung();
	
	warungpojok.nama = "Warung Pojok";
	warungpojok.pemilik = "Bono";
	warungpojok.informasipemilikwarung();
	}
}