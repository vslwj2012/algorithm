package college.sy7;

import java.util.Scanner;
import java.util.Stack;

public class DijkstraDemo {
	static int G[][]={
			{100,6,100,100,4},
			{100,100,3,100,2},
			{100,100,100,4,100},
			{7,100,5,100,100},
			{100,1,9,3,100}
		};
	
	static int len=G.length;
	static int[] shortest=new int[len];//��ʾԴ�㵽v�����·����Ȩ�غ�
	static String[] pred=new String[len];//pred[v]��ʾԴ�㵽v��֮ǰ�Ķ���
	
	static String[] point=new String[len];//�����
	static String[] Q=new String[len];//��ʣ���
	
	static void Dijkstra(String s)
	{
		for(int i=0;i<len;i++)
		{
			point[i]="p"+i;
			Q[i]="p"+i;
			shortest[i]=(int)Double.POSITIVE_INFINITY;
		}
		
		int i=0;//Դ���±�
		for(i=0;i<len;i++)
		{
			if(s.equals(point[i]))
			{
				shortest[i]=0;
				break;
			}
		}
		
		while(!allNull(Q))
		{
			int smallest=(int)Double.POSITIVE_INFINITY;
			int smallesti=-1;
			for(int x=0;x<len;x++)
			{
				if(Q[x]!=null&&shortest[x]<smallest)
				{
					smallest=shortest[x];
					smallesti=x;
				}
			}
			
			Q[smallesti]=null;
			
			for(int x=0;x<len;x++)
			{
				if((shortest[smallesti]+G[smallesti][x])<shortest[x])
				{
					shortest[x]=shortest[smallesti]+G[smallesti][x];
					pred[x]=point[smallesti];
				}
			}
		}
	}
	
	public static boolean allNull(String[] Q)
	{
		int flag=0;
		for(int i=0;i<Q.length;i++)
		{
			if(Q[i]!=null)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.print("������Դ��:");
		String s=sc.next();
		
		Dijkstra(s);
		
		for(int i=0;i<len;i++)
		{
			System.out.println("Դ�㵽"+point[i]+"�����̾���Ϊ:"+shortest[i]);
			int v=i;
			
			Stack st=new Stack();
			String path = null;
			
			int a=0,b=0;
			while(pred[v]!=null)
			{
				//pv��ǰ�ڵ�Ϊpred[v]
				
				st.push(pred[v]);
				
				v=pred[v].charAt(1)-'0';
			}
			
			while(!st.empty())
			{
				path+=st.pop()+" ";
			}
			
			System.out.println("��·��Ϊ:"+path+"p"+i);
		}
		
		
	}
}
