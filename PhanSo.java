package ctu.cit;

import java.util.Scanner;

public class PhanSo {
	private int tu;
	private int mau;
	public PhanSo() {
		tu = 0; mau = 1;
	}
	public PhanSo(int t, int m) {
		 tu = t; mau = m;
	}
	public void nhap() {
		while (true){
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap tu: ");
		tu = kb.nextInt();
		System.out.print("Nhap mau: ");
		mau = kb.nextInt();
		if(mau!=0) break;
		System.out.println("Nhap sai-Nhap lai!!!");
	}
	}

	public void hienThi() {
		if(tu==0){
			System.out.print("0");
		}
		else if(mau==1){
			System.out.print(tu);
		}
		else System.out.println(tu + "/" + mau);
	}

	public void nghichDao() {
		int t=tu;
		tu=mau;
		mau=t;
	}
	public PhanSo  giaTriNghichDao(){
		PhanSo kb = new PhanSo(tu , mau);
		int t=kb.tu;
		kb.tu=kb.mau;
		kb.mau=t;
		return kb;
	}
	public float giaTriThuc(){
		return (float)tu/(float)mau;
	}
	public
	boolean  lonHon(PhanSo  a){
		if(a.giaTriThuc()>((float)tu/(float)mau))return true;
		return false;
	}
	public PhanSo  cong(PhanSo  a){
		PhanSo kq = new PhanSo(tu,mau);

		kq.tu = (kq.tu*a.mau)+(a.tu*kq.mau);
		kq.mau = (kq.mau*a.mau);
		return kq;
	}
	public PhanSo  congSN(int  a){
		PhanSo kq = new PhanSo(tu,mau);

		kq.tu = (kq.tu+a*kq.mau);
		kq.mau = (kq.mau);
		return kq;
	}
	public PhanSo  tru(PhanSo  a){
		PhanSo kq = new PhanSo(tu,mau);

		kq.tu = (kq.tu*a.mau)-(a.tu*kq.mau);
		kq.mau = (kq.mau*a.mau);
		return kq;
	}
	public PhanSo  truSN(int  a){
		PhanSo kq = new PhanSo(tu,mau);

		kq.tu = (kq.tu-a*kq.mau);
		kq.mau = (kq.mau);
		return kq;
	}
	public PhanSo  nhan(PhanSo  a){
		PhanSo kq = new PhanSo(tu,mau);

		kq.tu = (kq.tu*a.tu);
		kq.mau = (kq.mau*a.mau);
		return kq;
	}
	public PhanSo  nhanSN(int  a){
		PhanSo kq = new PhanSo(tu,mau);
		kq.mau = (kq.mau);
		kq.tu = (kq.tu*a);
		return kq;
	}
	public PhanSo  chia(PhanSo  a){
		PhanSo kq = new PhanSo(tu,mau);
		kq.mau = (kq.mau/a.mau);
		kq.tu = (kq.tu/a.tu);
		return kq;
	}
	public PhanSo  chiaSN(int  a){
		PhanSo kq = new PhanSo(tu,mau);
		kq.mau = (kq.mau);
		kq.tu = (kq.tu/a);
		return kq;
	}


	public int giaTriTu() {
		return tu;
	}
	public int giaTriMau() {
		return mau;
	}
}