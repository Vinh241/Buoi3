package Buoi4;
import java.util.Scanner;
public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s= s.toLowerCase();
		int[] a= new int[300];
		for(int i=0;i<300;i++) {
			a[i]=0;
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)== ' '){
				continue;
			}
			a[s.charAt(i)] +=1;
		}
		for(int i=0;i<s.length();i++) {
			if(a[s.charAt(i)]==0 || s.charAt(i)==' ') {
				continue;
			}
			System.out.println(s.charAt(i)+ ": " + a[s.charAt(i)] );
			a[s.charAt(i)]=0;
		}
	}
}
