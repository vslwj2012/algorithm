package college.sy3;

class Select{
	void sort(int[] A,int n){
		for(int i=0;i<n-1;i++)
		{
			int smallest=i;
			
			for(int j=i+1;j<n;j++)
			{
				if(A[j]<A[smallest])
				{
					smallest=j;
				}
			}
			
			int temp=A[i];
			A[i]=A[smallest];
			A[smallest]=temp;
		}
	}
}
public class Select_Sort {
	public static void main(String[] args)
	{
		int A[]=new int[10];
		int n=A.length;
		
		for(int i=0;i<n;i++)
		{
			A[i]=(int)(0+Math.random()*99);
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
		
		new Select().sort(A, n);
		
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
	}
}
