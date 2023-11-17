package ThueBao;

import java.util.Scanner;
import java.io.*;

class MyDate implements Serializable {
	// Khai bao cac thuoc tinh
	private int ngay;
	private int thang;
	private int nam;
	// Ham xay dung
	public MyDate() {
		ngay = 1; thang = 1; nam = 2000;
	}

	public MyDate(int d, int m, int y) {
		ngay = d; thang = m; nam = y;
	}

	public MyDate(MyDate d) {
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}
	public void makeCopy(MyDate d) {
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}

	// Cac phuong thuc
	public String toString() {
		String kq = "" + ngay + "/" + thang + "/" + nam;
		return kq;
	}

	public void hienThi() {
		System.out.print(ngay + "/" + thang + "/" + nam);
	}

	public void nhap() {
		while(true) {
			Scanner kb = new Scanner(System.in);
			System.out.print("Nhap ngay: ");
			ngay = kb.nextInt();
			System.out.print("Nhap thang: ");
			thang = kb.nextInt();
			System.out.print("Nhap nam: ");
			nam = kb.nextInt();
			if(hopLe()) break;
			System.out.println("Nhap sai - Nhap lai !!!");
		}
	}

	public boolean hopLe() {
		if(ngay<1 || thang<1 || thang>12)
			return false;
		if(thang==2 && nam%4==0)
			return (ngay<=29);
		int songaymax[] = {0, 31,28,31,30,31,30,31,31,30,31,30,31};
		return ( ngay <= songaymax[thang]);
	}

	public MyDate ngayMai() {
		if(ngay==28 && thang==2 && nam%4==0)
			return new MyDate(29,2,nam);
		MyDate kq = new MyDate(ngay+1,thang,nam);
		int songaymax[] = {0, 31,28,31,30,31,30,31,31,30,31,30,31};
		if(kq.ngay > songaymax[kq.thang]) {
			kq.ngay = 1;
			kq.thang++;
		}
		if(kq.thang>12) {
			kq.thang=1;
			kq.nam++;
		}
		return kq;
	}

	public MyDate congNgay(int n) {
		MyDate kq = new MyDate(ngay,thang,nam);
		for(int i=0; i<n; i++)
			kq = kq.ngayMai();
		return kq;
	}

	public boolean equals(MyDate d) {
		return (ngay==d.ngay && thang==d.thang && nam==d.nam);
	}

	// Getter
	public int giaTriNgay() {
		return ngay;
	}
	public int giaTriThang() {
		return thang;
	}
	public int giaTriNam() {
		return nam;
	}
}

