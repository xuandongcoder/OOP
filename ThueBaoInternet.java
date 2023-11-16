package ThueBao;

import java.io.Serializable;
import java.util.Scanner;


public class ThueBaoInternet implements Serializable {
	private String tenTK;
	private String chuTB;
	private String soID;
	private String diachi;
	private MyDate ngaydk;
	private int tocdo;
	
	public ThueBaoInternet() {
		tenTK = new String();
		chuTB = new String();
		soID = new String();
		diachi = new String();
		ngaydk = new MyDate();
		tocdo = 0;
	}
	
	public ThueBaoInternet(ThueBaoInternet tb) {
		tenTK = new String(tb.tenTK);
		chuTB = new String(tb.chuTB);
		soID = new String(tb.soID);
		diachi = new String(tb.diachi);
		ngaydk = new MyDate(tb.ngaydk);
		this.tocdo = tb.tocdo;
	}
	
	public void ThueBaoInternet(ThueBaoInternet tb) {
		this.tenTK = tb.tenTK;
		this.chuTB = tb.chuTB;
		this.soID = tb.soID;
		this.diachi = tb.diachi;
		ngaydk.makeCopy(tb.ngaydk);
		this.tocdo = tb.tocdo;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten tai khoan: ");
		tenTK = sc.nextLine();
		System.out.println("Nhap ten chu thue bao: ");
		chuTB = sc.nextLine();
		System.out.println("Nhap so CCCD / CMND chu thue bao: ");
		soID = sc.nextLine();
		System.out.println("Nhap dia chi thue bao dang ky: ");
		diachi = sc.nextLine();
		System.out.println("Nhap ngay dang ky thue bao: ");
		ngaydk.nhap();
		while(true) {
			System.out.println("Nhap goi cuoc muon dang ky: ");
			System.out.println("Cac goi cuoc gom: 60; 80; 110; 140; 250" + tocdo);
			tocdo = sc.nextInt();
			if(tocdo == 60 || tocdo == 80 || tocdo == 110 || tocdo == 140 || tocdo == 250) {
				break;
			}
				System.out.println("Nhap sai goi cuoc!! - Vui long nhap lai!!!");
		}
}

	public void hienthi() {
		System.out.println("Ten tai khoan: " + tenTK);
		System.out.println("Ten chu thue bao: " + chuTB);
		System.out.println("So CCCD / CMND: " + soID);
		System.out.println("Dia chi thue bao: " + diachi);
		System.out.println("Ngay dang ky: ");
		ngaydk.hienThi();
		System.out.println("\nGoi cuoc da dang ky: " + tocdo + "\n\n\n");

	}
	
	public int tinhCuoc() {
		switch(layTocdo()) {
			case 60:
				return 165000;
			case 80:
				return 180000;
			case 110:
				return 230000;
			case 140:
				return 280000;
			case 250:
				return 480000;
			default:
				System.out.println("Goi cuoc khong hop le!!!");
				return 0;
		}
	}
	
	public boolean equals(ThueBaoInternet tb) {
		if(this.tenTK == tb.tenTK && this.chuTB == tb.chuTB && this.diachi == tb.diachi && this.soID == tb.soID && this.ngaydk == tb.ngaydk && this.tocdo == tb.tocdo) {
			return true;
		}
		else return false;
	}
	
	public String toString() {
		return "Ten tai khoan: " + tenTK + "Ten chu thue bao: " + chuTB +
				"So CCCD / CMND: " + soID + "Dia chi thue bao: " + diachi + 
				"Goi cuoc da dang ky: " + tocdo + "Ngay dang ky: " + ngaydk + "\n";
	}
	public int tocdo() {
		return layTocdo();
	}
	public int layNgayDangKy() {
		return ngaydk.giaTriNgay();
	}
	public int layThangDangKy() {
		return ngaydk.giaTriThang();
	}
	public int layNamDangKy() {
		return ngaydk.giaTriNam();
	}
	public String layTaikhoan() {
		return tenTK;
	}
	public String layHoten() {
		return chuTB;
	}
	public String layCancuoc() {
		return soID;
	}
	public String layDiachi() {
		return diachi;
	}
	public int layTocdo() {
		return tocdo;
	}
}
