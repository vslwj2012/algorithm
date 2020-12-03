package college.sy1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sentinel{
	
	int search(int[] A,int x,int n)
	{
		int last=A[n-1];
		int i=0;
		
		A[n-1]=x;
		
		while(A[i]!=x) {i++;}
		
		A[n-1]=last;
		
		if(i<n-1||A[n-1]==x) return i;
		
		return -1;
	}
}

public class Sentinel_linear_search {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] A={3,5,7,3,5,4,26,95,4,25};
		int n=A.length;
		
		System.out.print("������Ҫ��ѯ������");
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(buf.readLine());
		
		Sentinel s=new Sentinel();
		int flag=s.search(A, x, n);
		
		if(flag==-1) System.out.println("�����в�����"+x);
		else System.out.println(x+"λ�ڵ�"+(flag+1)+"��λ��");
	}

}
 
