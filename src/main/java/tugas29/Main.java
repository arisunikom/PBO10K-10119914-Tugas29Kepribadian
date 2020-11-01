/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas29;
import java.util.Scanner;

/**
 *
 * @author
 * Aris Prabowo
 * IF10K - 10119914
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String RESET = "\u001B[0m";
        final String MERAH = "\u001B[31m";
        final String HIJAU = "\u001B[32m";
        final String KUNING = "\u001B[33m";
        final String BIRU = "\u001B[34m";
        final String UNGU = "\u001B[35m";
        final String BIRUMUDA = "\u001B[36m";
        final String PUTIH = "\u001B[37m";
        
        final String BGMERAH = "\u001B[41m";
        final String BGHIJAU = "\u001B[42m";
        final String BGKUNING = "\u001B[43m";
        final String BGBIRU = "\u001B[44m";
        final String BGUNGU = "\u001B[45m";
        
        String nama;
        String warnaFavorit;
        var scanner = new Scanner(System.in);
        
        String[] kepribadianBiru = {"Menyenangkan",
            "Bijaksana",
            "Pembawaan Diri Tenang Saat Menghadapi Masalah",
            "Dinamis",
            "Senang Berbagi",
            "Bersahabat",
            "Tidak Terlalu Suka Menjadi Sorotan Banyak Orang",
            "Menyembunyikan Perasaan Karena Karakternya Yang Cenderung Mencari Jalan Damai"
        };

        String[] kepribadianMerah = {"Periang",
            "Pemberani",
            "Berani Mengambil Resiko Dalam Setiap Langkah",
            "Menyukai Tantangan",
            "Kurang Sabar",
            "Bersahabat",
            "Dapat Menahan Marah Namun Juka Sudah Tahap Puncak Toleransi, Kemarahannya Akan Sulit Dikontrol",
            "Memiliki Energi Kehangatan Dan Cinta"
        };

        String[] kepribadianKuning = {"Optimis",
            "Suka Bergaul",
            "Periang",
            "Senang Menolong",
            "Lincah Dan Aktif",
            "Tidak Suka Meremehkan Kekurangan Orang Lain",
            "Loyal",
            "Hangat",
            "Meskipun Karakternya Optimis Dan Idealis, Seringkali Goyah Dan Tidak Stabil",
            "Cenderung Penakut"
        };

        String[] kepribadianUngu = {"Optimis",
            "Tidak Pernah Ragu",
            "Menurutnya Pasangan Yang Ideal Adalah Yang Memiliki Mental Yang Kuat",
            "Memiliki Ambisi Yang Besar",
            "Memiliki Empati Yang Besar",
            "Memiliki Sisi Misterius Sebab Seringkali Menutupi Perasaannya",
            "Terkadang Bersikap Keras Kepala Dan Angkuh"
        };

        String[] kepribadianHijau = {"Romantis",
            "Menyukai Hal Yang Berbau Alami Dan Keindahan",
            "Teguh Pada Perinsip",
            "Mengiginkan Kesempurnaan",
            "Mudah Cemburu",
            "Mudah Merasa Iri",
            "Menjunjung Tinggi Suatu Nilai Toleransi Dan Kepercayaan"
        };

        System.out.println(MERAH + "YUK " + HIJAU + "CHECK " + KUNING + 
                "KEPRIBADIANMU " + BIRUMUDA + "DARI " + UNGU + "WARNA " + BIRU + "FAVORITMU \n");
        System.out.printf("%s %s \tMERAH\t %s%n",BGMERAH, PUTIH, RESET);
        System.out.printf("%s %s \tHIJAU\t %s%n",BGHIJAU, PUTIH, RESET);
        System.out.printf("%s %s \tKUNING\t %s%n",BGKUNING, PUTIH, RESET);
        System.out.printf("%s %s \tBIRU\t %s%n",BGBIRU, PUTIH, RESET);
        System.out.printf("%s %s \tUNGU\t %s%n",BGUNGU, PUTIH, RESET);

        System.out.println("\nPilih Warna Favoritmu : ");
        warnaFavorit = scanner.nextLine().toUpperCase();
        System.out.println("Nama Kamu : ");
        nama = scanner.nextLine();

        System.out.printf("\n==== HASIL TEST KEPRIBADIAN %S ====\n", nama);
        
        switch (warnaFavorit) {
            case "MERAH":
                System.out.printf("Warna Favoritmu Adalah : %s%s%s\n", MERAH, warnaFavorit, RESET);
                PrintArray(kepribadianMerah);
                break;
            case "HIJAU":
                System.out.printf("Warna Favoritmu Adalah : %s%s%s\n", HIJAU, warnaFavorit, RESET);
                PrintArray(kepribadianHijau);
                break;
            case "KUNING":
                System.out.printf("Warna Favoritmu Adalah : %s%s%s\n", KUNING, warnaFavorit, RESET);
                PrintArray(kepribadianKuning);
                break;
            case "BIRU":
                System.out.printf("Warna Favoritmu Adalah : %s%s%s\n", BIRU, warnaFavorit, RESET);
                PrintArray(kepribadianBiru);
                break;
            case "UNGU":
                System.out.printf("Warna Favoritmu Adalah : %s%s%s\n", UNGU, warnaFavorit, RESET);
                PrintArray(kepribadianUngu);
                break;
            default:
                System.out.println("Ooops... Belum Teridentifikasi");
                break;
        }
    }

    private static void PrintArray(String[] kepribadian) {
        var lengthArray = kepribadian.length;
        for (int i = 0; i < lengthArray; i++) {
            if (lengthArray - 1 != i) {
                System.out.printf("%d. %s,\n", i + 1, kepribadian[i]);
            } else {
                System.out.printf("%d. %s.", i + 1, kepribadian[i]);
            }
        }
    }
    
}
