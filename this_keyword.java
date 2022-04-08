package access_specifier;

public class this_keyword extends Superclass {
	int a=9;//non-static global
	int b=4;//local
 int c=5;//static global

	public static void main(String[] args) {
this_keyword t=new this_keyword();
t.add();

	}

public void add()
{
	int b=90;
	int a=10;
	int sum=100+a;
	System.out.println("sum is using local variable"+sum);
	//int sum1=100+this.a;
	//System.out.println("sum is using global value"+sum1);
	int sub=100-b;
	//int sub1=1000-this.b;//
	System.out.println("sub is using local b is"+sub);
	//System.out.println("call variable from superclass "+super.a);//
}
public static void add1()
{
	int c=10;
	int sum=10+c;
}





			
	
	
	
		
	}

}
