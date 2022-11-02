package Buoi3;
import java.util.Scanner;
public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int minn = a[0],maxx = a[n-1];
		int j =0;
		boolean d=true;
		for(int i=minn;i<=maxx;i++) {
			if(i==a[j]) {
				j++;continue;
			}
			d=false;
			System.out.print(i+ " ");
		}
		if(d==true) {
			System.out.println("YES");
		}
	}
}
