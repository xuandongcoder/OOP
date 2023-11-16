package ThueBao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.*;


public class SDThueBaoInternet implements Serializable {
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		int n;
		ThueBaoInternet a = new ThueBaoInternet();
		a.nhap();
		a.hienthi();
		System.out.println("\n\nNhap so luong thue bao: ");
		n = sc.nextInt();
		ThueBaoInternet ds[] = new ThueBaoInternet[n];
		for(int i = 0; i < n; i++) {
			ds[i] = new ThueBaoInternet();
			ds[i].nhap();
			ds[i].hienthi();
		}
		
		
		//hien thi thue bao co tien cuoc cao nhat
		ThueBaoInternet temp = new ThueBaoInternet();
		int max = ds[0].tocdo();
		for(int i = 1; i < n; i++) {
			if(max < ds[i].tocdo()) {
				max = ds[i].tocdo();
				temp = ds[i];
			}
		}
		System.out.println("Thue bao co tien cuoc hang thang cao nhat la: ");
		temp.hienthi();
		
		
		//hien thi tong tien cuoc se thu
		long total = 0;
		for(int i = 0; i < n; i++) {
			total += ds[i].tinhCuoc();
		}
		System.out.println("Tong tien se thu duoc cua danh sach thue bao la: " + total);
		
		
		//hien thi thue bao co thoi gian su dung lau nhat
		ThueBaoInternet tempmax = new ThueBaoInternet();
		int maxyear = ds[0].layNamDangKy();
		int maxmonth = ds[0].layThangDangKy();
		int maxday = ds[0].layNgayDangKy();
		for(int i = 0; i < n; i++) {
			if(ds[i].layNamDangKy() < maxyear) {
				maxyear = ds[i].layNamDangKy();
				if(ds[i].layThangDangKy() > maxmonth) {
					maxmonth = ds[i].layThangDangKy();
					if(ds[i].layNgayDangKy() > maxday) {
						maxday = ds[i].layNgayDangKy();
						tempmax = ds[i];
					}
				}
			}
		}
		System.out.println("Thue bao da su dung dich vu lau nhat la: ");
		tempmax.hienthi();
		
		
		//tim kiem thong tin khach hang tu so ID
		String tempID;
		System.out.println("Nhap so CCCD / CMND khach hang can tim: ");
		tempID = sc.nextLine();
		for(int i = 0; i < n; i++) {
			if(ds[i].layCancuoc().compareTo(tempID) == 0) {
				System.out.println("Thong tin khach hang can tim la: ");
				ds[i].hienthi();
			}
		}
		
		
		//ghi file
		FileOutputStream f = new FileOutputStream("thuebao.ser");
		ObjectOutputStream ous = new ObjectOutputStream(f);
		ous.writeObject(a);
		ous.writeObject(ds);
		ous.flush();
		ous.close();
		System.out.println("Da ghi file thanh cong!!!");
	}
	catch(FileNotFoundException e) {
			System.out.println("Khong tim thay file!!!");
		}
	catch(IOException e) {
		System.out.println("Loi!!!");
		}
	}
}
