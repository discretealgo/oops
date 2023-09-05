	
class Over{
	static int a = 5;
	static int b;
	static{

		b=a*2;
		System.out.println("Static members initialized");
	}
	public static void main(String args[]){
		a=5;
		System.out.println("Value of static member is"+a+" and "+b);
	}
}	
	