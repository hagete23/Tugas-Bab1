// Nama     : Haidar Giri Tidar
// NIM      : 155150401111137
// Kelas    : SI-H
// Fakultas : Fakultas Ilmu Komputer
public class siam {
    public String nim,nama;
    public  String kode;
    private double ip;
    private int totalsks;
    private int sks=0;   
    public void setnama(String namm){
nama = namm;}
    public String getnama(){
        return nama;}
    public void setnim(String nimm){
nim = nimm;}
    public String getnim(){
        return nim;}
    public void setip(double ipp){
ip = ipp;
        if (ip>3.0){
totalsks=24;
System.out.println("SKS yang dapat diambil : 24");}
        else if (ip<3.0 && ip>=2.5){
totalsks=21;
System.out.println("SKS yang dapat diambil : 21");}
        else if (ip<2.5 && ip>=2.0){
totalsks=18;
System.out.println("SKS yang dapat diambil : 18");}
        else if (ip<2.0 && ip>=1.5){
totalsks=15;
System.out.println("SKS yang dapat diambil : 15");}
        else if (ip<1.5){
totalsks=12;
System.out.println("SKS yang dapat diambil : 12");}
    }
    public double getip(){
        return ip;
    }
    public  void setkode(String kodee){
kode = kodee;
        if (kodee.equalsIgnoreCase("IF15001")){
sks=sks+4;
System.out.println("IF15002  ||| Pemrograman Lanjut ||| 5 SKS");}   
        if (kodee.equalsIgnoreCase("KOM15003")){
sks=sks+3;
System.out.println("UBU0008  ||| Bahasa Inggris                      ||| 3 SKS");}
        if (kodee.equalsIgnoreCase("PTI15002")){
sks=sks+3;
System.out.println("PTI15002 ||| Pengantar TIIK                      ||| 3 SKS");}
        if (kodee.equalsIgnoreCase("PTI15004")){
sks=sks+4;
System.out.println("PTI15004 ||| Matematika Komputasi                ||| 4 SKS");}
        if (kodee.equalsIgnoreCase("PTI15001")){
sks=sks+5;
System.out.println("PTI15001 ||| Pemrograman Dasar                   ||| 5 SKS");}
        if (kodee.equalsIgnoreCase("KOM15002")){
sks=sks+4;
System.out.println("UNG4008  ||| Bahasa Indonesia                    ||| 3 SKS");}
        if (sks>totalsks){
System.out.println("Maaf IP anda tidak mencukupi untuk mengambil Mata Kuliah ini");}
        else
System.out.println("Anda Berhasil Memasukkan Mata Kuliah Ini");

    }
    public String getkode(){
        return kode;}
    public void setsks(int skss){sks=skss;}
    public  int getsks(){
        return sks;}
    public int getnilai(){
        return totalsks;}
    public String getminim(){
        if (sks>totalsks) 
            return "Maaf IP anda tidak memenuhi syarat";
        else
return "Kartu Rencana Studi Berhasil ";
        }
    }