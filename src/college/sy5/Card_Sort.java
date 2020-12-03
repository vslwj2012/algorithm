package college.sy5;

import java.util.Scanner;

class CardSort{
	char change[]= {'a','b','c','d','e','f','g','h',
			'i','j','k','l','m','n','o','p','q','r',
			's','t','u','v','w','x','y','z'};
	int count=4;
	String[] B;
	
	String[] sort(String[] A,int n,int m)
	{
		if(count<0) 
		{
			return B;
		}
		
		int[] equal=count_keys_equal(A,n,m,count);
		int[] less=count_keys_less(equal,m);
		B=rearrange(A,less,n,m,count);
		
		count--;
		
		return B=sort(A,n,m);
	}
	
	int[] count_keys_equal(String[] A,int n,int m,int count)
	{
		int[] equal=new int[m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(A[i].charAt(count)==change[j])
				{
					int key=j;
					equal[key]++;
					break;
				}
			}
		}
		return equal;
	}
	
	int[] count_keys_less(int[] equal,int m)
	{
		int[] less=new int[m];
		less[0]=0;
		for(int j=1;j<m;j++)
		{
			less[j]=less[j-1]+equal[j-1];
		}
		return less;
	}
	
	String[] rearrange(String[] A,int[] less,int n,int m,int count)
	{
		String[] B=new String[n];
		int[] next=new int[m];

		for(int j=0;j<m;j++)
		{
			next[j]=less[j]+1;
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(A[i].charAt(count)==change[j])
				{
					int key=j;
					int index=next[key];
					index--;
					B[index]=A[i];
					next[key]++;
					break;
				}
			}
			
		}
		
		return B;
	}
}

public class Card_Sort {
	public static void main(String[] args)
	{
		String[] str=new String[10];
		int len=str.length;
	
		Scanner sc =new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{
			str[i]=sc.next();
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.print(str[i]+" ");
		}
		
		System.out.println();
		
		String B[]=new CardSort().sort(str, len, 26);
		
		for(int i=0;i<len;i++)
		{
			System.out.print(B[i]+" ");
		}
	}
}