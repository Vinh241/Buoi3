package Buoi3;
import java.util.Scanner;

public class Bai4 {
	public static boolean check(int n) {
		if(n==2) return true;
		if(n%2==0) return false;
		for(int i=3;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return n>2;
	}
	public static boolean check2(int n ) {
		if(check(n)==false){
			return false;
		}
		while(n>0) {
			int k =n%10;
			n/=10;
			if(check(k)==false) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a =new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		boolean d= true;
		for(int i=0;i<n;i++) {
			if(check2(a[i])==true) {
				System.out.print(a[i]+ " ");
				d=false;
			}
		}
		if(d== true) {
			System.out.println("NO");
		}
	}
}
