import java.util.Scanner;

public class Tugaspraktek315 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);

        String merk,kategori;
        double ukuran,harga=0;

        System.out.println("------------------------------------------");
        System.out.println("-------- Daftar Harga Toko Sepatu --------");
        System.out.println("Merk Sepatu :");
        System.out.println("1. Converse ");
        System.out.println("2. Sketcher ");
        System.out.println("3. Nike ");
        System.out.println("Pilih merk Sepatu apa yang di beli : ");
        merk = util.nextLine();
        System.out.println("Berapa ukuran sepatu anda : ");
        ukuran = util.nextDouble();
        System.out.println("------------------------------------------");

        if (merk.equalsIgnoreCase("Converse")) {
            if (ukuran >= 36 && ukuran<=40 ) {
                harga = 800000;
                System.out.println("Kategori sepatu Slip On dengan harga Rp "+harga);
            }
            else if (ukuran >= 40 && ukuran<=44) {
                harga = 1200000;
                System.out.println("Kategori Sepatu High Top dengan harga Rp "+ harga);
            }else {
                System.out.println("Ukuran sepatu anda tidak tersedia!");
            }
            
        } else if (merk.equalsIgnoreCase("Sketcher")) {
            if (ukuran >= 36 && ukuran <= 40) {
                harga = 1000000;
                System.out.println("Kategori Sepatu untuk Wanita/woman dengan harga Rp "+harga);
            }
            else if (ukuran >=41 && ukuran <=44) {
                harga = 180000;
                System.out.println("Kategori Sepatu untuk Pria/man dengan harga Rp "+harga);
            }
            else{
                System.out.println("Ukuran sepatu anda tidak tersedia!");
            }
        }else if (merk.equalsIgnoreCase("Nike")) {
            if (ukuran>=36 && ukuran <= 40) {
                harga = 750000;
                System.out.println("Kategori sepatu untuk anak-anak/Kids dengan harga Rp "+harga);
            }
            else if (ukuran >= 40 && ukuran <= 44) {
                harga = 1500000;
                System.out.println("Kategori sepatu untuk Dewasa/Adult dengan harga Rp "+harga);
            }
            else{
                System.out.println("Ukuran sepatu anda tidak tersedia!");
            }
        } else{
            System.out.println("Masukkan merk sepatu yang tersedia!");
        }


    }
}
