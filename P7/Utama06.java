
import java.util.Scanner;


public class Utama06 {
    public static void main(String[] args) {
        Scanner sc06 = new Scanner(System.in);
        Gudang06 gudang = new Gudang06(7);

        while (true) {
            System.out.println("Manu: ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = sc06.nextInt();
            sc06.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc06.nextInt();
                    sc06.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc06.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = sc06.nextLine();
                    Barang06 barangBaru = new Barang06(kode, nama, kategori);
                   gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                gudang.ambilBarang();
                break;
                case 3:
                gudang.tampilkanBarang();
                break;
                case 4:
                break;
                default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi. ");
                    break;
            }

        }
    }

}