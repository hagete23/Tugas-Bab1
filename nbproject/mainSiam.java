import java.util.Scanner;
public class mainSiam {
    public static String data[];
    public static void main(String[] args) {

        Scanner input= new Scanner (System.in);
System.out.println("----====== PROGRAM ======----");
System.out.println("Nama    : Haidar Giri Tidar");
System.out.println("Kelas   : SI-H");
System.out.println("NIM     : 155150401111137");
System.out.println("--------=============--------");

siam maha = new siam();
System.out.print("Masukkan Nama Anda  : ");
        String namah=input.nextLine();
maha.setnama(namah);
System.out.print("Masukkan Nim Anda   : ");
        String nimh=input.nextLine();
maha.setnim(nimh);
System.out.print("Masukkan IP Anda    : ");
        double ipmah=input.nextDouble();
maha.setip(ipmah);
System.out.print("Masukkan Jumlah Mata Kuliah yang Akan Diambil : ");
        int jum=input.nextInt();
        
System.out.println();
System.out.println("======== Daftar Mata Kuliah ========");
System.out.println("IF15002  ||| Pemrograman Lanjut                  ||| 5 SKS");
System.out.println("UBU0008  ||| Bahasa Inggris                      ||| 3 SKS");
System.out.println("PTI15002 ||| Pengantar TIIK                      ||| 3 SKS");
System.out.println("PTI15004 ||| Matematika Komputasi                ||| 4 SKS");
System.out.println("PTI15001 ||| Pemrograman Dasar                   ||| 5 SKS");
System.out.println("UNG4008  ||| Bahasa Indonesia                    ||| 3 SKS");

System.out.println("==========================================================");
System.out.println("Silahkan Pilih Kode Mata Kuliah");

        data=new String [jum];
        for (int i = 0; i<data.length; i++) {
System.out.print("Masukkan Kode Mata Kuliah : ");
            data[i]=input.next();
maha.setkode(data[i]);
        }
System.out.println(maha.getminim());
System.out.println("Jumlah SKS diambil       : "+maha.getsks());
System.out.println("Jumlah Maksimum SKS           : "+maha.getnilai());
    } 
}