package ThueBao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
class DocFile {
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("thuebao.ser");
			ObjectInputStream ois = new ObjectInputStream(f);
			ThueBaoInternet a = (ThueBaoInternet)ois.readObject();
			ThueBaoInternet ds[] = (ThueBaoInternet[])ois.readObject();
			ois.close();
			System.out.println("Cac thue bao nhan duoc");
			System.out.println();
			for(int i=0; i<ds.length; i++)
				ds[i].hienthi();
		}
		catch(FileNotFoundException e) {
			System.out.println("Khong tim thay file");
		}
		catch(IOException e) {
			System.out.println("Loi nhap xuat");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Khong tim thay lop ThueBao");
		}
	}
}