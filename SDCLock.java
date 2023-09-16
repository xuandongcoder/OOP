package ctu.cit;

import java.util.Scanner;

public class SDCLock {
	public static void Main(String arg[]){
		Scanner sc = new Scanner(System.in);
		Clock a = new Clock();
		a.inPut();
		System.out.println("Nhap so phut n can cong: ");
		int n = sc.nextInt();
		a.congPhut(n);
		a.outPut();
	}
}
