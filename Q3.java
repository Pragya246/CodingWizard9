import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer within the range 0 to 1000");
		int nm=sc.nextInt();
		Map<Integer,String> map=new HashMap<Integer,String>();
		//map.put(0,"0");
		map.put(1,"I");
		map.put(4,"IV");
		map.put(5,"V");
		map.put(9,"IX");
		map.put(10,"X");
		map.put(40,"XL");
		map.put(50,"L");
		//map.put(60,"LX");
		map.put(90,"XC");
		map.put(100,"C");
		map.put(400,"CD");
		map.put(500,"D");
		map.put(900,"CM");
		map.put(1000,"M");
		while(nm!=0)
		{
			if(nm>=1000)
			{
				System.out.print(map.get(1000));
				nm=nm-1000;
			}
			if(nm>=900)
			{
				System.out.print(map.get(900));
				nm=nm-900;
			}
			if(nm>=500)
			{
				System.out.print(map.get(500));
				nm=nm-500;
			}
			if(nm>=400)
			{
				System.out.print(map.get(400));
				nm=nm-400;
			}
			if(nm>=100)
			{
				System.out.print(map.get(100));
				nm=nm-100;
			}
			if(nm>=90)
			{
				System.out.print(map.get(90));
				nm=nm-90;
			}
			if(nm>=50)
			{
				System.out.print(map.get(50));
				nm=nm-50;
			}
			if(nm>=40)
			{
				System.out.print(map.get(40));
				nm=nm-40;
			}
			if(nm>=10)
			{
				System.out.print(map.get(10));
				nm=nm-10;
			}
			if(nm>=9)
			{
				System.out.print(map.get(9));
				nm=nm-9;
			}
			if(nm>=5)
			{
				System.out.print(map.get(5));
				nm=nm-5;
			}
			if(nm>=4)
			{
				System.out.print(map.get(4));
				nm=nm-4;
			}
			if(nm>=1)
			{
				System.out.print(map.get(1));
				nm=nm-1;
			}
			
				
		}
		
	}

}
