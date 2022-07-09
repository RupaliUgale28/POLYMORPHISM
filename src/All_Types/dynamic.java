//Dynamic/Run time polymorphism
package All_Types;
class parent
{
	public void m1()//not overrided method
	{
		System.out.println("hello");
	}
	public void m()//overrides the method m
	{
		System.out.println("hi i am parent of dynamic class.+");
	}
}

public class dynamic extends parent 
{
	public void m()//this method override the method m of parent class
	{
		System.out.println("Hello,I am child of parent class.");
	}

	public static void main(String[] args) 
	{
		dynamic d=new dynamic();//object of child class
		d.m();
		d.m1();
	}
}
//same method name,return type ,access modifier,exceptions,arguments.
//m method from class parent is overridden by method m of dynamic class.
//but m1 method from parent class is not overridden .
//handle by JVM.
//inheritance concept used.
//we can't override the static/main/final methods.== here we uses METHOD HIDDING concept
//here child class should have same or more strong access modifier than of parent class.
//same method name in diffn class with same return type and access modifiers,arguments
//access modifier  of child class should be stronger than that of parent class
//we can't override main method ,static method,final method.=constructor.
//