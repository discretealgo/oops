class Test{
	int a,b;
	Test(int x,int y){
		a=x;
		b=y;
	}
	boolean equal(Test o){
		if(o.a == a && o.b == b)
			return true;
		else 
			return false;
	}
}



class object_overl{
	public static void main(String args[]){
		Test o1 = new Test(1,3);
		Test o2 = new Test(1,3);
		System.out.println(" Comparison of two object "+o1.equal(o2));
	}
}