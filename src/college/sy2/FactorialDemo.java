package college.sy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Fac{
	long s=1;
	long factorial(long n)
	{
		if(n==0) return 1;
		if(n==1) return 1;
			
		return s=n*factorial(n-1);
	}
}

public class FactorialDemo {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		System.out.print("������һ�����ڵ���0����");
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		long n=Integer.parseInt(buf.readLine());
		if(n<0) System.out.println("�������ɽ׳ˣ�");
		else {
			long factorial=new Fac().factorial(n);
			System.out.println(n+"�Ľ׳�Ϊ��"+factorial);
		}
	}
}
