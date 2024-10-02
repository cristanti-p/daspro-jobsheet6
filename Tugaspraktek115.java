import java.util.Scanner;

public class Tugaspraktek115 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);
        int angka, bilTerbesar;

        System.out.println("masukkan bilangan 1");
        int bil1 = util.nextInt();

        System.out.println("masukkan bilangan 2");
        int bil2 = util.nextInt();

        System.out.println("masukkan bilangan 3");
        int bil3 = util.nextInt();

        if (bil1>bil2) {
            if (bil1 > bil2) {
                bilTerbesar = bil1;
            } else {
                bilTerbesar = bil2;
            }
        } else {
            if (bil2 > bil3) {
                bilTerbesar = bil2;
            } else {
                bilTerbesar = bil3;
            }
        }
        System.out.println("Bilangan Terbesar adalah : " + bilTerbesar);
    }    
}
