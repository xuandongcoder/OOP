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
		ThueBaoInternet tempsp = new ThueBaoInternet();
		int max = ds[0].tocdo();
		for(int i = 1; i < n; i++) {
			if(max < ds[i].tocdo()) {
				max = ds[i].tocdo();
				tempsp = ds[i];
			}
		}
		System.out.println("Thue bao co tien cuoc hang thang cao nhat la: ");
		tempsp.hienthi();
		
		
		//hien thi tong tien cuoc se thu
		long total = 0;
		for(int j = 0; j < n; j++) {
			total += ds[j].tinhCuoc();
		}
		System.out.println("Tong tien se thu duoc cua danh sach thue bao la: " + total);
		
		
		//hien thi thue bao co thoi gian su dung lau nhat
	for(int p = 0; p < n; p++) {
		for(int q = p + 1; q < n; q++) {
			if(ds[p].layNamDangKy() > ds[q].layNamDangKy()) {
				ThueBaoInternet temp = ds[q];
				ds[q] = ds[p];
				ds[p] = temp;
			}
			else {
				if(ds[p].layNamDangKy() == ds[q].layNamDangKy()) {
					if(ds[p].layThangDangKy() > ds[q].layThangDangKy()) {
						ThueBaoInternet temp = ds[q];
						ds[q] = ds[p];
						ds[p] = temp;
					}
					else {
						if(ds[p].layThangDangKy() == ds[q].layThangDangKy()) {
							if(ds[p].layNgayDangKy() > ds[q].layNgayDangKy()) {
								ThueBaoInternet temp = ds[q];
								ds[q] = ds[p];
								ds[p] = temp;
							}
						}
					}
				}
			}
		}
	}
	System.out.println("\nDanh sach sau khi sap xep: ");
	for(int i = 0; i < n; i++) {
		System.out.println("\nThue bao thu " + (i+1));
		ds[i].hienthi();
	}
		
		
		//tim kiem thong tin khach hang tu so ID
		String tempID;
		ThueBaoInternet tempid = new ThueBaoInternet();
		tempid.timID();
		tempID = tempid.layCancuoc();
		
		for(int l = 0; l < n; l++) {
			if(ds[l].layCancuoc().compareTo(tempID) == 0) {
				System.out.println("Thong tin khach hang can tim la: ");
				ds[l].hienthi();
			}
		}
		
		
		//hien thi nguoi dang ky nhieu tai khoan nhat
		String Mulreg;
		ThueBaoInternet mulreg = new ThueBaoInternet();
		Mulreg = ds[0].layHoten();
		for(int h = 0; h < n; h++) {
			if(ds[h].layHoten().compareTo(Mulreg) == 0) {
				System.out.println("Thong tin khach hang nhieu tai khoan nhat can tim la: ");
				ds[h].hienthi();
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
