public class Tugas2tris {
    String nim;
    String nama;
    String notelp;
 
 public Tugas2tris(){
 
 }
    public Tugas2tris(String nim,String nama,String notelp){
    this.nim = nim;
    this.nama = nama;
    this.notelp = notelp;
 }
    @Override
    public String toString(){
    return "Mahasiswa{" + "nim="+nim + ", nama=" + nama+ ", notelp=" + notelp+'}';
 }
}
    