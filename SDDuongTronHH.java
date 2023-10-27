package ctu.cit;



public class SDDuongTronHH {
	public static void main(String[] args) {
		Diem d1 = new Diem(2, 5);
		DuongTronHH gc1 = new DuongTronHH(d1, 6, "den", "xanh");
		gc1.hienthi();
		DuongTronHH gc2 = new DuongTronHH();
		gc2.nhap();
		gc2.hienthi();
		System.out.println("Chu vi cua duong tron gc2: "+ gc2.ChuVi());
		System.out.println("Dien tich cua duong tron gc2: "+ gc2.DienTich());
		gc2.DoiDT(1, 2);
		if(gc1.catNhau(gc2)) {
			System.out.println("gc1 va gc2 cat nhau");
		}
		else {
			System.out.println("gc1 va gc2 khong cat nhau");
		}
		if(gc1.equals(gc2)) {
			System.out.println("gc1 bang gc2");
		}
		else {
			System.out.println("gc1 khong bang gc2");
		}
	}
}