
package projekakhir_praktikumsem1;
import java.util.Scanner;

public class Projekakhir_praktikumsem1 {
public static Scanner in = new Scanner(System.in);
     public static void main(String[] args) {

        // Membuat Array dan Scanner
        System.out.println("Bagi lahan kosong menjadi beberapa petak baris dan kolom");
        System.out.print("jumlah baris : ");
        int baris = in.nextInt();
        System.out.print("jumlah kolom : ");
        int kolom = in.nextInt();
        String[][] petak = new String[baris][kolom];
        

        // input jenis bunga di setiap petak
        for( baris = 0; baris < petak.length; baris++){
            for( kolom = 0; kolom < petak[baris].length; kolom++){
                System.out.printf("petak tanah ke (%d,%d) akan ditanami : ", baris, kolom);
                petak[baris][kolom] = in.next();
            }
        }

        // menampilkan isi Array
        System.out.println("   ");
         System.out.println("Format penanaman sayur pada lahan");
        System.out.println("-------------------------------------------------------");
        for( baris = 0; baris <petak.length; baris++){
            System.out.println(" ");           
            for( kolom = 0; kolom < petak[baris].length; kolom++){
                System.out.printf("| %8s | \t", petak[baris][kolom]);   
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
    }
}