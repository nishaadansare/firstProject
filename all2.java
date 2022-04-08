package access_specifier;

public class all2 {

	public static void main(String[] args) {
		all1 s1=new all1();
		//s1.test4();
		s1.test2();
		s1.test3();
		System.out.println("calling default member of all1 class"+s1.a);
		System.out.println("calling public  member of all1 class"+s1.b);
		System.out.println("calling protected member of all1 class"+s1.c);
	

	}
	

	
}
