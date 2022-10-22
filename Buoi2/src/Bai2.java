import java.util.Scanner;
public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		for(int i=0;i<4;i++) {
			a[i]=sc.nextInt();
		}
		if(a[0]==a[1] && a[0]==a[2] && a[0]==a[3]) {
			System.out.println("Khong co so lon thu 2");
		}
		int m=a[0],minn=a[0];
		for(int i=1;i<4;i++) {
			if(a[i]>m ) {
				m=a[i];
			}
			if(a[i]<minn) {
				minn=a[i];
			}
		}
		int x=minn;
		for(int i=0;i<4;i++) {
			if(a[i]!=m && a[i] >x) {
				x=a[i];
			}
		}
		System.out.println(x);
	}
}
