package All_Types;

public class Z_PRACTICE {

	public void m1()
	{
		System.out.println("1");
	}
	public char m1(char y)
	{
		System.out.println("3");
		return y;
	}
	
	
	public int m1(int x)
	{
		System.out.println("2");
		return x;
	}
	
	
	public static void main(String[] args) {
		
		Z_PRACTICE p=new Z_PRACTICE();
		p.m1();
		p.m1(0);
		p.m1('g');
	
	}

}
