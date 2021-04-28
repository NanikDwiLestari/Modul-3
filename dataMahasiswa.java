
public class dataMahasiswa extends dataUniversitas {
    static String Alamat ;
    static String Jurusan;
    
    public static String getAlamat() {
        return Alamat;
    }
    public static void setAlamat(String Alamat){
        dataMahasiswa.Alamat = Alamat;
    }
    public static String getJurusan(){
        return Jurusan;
    }
    public static void setJurusan(String Jurusan){
        dataMahasiswa.Jurusan = Jurusan;
    }
}
