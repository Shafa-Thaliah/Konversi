
import java.util.Scanner;



/**
 *
 * @author Faa
 */
public class konversi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
    System.out.println("-----------Pilihan Konversi-----------");
    System.out.println("1. Jam --> Menit");
    System.out.println("2. Detik --> Hari, Jam, Menit, Detik");
    System.out.println("");
    System.out.print("Masukkan Pilihan Konversi :");
    
try (Scanner options = new Scanner(System.in)) {
    if (!options.hasNextInt()) {
    System.out.println("Anda salah, Silahkan inputkan angka kembali!");
      
} else {
    if (options.nextInt() == 1) {
        
        System.out.println("Anda Memilih Konversi (1) Jam --> Menit :");
        System.out.print("Masukkan Nilai Jam :");
        Scanner hours = new Scanner(System.in);
        jamKeMenit(hours.nextInt()); 
    }
    
 else {
        System.out.println("Anda Memilih Konversi (2) Detik --> Hari, Jam, Menit, Detik :");   
        System.out.print("Masukkan Nilai Detik :");
        try (Scanner seconds = new Scanner(System.in)) {
        detikKeHari(seconds.nextLong()); }
}
    }
  }
    }
   
public static void jamKeMenit(long jam) {
    long menit = jam * 60;
    System.out.println( jam + " Jam = " + menit+ " + Menit");
}

public static void detikKeHari(long detik) {
    //hari
    int hari = (int) (detik / (60 * 60 * 24));
    //jam
    detik %= (60 * 60 * 24);
    int jam = (int) (detik / (60 * 60));
    //menit
    detik %= (60 * 60);
    int menit = (int) (detik / 60);
    //detik
    detik %= 60;
    System.out.println(detik + "Detik =" + hari + " Hari, " + jam + "jam , " + menit + " menit, " + detik + " detik");
    }
}