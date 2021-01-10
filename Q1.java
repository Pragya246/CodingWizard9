import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int s=sc.nextInt();
		System.out.println("Enter the array of size "+s);
		int arr[]=new int[s];
		for(int i=0;i<s;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the number which you need to check");
		int sum=sc.nextInt();
		Triplet(arr,sum);
		
	}
	static boolean Triplet(int[] a,int s)
	{
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			int p=i+1,q=a.length-1;
			while(p<q)
			{
				if(a[i]+a[p]+a[q]==s)
				{
					System.out.println(a[i]+" "+a[p]+" "+a[q]);
					return true;
				}
				else if(a[i]+a[p]+a[q]<s)
					p++;
				else
					q--;
			}
			
			
		}
		System.out.println("Alas! No triplet was found.");
		return false;
	}
}

