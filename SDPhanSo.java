package ctu.cit;

public class SDPhanSo {
	public static void main(String[] args) {
		PhanSo a = new PhanSo(3,7);
		PhanSo b = new PhanSo(4,9);
		PhanSo x = new PhanSo();
		x.nhap();
		PhanSo y = new PhanSo();
		y.nhap();
		x.giaTriNghichDao().hienThi();
		System.out.print("x+y= ");
		x.cong(y).hienThi();
		
		
	}
}
