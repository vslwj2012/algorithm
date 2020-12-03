package college.sy8;

import java.util.Scanner;

public class HeapSort {
	static int len=0;
	
	static void insert(int x,int heap[])
	{
		if(len>heap.length)
			return;
		
		len++;
		heap[len]=x;
		
		int parent=len/2;
		int current=len;
		
		while(parent>0&&heap[parent]>heap[current])
		{
			int temp=heap[parent];
			heap[parent]=heap[current];
			heap[current]=temp;
			
			current=parent;
			parent=current/2;
		}
	}
	
	static int delete(int heap[])
	{
		int top=heap[1];
		
		if(len==3&&heap[2]<heap[3])
		{
			int temp=heap[2];
			heap[2]=heap[3];
			heap[3]=temp;
		}
		
		heap[1]=heap[len];
		len--;
		
		for(int i=1;2*i<=len;)
		{
			int small=heap[2*i]<=heap[2*i+1]?(2*i):(2*i+1);
		
			if(heap[i]>small)
			{
				int temp=heap[i];
				heap[i]=heap[small];
				heap[small]=temp;
				
				i=small;
			}
			
			else break;
		}
		
		return top;
	}
	
	static void update(int x,int pos,int heap[])
	{
		heap[pos]=x;
		int parent=pos/2;
		int now=pos;
		int child=heap[2*pos]<=heap[2*pos+1]?(2*pos):(2*pos+1);
		
		while(true)
		{
			if(heap[now]<heap[parent])
			{
				int temp=heap[parent];
				heap[parent]=heap[now];
				heap[now]=temp;
				
				if(parent==1) break;
				
				parent=parent/2;
				now=now/2;
			}
			else if(heap[now]>=heap[parent]&&heap[now]<=heap[child])
			{
				break;
			}
			else if(heap[now]>heap[child])
			{
				int temp=heap[now];
				heap[now]=heap[child];
				heap[child]=temp;
				
				if(2*child+1>len)
				{
					break;
				}
				
				now=child;
				child=heap[2*child]<=heap[2*child+1]?(2*child):(2*child+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		
		int[] heap=new int[20];
		
		while(flag)
		{
			System.out.println("1.���Ԫ��");
			System.out.println("2.ɾ��Ԫ��");
			System.out.println("3.����Ԫ��");
			
			int m=sc.nextInt();
			switch(m)
			{
				case 1: 
				{
					System.out.println("������Ҫ���������");
					int x=sc.nextInt();
					insert(x, heap); 
					
					System.out.println("��ǰ����Ϊ��");
					for(int i=1;i<=len;i++)
					{
						System.out.print(heap[i]+" ");
					}
					
					System.out.println();
					
					break;
				}
				
				case 2:
				{
					System.out.println("��СԪ��Ϊ"+delete(heap));
					
					System.out.println("��ǰ����Ϊ��");
					for(int i=1;i<=len;i++)
					{
						System.out.print(heap[i]+" ");
					}
					
					System.out.println();
					
					break;
				}
				
				case 3:
				{
					System.out.print("������Ҫ�޸�Ԫ�ص�ֵ��");
					int x=sc.nextInt();
					System.out.print("������Ҫ�����λ�ã�");
					int pos=sc.nextInt();
					
					update(x,pos,heap);
					
					System.out.println("��ǰ����Ϊ��");
					for(int i=1;i<=len;i++)
					{
						System.out.print(heap[i]+" ");
					}
					
					System.out.println();
					break;
				}
				default :flag=false;
			}
		}
		
	}
}