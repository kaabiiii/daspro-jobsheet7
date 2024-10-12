import java.util.Scanner;
public class TugasParkir12 {

    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);

        int durasi, jenis, total = 0;

        while (true) {
        System.out.println("Masukkan Jenis Kendaraan (1 = Mobil, 2 = Motor, 0 keluar)");
        jenis = sc12.nextInt();
        if (jenis == 0) {
            break;
        } else if (jenis == 1 || jenis == 2) {
            System.out.println("Input durasi: ");
            durasi = sc12.nextInt();

            if (durasi > 5) {
                total += 12500;
                
            }else if (jenis == 1) {
                total += durasi * 3000;
            }else if (jenis == 2) {
                total += durasi*2000;
            }
            
            System.out.println("Total parkir yang harus dibayar adalah " + total);          
        }
        else{
            System.out.println("Silahkan pilih 1 untuk mobil dan 2 untuk motor");
            }
    }
    
}
}
