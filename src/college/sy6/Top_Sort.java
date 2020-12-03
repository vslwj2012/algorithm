package college.sy6;

public class Top_Sort {
	static void topSort(int[][] G,int n)
	{
		int[] indegree=new int[n];
		
		for(int i=0;i<n;i++)//��ʼ��indegree
		{
			for(int j=0;j<n;j++)
			{
				if(G[i][j]==1)
				{
					indegree[j]++;
				}
			}
		}
		
		int[] next = new int[n];
		
		int k=-1;
		for(int i=0;i<n;i++)//��ʼ��next
		{
			if(indegree[i]==0)
			{
				next[++k]=i;
			}
		}

		while(k>=0)
		{
			int key=next[k];
			System.out.print(key+" ");
			k--;
			
			for(int j=0;j<n;j++)
			{
				if(G[key][j]==1)
				{
					indegree[j]--;
					if(indegree[j]==0)//������indegree[j]--�������жϣ�������ܻ��ܵ�indegree�б��Ϊ0��ֵ��Ӱ��
					{				//ͬʱ�������ڵ�һ��if��ִ�У��������Խ��
						k++;
						next[k]=j;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] G= {
			{0,1,0,0,0,0,0},
			{0,0,1,1,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,1,0},
			{0,0,0,0,0,1,0},
			{0,0,0,0,0,0,1},
			{0,0,0,0,0,0,0}
		};
		
		topSort(G,7);
	}
}
