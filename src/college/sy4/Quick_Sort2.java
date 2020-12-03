package college.sy4;

class QS{
	void sort(int[] arr,int s,int e){
		if(s>=e) return;
		
		int i=s+1;
		int key=arr[s];

		while(i<e&&arr[i]<key)
			i++;
		int j=i;
		while(i<=e)
		{
			if(arr[i]<key)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			i++;
		}
		
		arr[s]=arr[j-1];
		arr[j-1]=key;

		sort(arr,s,j-2);
		sort(arr,j,e);
	}
	
}

public class Quick_Sort2 {
	public static void main(String[] args)
	{
		int arr[]= new int[10];
		int len=arr.length;
		
		for(int i=0;i<len;i++)
		{
			arr[i]=(int)(0+Math.random()*99);
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		new QS().sort(arr, 0,len-1);
		
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

