package college.sy5;
class CS{
	int[] cke(int[] A,int n,int m)
	{
		int equal[]=new int[m];
		
		for(int i=0;i<n;i++)
		{
			int key=A[i];
			equal[key]++;
		}
		
		return equal;
	}
	
	int[] sort(int[] A,int n,int m)
	{
		int B[]=new int[n];
		int equal[]=cke(A,n,m);
		
		for(int i=0;i<m;i++)
		{
			System.out.print(equal[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<m;i++)
		{
			int j=0;
			while(equal[i]!=0)
			{
				B[j]=i;
				equal[i]--;
				System.out.print(equal[i]+" ");
				j++;
			}
		}
		System.out.println();
		return B;
	}
	
}

public class Demo {

	public static void main(String[] args) {
		int[] A=new int[10];
		int len=A.length;
		
		for(int i=0;i<len;i++)
		{
			A[i]=(int)(0+Math.random()*9);
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.print(A[i]+" ");
		}
		
		System.out.println();
		
		CS cs=new CS();

		int[] B=cs.sort(A, len, 10);
		for(int i=0;i<len;i++)
		{
			System.out.print(B[i]+" ");
		}
	}

}
