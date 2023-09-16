package ctu.cit;

import java.util.Scanner;

public class SDCLock {
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		Clock c1 = new Clock(12, 65, 90);
		c1.roundUp();
		c1.outPut();
		
		Clock c2 = new Clock();
		c2.inPut();
		c2.roundUp();
		c2.outPut();
		System.out.println("Nhap so phut n can cong: ");
		int n = sc.nextInt();
		c2=c2.congPhut(n);
		c2.roundUp();
		c2.outPut();
	}
}
