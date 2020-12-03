package college.sy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Fibonacc{

	long Fib(int n){

		if(n==1) return 1;
		if(n==2) return 1;

		return Fib(n-1)+Fib(n-2);
	}
}

public class FibonacciDemo {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		System.out.print("������һ��������");
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(buf.readLine());

		if(n<=0) {
			System.out.println("������һ��������");
		}
		else{
			System.out.println("쳲��������еĵ�"+n+"��Ϊ��"+new Fibonacc().Fib(n));
		}
	}
}
