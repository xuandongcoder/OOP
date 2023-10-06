package cit.ctu;

public class SDDuongTron {
	public static void main(String[] args) {
		Diem d1 = new Diem(2, 5);
		DuongTron dt1 = new DuongTron(d1 , 6);
		dt1.hienThiDT();
		DuongTron dt2 = new DuongTron();
		dt2.nhapDuongTron();
		dt2.hienThiDT();
		System.out.println("Chu vi: " + dt2.ChuVi());
		System.out.println("Dien tich: " + dt2.DienTich());
		dt2.DoiDT(1, 2);
		if(dt1.catNhau(dt2)) System.out.println("Hai duong tron cat nhau");
		else System.out.println("Hai duong tron khong cach nhau");
	}
}
