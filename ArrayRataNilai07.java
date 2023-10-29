import java.util.Scanner;;

public class ArrayRataNilai07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahsiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rata2lulus;
        double rata2tdkLulus;
        int jumlahLulus = 0;

        for(int i = 0; i< nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();

            if(nilaiMhs[i] > 70){
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
            }
        }
        if(jumlahLulus > 0){
            rata2lulus = totalLulus / jumlahLulus;
            System.out.println("rata rata nilai lulus: ");
        }else {
            System.out.println("Tidak ada mahasiswa yang lulus.");
        }
        if (jumlahMahasiswa - jumlahLulus > 0){
            rata2tdkLulus = totalTidakLulus / (jumlahMahasiswa - jumlahLulus);
            System.out.println("Rata rata nilai tidak lulus adalah =" +rata2tdkLulus);
        }else {
            System.out.println("Tidak ada mahasiswa yang lulus.");
        }

        }

    }

