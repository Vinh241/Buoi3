package Buoi4;
import java.util.Scanner;
public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		int n =s.length();
		int ans =0;
		for(int i=0;i<n-1;i++) {
			char a = s.charAt(i),b = s.charAt(i+1);
			if(a == 'I' && (b=='V'|| b=='X')) ans-=2;
			if(a=='X' &&(b=='L' || b=='C')) ans-=20;
			if(a=='C' &&(b=='D' || b=='M')) {
				ans-=200;
			}
		}
		for(int i=0;i<n;i++) {
			char c = s.charAt(i);
			switch(c) {
				case 'I':
					ans+=1;
					break;
				case 'V': ans+=5;break;
				case 'X': ans+=10;break;
				case 'L': ans+=50;break;
				case 'C': ans+=100;break;
				case 'D': ans+=500;break;
				case 'M': ans+=1000;break;
		}
	}
		System.out.println(ans);
	}
}
