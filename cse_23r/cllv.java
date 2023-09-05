class copi{
	double x;
	public copi(int x){
		this.x=x;
	}
	copi(copi c){
		System.out.println("The value of the variable is "+c.x);
	}
}

class cllv{
	
	public static void main(String args[]){
		copi c = new copi(5);
		copi c2= new copi(c);
	}
}