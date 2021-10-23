/*
 * @ Nama : Muhammad Yusuf Adnin
 * This program can modify and share
 */
import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.io.IOException;

public class MainPegawai 
{
	public static void main(String[] ar)
	{
		Pegawai p = new Pegawai();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			System.out.print("Masukkan nama anda : ");
			p.nama = br.readLine();
			System.out.print("Masukkan alamat anda : ");
			p.alamat = br.readLine();
		}
		catch(IOException io)
		{
			System.out.println(io);
		}
		p.setNama(p.nama);
		p.setAlamat(p.alamat);
		
		System.out.println("___________________________");
		System.out.println("Nama : " + p.getNama());
		System.out.println("Alamat : " + p.getAlamat());
	}
}