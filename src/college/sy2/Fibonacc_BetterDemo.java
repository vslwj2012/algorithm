package college.sy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FibonaccBetter{
	long FibBetter(int n,long result[],int len){
		result[0]=1;
		result[1]=1;
		
		if(n==0) return result[0];
		if(n==1) return result[1];
		
		result[n]=FibBetter(n-1,result,len)+result[n-2];
		
		return result[n];
	}
}
public class Fibonacc_BetterDemo {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int len=100;
		long[] result=new long[len];
		
		System.out.print("������һ��������");
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(buf.readLine());
		
		if(n<=0) System.out.println("������һ��������");
		else {
			long sum=new FibonaccBetter().FibBetter(n-1, result,len);
			System.out.println("쳲��������еĵ�"+n+"��Ϊ��"+sum);
		}
	}
}
