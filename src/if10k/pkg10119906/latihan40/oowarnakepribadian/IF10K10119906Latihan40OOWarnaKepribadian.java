/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan40.oowarnakepribadian;
import java.util.Scanner;

/**
 *
 * @author senenngahenen
 */
public class IF10K10119906Latihan40OOWarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String warnaA;
        String nama;
        warna warna = new warna();
        Scanner scanner = new Scanner(System.in);

        System.out.print(warna.merah + "YUK "
                + warna.normal);
        System.out.print(warna.hijau + "CEK "
                + warna.normal);
        System.out.print(warna.kuning+ "KEPRIBADIANMU "
                + warna.normal);
        System.out.print(warna.birumuda + "DARI "
                + warna.normal);
        System.out.print(warna.ungu + "WARNA "
                + warna.normal);
        System.out.print(warna.biru + "FAVORITMU "
                + warna.normal + "\n");

        System.out.print("\n" + warna.bmerah + warna.putih
                + "\t MERAH \t\t\n" + warna.normal);
        System.out.print(warna.bhijau + warna.putih
                + "\t HIJAU \t\t\n" + warna.normal);
        System.out.print(warna.bkuning + warna.putih
                + "\t KUNING \t\n" + warna.normal);
        System.out.print(warna.bbiru + warna.putih
                + "\t BIRU \t\t\n" + warna.normal);
        System.out.print(warna.bungu + warna.putih
                + "\t UNGU \t\t\n\n" + warna.normal);

        System.out.print("PILIH WARNA FAVORITMU : ");
        warnaA = scanner.next();
        System.out.print("NAMA KAMU : ");
        nama = scanner.next();

        System.out.println("\n====HASIL TEST KEPRIBADIAN "
                + nama.toUpperCase() + "====");
        warna.hasilTest(warnaA);
    }
    
}
