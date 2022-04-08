package access_specifier;

public class all1 {
  int a=10;//defaut global variable
public int b=20;//public global variable
protected int c=30;//protected global variable
private int d=40;//private global variable

	public static void main(String[] args) {
all1 s1=new all1();
s1.test1();
s1.test2();
s1.test3();
s1.test4();
System.out.println("Default global variable a is "+s1.a);
System.out.println("public global variable b is "+s1.b);
System.out.println("protected global variable is"+s1.c);
System.out.println("private global variable is "+s1.d);
	}


public void test1()
{
	System.out.println("public test1 method form all1 class");
}
void test2()
{
System.out.println("default test2 method form all1 class");
}
protected void test3()
{
	System.out.println("protected test3 method from all1 class");
}
private void test4()
{
	System.out.println("private test4 method from all1 class");
}
}
