package college.sy1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class better{
	
	void search(int[] A,int x,int n)
	{
		int flag=0;

		for(int i=0;i<n;i++)
		{
			if(A[i]==x)
			{
				System.out.println(x+"�ڵ�"+(i+1)+"��λ��");
				return;
			}
		}
		
		if(flag==0) System.out.println("�����в�����"+x);
	}
}
public class Better_search {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] A={3,5,7,3,5,4,26,95,4,25};
		int n=A.length;
		
		System.out.print("������Ҫ��ѯ������");
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(buf.readLine());
		
		better bs=new better();
		bs.search(A, x, n);
	}

}