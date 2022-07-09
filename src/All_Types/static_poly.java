//Static/compile time polymorphism //Method Overloading
package All_Types;

public class static_poly 
{
	public int m1(byte a)//normal method
	{
		System.out.println("I am from m1 with return type int");
		return a;//not having any function of it..just return the a because we give argument as a byte a
	}
	
	public void m1(int...b)//called as var argument
	{
		System.out.println("I am from m1 with return type void");
	}
	
	public void m1(int c)//called as="AUTO TRANSFFR"-integer convert to char type************
	{
		System.out.println("I am m1 with argument int");
	}

	public static void main(String[] args) //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	{
		static_poly s=new static_poly();
		s.m1(1);
		s.m1(10,20,30);
		s.m1('r');
	}

}
// return type can be same or different
//same name method in same class with different argument parameters
//can overload the main method**********
//not need to use inheritance concept because this compile time polymorphism happens in a same class.
//arguments need to be diffn in terms of== number(1/2),sequence(a,b/b,a),type(char/string)
// access modifiers and exceptions can be used same or different ==may or may not.
//overload means== load the work of 2 or more methods on different same name of methods
//var argument== eg.= int..,a= a.m1(10,19,17);
//Auto transfer =draw diagram eg.int converts to character
