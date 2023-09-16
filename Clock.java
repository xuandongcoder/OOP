
package ctu.cit;
//XuanDong
import java.util.Scanner;

public class Clock {
	private int gio;
	private int phut;
	private int giay;
	
	public Clock(){
		gio = 00;
		phut = 00;
		giay = 00;
	}
	
	public Clock(int h, int m, int s){
		gio = h;
		phut = m;
		giay = s;
	}
	
	public void inPut(){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap vao gio phut giay: ");
			gio = sc.nextInt();
			phut = sc.nextInt();
			giay = sc.nextInt();
			if(hopLe()){
				break;
			}
			System.out.println("Nhap sai dinh dang, nhap lai!!");
		}
	}
	
	
	public boolean hopLe(){
		if(gio < 0 || phut < 0 || giay < 0){
			return false;
		}
		else return true;
	}
	
	public void outPut(){
		System.out.println(gio+":"+phut+":"+giay);
	}
	
	public void roundUp(){
		if(giay >= 60){
			phut = phut + giay/60;
			giay = giay % 60;
		}
		if(phut>=60){
			gio = gio +phut/60;
			phut = phut % 60;
		}
		if(gio >=24){
			gio = gio%24;
		}
	}
	
	public Clock congPhut(int n){
		Clock kq = new Clock(gio, phut, giay);
		kq.phut = kq.phut +n;
		roundUp();
		return kq;
	}
	
	public int gtGio(){
		return gio;
	}
	
	public int gtPhut(){
		return phut;
	}
	
	public int gtGiay(){
		return giay;
	}
}
