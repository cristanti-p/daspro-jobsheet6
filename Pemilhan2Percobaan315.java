import java.util.Scanner;

public class Pemilhan2Percobaan315 {
    public static void main(String[] args) {
      Scanner input15 = new Scanner(System.in);
      
      String kategori;
      int penghasilan, gajibersih;
      double pajak = 0;

      System.out.println("Masukkan kategori : ");
      kategori = input15.nextLine();
      System.out.println("Masukkan Besarnya Penghasilan : ");
      penghasilan = input15.nextInt();

      if (kategori.equalsIgnoreCase("pekerja")) {
        if (penghasilan <= 2000000) {
            pajak = 0.1;
        } else if (penghasilan <= 3000000) {
            pajak = 0.15;
        } else {
            pajak = 0.2;
        }
        gajibersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.println("penghasilan bersih : " + gajibersih);
      } else if (kategori.equalsIgnoreCase("pebisnis")) {
        if (penghasilan <= 2500000) {
            pajak = 0.15;
        } else if (penghasilan <= 3500000) {
            pajak = 0.2;
        } else{
            pajak = 0.25;
        }
        gajibersih = (int) (penghasilan -  (pajak * penghasilan));
        System.out.println("Penghasilan bersih : " + gajibersih);
      } else 
      System.out.println("Masukkan kategori salah");
    }  
}
