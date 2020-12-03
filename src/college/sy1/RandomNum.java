package college.sy1;

import java.util.Random;

public class RandomNum {
	
	static int get_rand(int upbound)
	{
		int x=new Random().nextInt(upbound)+1;
		return x;
	}
	
	public static void main(String[] args) {
		int n=100;
		int m=get_rand(n);
		
		System.out.println(m);
	}

}
