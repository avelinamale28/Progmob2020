package Class;

public class Mahasiswa {
    private String nim="";
    private String nama="";
    private String jurusan="";

    public  String getNim(){
        return nim;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getJurusan(){
        return jurusan;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public String toSting(){
        return "Mahasiswa{" +
                "nim= '" + nim + '\'' +
                "nama= '" + nama + '\'' +
                "jurusan='" + jurusan + '\''+
                '}';
    }
}
