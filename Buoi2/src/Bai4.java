import java.util.Scanner;
public class Bai4{
	public static boolean check(int k) {
		for(int i=1;i*i<=k;i++) {
			if(i*i ==k) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		do {
			n=sc.nextInt();
		}while(n<=0);
		boolean d= false;
		while(n>0) {
			int k = n%10;
			n/=10;
			if(check(k)==true) {
				d=true;
				System.out.print(k+ " ");
			}
		}
		if(d==false) {
			System.err.println("NO");
		}
	}
}
