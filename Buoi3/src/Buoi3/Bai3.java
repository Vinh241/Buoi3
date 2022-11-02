package Buoi3;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int cnt= 1;
		int ans =0;
		for(int i=1;i<n;i++) {
			if(a[i]>= a[i-1] ) {
				cnt++;
			}else {
				cnt=1;
			}
			ans = Math.max(ans,cnt);
		}
		System.out.println(ans);
	}
}
