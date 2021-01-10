import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int nm=n/2,val=1;
        for (int i=1;i<=n;i++) 
        { 	for (int j=1;j<=nm;j++) 
                System.out.print(" "); 
        	int count=val/2+1; 
            for (int k=1;k<=val;k++) 
            { 
                System.out.print(count); 
                if (k<=val/2) 
                    count--; 
                else
                    count++; 
            } 
            System.out.println(); 
            if (i<=n/2) { 
                nm=nm-1; 
                val=val+2; 
            } 
            else {
                nm=nm+1; 
                val=val-2; 
            } 
        } 
    } 

}
