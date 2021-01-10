import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first and the second strings:");
		String s1=sc.nextLine(),s2=sc.next();
		boolean a[]= new boolean[500];
		StringBuffer s=new StringBuffer(s1);
		for(int i=0;i<s2.length();i++) {
			String temp = ""+s2.charAt(i);
			temp=temp.toUpperCase();
			a[temp.charAt(0)]=true;
			temp=temp.toLowerCase();
			a[temp.charAt(0)]=true;
		}
		for(int i=0;i<s1.length();i++) {
			if(!a[s1.charAt(i)])
				System.out.print(s1.charAt(i));
		}
		
		
	}

}
