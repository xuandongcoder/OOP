package ctu.cit;
import java.util.Scanner;

import cit.ctu.Diem;

public class DuongTronHH extends DuongTron{
	
	private String maubien;
	private String maunen;
	public void DuongTronHh(){
		maubien = null;
		maunen = null;
	}
	public DuongTronHH(Diem tam, int bankinh, String maubien, String maunen) {
		super(tam, bankinh);
		this.maubien = maubien;
		this.maunen = maunen;
	}
	public DuongTronHH(int x, int y, int bk, String maubien, String maunen) {
		super(x, y, bk);
		this.maubien = maubien;
		this.maunen = maunen;
	}
	public DuongTronHH(DuongTronHH dt) {
		super(dt);
		this.maubien = dt.maubien;
		this.maunen = dt.maunen;
	}
	public void makeCopy(DuongTronHH d) {
		super.SaoChepSau(d);
		maubien = d.maubien;
		maunen = d.maunen;
	}
	public void nhap() {
		super.nhapDuongTron();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mau bien: ");
		this.maubien = sc.nextLine();
		System.out.println("Nhap mau nen: ");
		this.maunen = sc.nextLine();
		
	}
	public void hienthi() {
		super.hienThiDT();
		System.out.println("Mau bien: " + maubien);
		System.out.println("Mau nen: " + maunen);
	}
	public String toSring() {
		
	}
	public boolean equals() {
		
	}
	public String layMauBien() {
		return maubien;
	}
	public String layMauNen() {
		return maunen;
	}
}