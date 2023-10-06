package cit.ctu;

import java.util.Scanner;

public class DuongTron{
	private double Pi = 3.14;
	private Diem tam;
	private int bankinh;
	public DuongTron(){
		tam = new Diem();
		bankinh = 0;
	}
	public DuongTron(Diem tam, int bankinh){
		this.tam = new Diem(tam);
		this.bankinh = bankinh;
	}
	public DuongTron(int x, int y, int bk){
		tam = new Diem(x, y);
		bankinh = bk;
	}
	public void DuongTron2(DuongTron dt2){
		this.tam = new Diem(dt2.tam);
		this.bankinh = dt2.bankinh;
	}
	public DuongTron(DuongTron dt){
		this.tam = dt.tam;
		bankinh = dt.bankinh;
	}
	public void SaoChepSau(DuongTron dt){
		tam.makeCopy(dt.tam);
		bankinh = dt.bankinh;
	}
	public void nhapDuongTron(){
			Scanner sc = new Scanner(System.in);
			tam.nhapDiem();
			System.out.println("Nhap ban kinh: ");
			bankinh = sc.nextInt();
		}
	public void hienThiDT(){
		System.out.println("Tam duong trong la: ");
		tam.hienThi();
		System.out.println("Ban kinh duong tron la: "+ bankinh);
	}
	
	public void DoiDT(int dx, int dy){
		tam = new Diem(tam.giaTriX()+dx, tam.giaTriY()+dy);
	}
	public double DienTich(){
		return bankinh*bankinh*Pi;
	}
	public double ChuVi(){
		return bankinh*2*Pi;
	}
	public boolean trongDuongTron(Diem d){
		return Math.sqrt(Math.pow(d.giaTriX() - tam.giaTriX(), 2) + Math.pow(d.giaTriY() - tam.giaTriY(),2)) <= bankinh;
	}
	public boolean catNhau(DuongTron dt){
		double khoangcach = Math.sqrt(Math.pow(dt.tam.giaTriX() - tam.giaTriX(), 2) + Math.pow(dt.tam.giaTriY() - tam.giaTriY(),2));
		return khoangcach <= dt.bankinh + this.bankinh;
	}
	public Diem layTam(){
		return tam;
	}
	public int layBanKinh(){
		return bankinh;
	}
}

