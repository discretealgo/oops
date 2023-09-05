class Overl{
	void test(){
		System.out.println("Blank space");
	}
	void test(double a){
		System.out.println("Double parameter is "+a);
	}
}

class Method_overloading{
	
	public static void main(String args[]){
		Overl ov = new Overl();
		System.out.println("now demonstrating method overloading here\n");
		ov.test();
		ov.test(5);
	}
}
			