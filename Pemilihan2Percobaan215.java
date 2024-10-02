import java.util.Scanner;

public class Pemilihan2Percobaan215 {
    public static void main(String[] args) {
    Scanner input15 = new Scanner(System.in);
    
    String member;
    int pilihan_menu, jumlahbeli, harga=0;
    double diskon=0, totalbayar;

    System.out.println("---------------------------");
    System.out.println("====== MENU KAFE JTI ======");
    System.out.println("---------------------------");
    System.out.println("1. Rice Bowl");
    System.out.println("2. Ice Tea");
    System.out.println("3. Paket Bunding (Rice Bowl + Ice Tea)");
    System.out.println("---------------------------");
    System.out.println("masukkan angka dari menu yang dipilih =");
    pilihan_menu = input15.nextInt();
    input15.nextLine();
    System.out.println("apakah mempunyai member (y/n) ? = ");
    member = input15.nextLine();
    System.out.println("---------------------------");

        if (member.equals("y")) {
            diskon  = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
                
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
                
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            totalbayar = (int) harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + totalbayar);
        } 
        else if (member.equals("n")) {     
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
                
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
                
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling =" + harga);
                
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            System.out.println("Total bayar = " + harga);    

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("------------------------");
    }
}
