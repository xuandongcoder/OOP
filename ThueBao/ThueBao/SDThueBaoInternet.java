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
		System.out.println("______________________________________________________");
		System.out.println("\n\nNhap so luong thue bao trong danh sach: ");
		n = sc.nextInt();
		ThueBaoInternet ds[] = new ThueBaoInternet[n];
		for(int i = 0; i < n; i++) {
			ds[i] = new ThueBaoInternet();
			System.out.println("Nhap thong tin cho thue bao thu " + (i+1));
			ds[i].nhap();
			ds[i].hienthi();
		}
		
		
		//hien thi thue bao co tien cuoc cao nhat
		ThueBaoInternet tempsp = new ThueBaoInternet();
		int max = ds[0].tocdo();
		System.out.println("______________________________________________________");
		for(int i = 1; i < n; i++) {
			if(max < ds[i].tocdo()) {
				max = ds[i].tocdo();
				tempsp = ds[i];
				System.out.println("Thue bao co tien cuoc hang thang cao nhat la: ");
				tempsp.hienthi();
			}
			
		}
		
		
		System.out.println("______________________________________________________");
		//hien thi tong tien cuoc se thu
		long total = 0;
		for(int i = 0; i < n; i++) {
			total += ds[i].tinhCuoc();
		}
		System.out.println("\n\n\nTong tien se thu duoc cua danh sach thue bao la: " + total);
		
		System.out.println("______________________________________________________");
		//hien thi thue bao co thoi gian su dung lau nhat
	for(int i = 0; i < n; i++) {
		for(int j = i + 1; j < n; j++) {
			if(ds[i].layNgayDangKy().giaTriNam() > ds[j].layNgayDangKy().giaTriNam()) {
				ThueBaoInternet temp = ds[j];
				ds[j] = ds[i];
				ds[i] = temp;
			}
			else {
				if(ds[i].layNgayDangKy().giaTriNam() == ds[j].layNgayDangKy().giaTriNam()) {
					if(ds[i].layNgayDangKy().giaTriThang() > ds[j].layNgayDangKy().giaTriThang()) {
						ThueBaoInternet temp = ds[j];
						ds[j] = ds[i];
						ds[i] = temp;
					}
					else {
						if(ds[i].layNgayDangKy().giaTriThang() == ds[j].layNgayDangKy().giaTriThang()) {
							if(ds[i].layNgayDangKy().giaTriNgay() > ds[j].layNgayDangKy().giaTriNgay()) {
								ThueBaoInternet temp = ds[j];
								ds[j] = ds[i];
								ds[i] = temp;
							}
						}
					}
				}
			}
		}
	}
	System.out.println("\nDanh sach sau khi sap xep theo ngay tang dan: ");
	for(int i = 0; i < n; i++) {
		System.out.println("\nThue bao thu " + (i+1));
		ds[i].hienthi();
	}
		
		
		//tim kiem thong tin khach hang tu so ID
		String tempID;
		ThueBaoInternet tempid = new ThueBaoInternet();
		tempid.timID();
		System.out.println("______________________________________________________");
		tempID = tempid.layCancuoc();
		for(int l = 0; l < n; l++) {
			if(ds[l].layCancuoc().compareTo(tempID) == 0) {
				System.out.println("Thong tin khach hang can tim la: ");
				ds[l].hienthi();
			}
		}
		
		
		//hien thi nguoi dang ky nhieu tai khoan nhat
		System.out.println("______________________________________________________");
		String Mulreg;
		for(int h = 0; h < n; h++) {
			Mulreg = ds[h].hoten();
			for(int k = h+1; k < n; k++){
				if(ds[k].hoten().compareTo(Mulreg) == 0) {
				System.out.println("Khach hang nhieu tai khoan nhat can tim la: " + ds[k].hoten());
				ds[k].hienthi();
			}
			}
			
		}
		
		
		//ghi file
		FileOutputStream f = new FileOutputStream("thuebao.ser");
		ObjectOutputStream ous = new ObjectOutputStream(f);
		ous.writeObject(a);
		ous.writeObject(ds);
		ous.flush();
		ous.close();
		System.out.println("______________________________________________________");
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