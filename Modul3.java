import java.util.Scanner;

public class Modul3 {
    
    public static void main (String[] args){
        String lanjut ="y";
        while(lanjut.equals("y")){
            Scanner input = new Scanner(System.in);
            
            System.out.println("-------------------------");
            System.out.println(" INPUT DATA MAHASISIWA ");
            System.out.println("-------------------------");
            System.out.println(" ");
            
            System.out.print("Universitas  : "); dataMahasiswa.Universitas = input.nextLine();
            System.out.print("NIM          : "); dataMahasiswa.NIM = input.nextLine();
            System.out.print("Nama         : "); dataMahasiswa.Nama = input.nextLine();
            System.out.print("Alamat       : "); dataMahasiswa.Alamat = input.nextLine();
            System.out.println("Daftar Kode Jurusan : ");
            System.out.println("Matematika          [61]");
            System.out.println("Biologi             [62]");
            System.out.println("Kimia               [63]");
            System.out.println("Fisika              [64]");
            System.out.println("Teknik Informatika  [65]");
            System.out.println("Sisitem Informasi   [66]");
            System.out.print("Kode Jurusan : "); dataMahasiswa.Jurusan = input.nextLine();
            System.out.println(" ");
            
            System.out.println("-------------------------");
            System.out.println("     Data Mahasiswa      ");
            System.out.println("-------------------------");
            System.out.println("Universitas : "+ dataMahasiswa.getUniversitas());
            System.out.println("NIM         : "+ dataUniversitas.getNIM());
            System.out.println("Nama        : "+ dataUniversitas.getNama());
            System.out.println("Alamat      : "+ dataMahasiswa.getAlamat());
            switch (dataMahasiswa.getJurusan()){
                case "61":
                    System.out.println("Jurusan     : Matematika");
                    break;
                case "62":
                    System.out.println("Jurusan     : Biologi");
                    break;
                case "63":
                    System.out.println("Jurusan     : Kimia");
                    break;
                case "64":
                    System.out.println("Jurusan     : Fisika");
                    break;
                case "65":
                    System.out.println("Jurusan     : Teknik Informatika");
                    break;
                case "66":
                    System.out.println("Jurusan     : Sistem Informasi");
                    break;
                default:
                    System.out.println("Kode Jurusan Tidak Valid");
            }
            System.out.println(" ");
            
            System.out.println("Apakah Anda Ingin Memeasukkan data lagi ?");
            System.out.println("1. Ya [y] \n2. Tidak [t]");
            System.out.println("Pilih : ");
            lanjut = input.nextLine();
        }
        System.out.println("-------------------------");
        System.out.println("       Terimakasih       ");
        System.out.println("-------------------------");
    }
}
