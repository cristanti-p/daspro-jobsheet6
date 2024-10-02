import java.util.Scanner;

public class Tugaspraktek215 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);
        int harga,jumlahbuku;
        String jenisbuku,novel,kamus;
        double diskon;

        System.out.println("---------------------------------------");
        System.out.println("======== Pilih Kategori buku ========");
        System.out.println("---------------------------------------");
        System.out.println("1.Buku Kamus");
        System.out.println("2.Buku Novel");
        System.out.println("3.Buku lainnya");
        System.out.print("Masukkan jenis buku yang ingin anda beli : ");
        jenisbuku= util.nextLine();
        System.out.print("Berapa jumlah buku yang anda beli : ");
        jumlahbuku= util.nextInt();
        System.out.println("---------------------------------------");
        
        if (jenisbuku.equalsIgnoreCase("Buku Lainnya")) {
           if (jumlahbuku>3) {
                diskon=0.5;
                System.out.println("Anda mendapatkan diskon 5%");
            }
            else{
               System.out.println("Harga Normal/anda tidak mendapatkan diskon"); 
            } 
        }else if (jenisbuku.equalsIgnoreCase("kamus")) {
           if (jumlahbuku>3) {
                diskon = 0.12; 
                System.out.println("Anda mendapatkan diskon 12%");
            }
            else{
                diskon = 0.10;
                System.out.println("Anda mendapatkan diskon 10%");
            } 
        } else if (jenisbuku.equalsIgnoreCase("novel")) {
            if (jumlahbuku>3) {
                diskon = 0.9;
                System.out.println("Anda mendapatkan diskon 9%");
            }
            else{
                diskon = 0.7;
                System.out.println("Anda mendapatkan diskon 7%");
            }
        } else{
            System.out.println("Harga normal!");
        }
    }
}
