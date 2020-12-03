package college.sy1;

abstract class GetTime{
	public final void GetTime()
	{
		Double start=(double)System.nanoTime();
		
		runcode();
		
		Double end=(double)System.nanoTime();
		
		System.out.println((end-start));
	}
	
	public abstract void runcode();
}

class SubTime extends GetTime{
	public void runcode()
	{
		for(int x=0;x<120;x++);
			
	}
}

public class TemplateDemo {
	public static void main(String[] args)
	{
		SubTime gt=new SubTime();
		gt.GetTime();
	}
}
