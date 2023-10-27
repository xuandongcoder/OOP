package ctu.cit;
import java.util.Scanner;
public class Diem {
		// Khai bao thuoc tinh
		private int x;
		private int y;
		// Dinh nghia cac ham xay dung (phuong thuc khoi tao - Constructor)
		public Diem() {
			x = y = 0;
		}
		public Diem(int h, int t) {
			x = h; y = t;
		}
		public Diem(int c) {
			x = y = c;
		}
		public Diem(Diem d) {	// Ham xay dung sao chep
			this.x = d.x;
			this.y = d.y;
		}
		// Ham sao chep sau
		public void makeCopy(Diem d) {
			this.x = d.x;
			this.y = d.y;		
		}

		// Dinh nghia cac phuong thuc
		public void khoiTao(int h, int t) {
			x = h;	y = t;
		}
		public void hienThi() {
			System.out.print("(" + x + "," + y + ")");
		}
		public void nhapDiem() {
			Scanner kb = new Scanner(System.in);
			System.out.print("Nhap hoanh do: ");
			x = kb.nextInt();
			System.out.print("Nhap tung do: ");
			y = kb.nextInt();
		}
		public void doiDiem(int dx, int dy) {
			x += dx;
			y += dy;
		}
		public float khoangCach() {
			return (float)Math.sqrt(x*x + y*y);
		}
		public int giaTriX() {
			return x;
		}
		public int giaTriY() {
			return y;
		}

		// Tinh khoang cach den diem d
		public float khoangCach(Diem d) {
			return (float)Math.sqrt( (x-d.x)*(x-d.x) + (y-d.y)*(y-d.y) );
		}
		
	}

