import java.util.Scanner;
public class bioskop12 {
    
    public static void main(String[] args) {
        
        Scanner sc12 = new Scanner(System.in);
        int hargaTiket = 50000, totTerjual = 0, totTiket;
        double totalPenjualan = 0.0, hargaTotal;

        while (true) {
            System.out.println("Masukkan jumlah tiket yang dibeli atau ketik '0' untuk keluar");
            totTiket = sc12.nextInt();

            if (totTiket == 0) {
                break;
            } 
            if (totTiket < 0 ) {
                System.out.println("Jumlah tiket tidak valid, masukkan jumlah tiket yang valid: ");
                continue;
            }
            
            hargaTotal = totTiket * hargaTiket;
            double diskon = 0.0;

            if (totTiket > 10) {
                diskon = 0.15;
            }else if (totTiket > 4) {
                diskon = 0.10;
            }
            double hargaTotalDiskon = hargaTotal * (1-diskon);

            totTerjual += totTiket;
            totalPenjualan += hargaTotalDiskon;  
            
            System.out.println("Harga total untuk " + totTiket + " tiket adalah Rp. " + hargaTotalDiskon);
        }
        System.out.println("=======================================");
        System.out.println("Total tiket terjual " + totTerjual);
        System.out.println("Total penjualan tiket " + totalPenjualan);
    }
}
