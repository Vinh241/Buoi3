package Buoi4;
import java.util.Scanner;
public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s= s.trim();
		s=s.toLowerCase();
		String s1 = "";
		int d =1;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='0' && c<='9') continue;
			if(c==' ') {
				if(d==1) {
					continue;
				}
				d=1;
				s1+= c;
				continue;
			}
			if(d==1) {
				s1+=(char)(c-'a'+'A');
				d=0;
			}else {
				s1+=(char)(c);
			}
		}
		System.out.println(s1);
		
	}
}
