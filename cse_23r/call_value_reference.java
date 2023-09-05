class cv{
int x=10;int y=30;
int c=5;int d=4;
void c(int x,int y){
	c.x=x;c.y=y;
}
void test(int a,int b){
	
	this.x=x;
	this.y=y;
	x=x+a;
	y=y+b;


}
void test2(cv c){
	c.x=c.x+c;
	c.y=c.y+d;


}
}
class call_value_reference{
	public static void main(String args[]){
		cv c1= new cv();
		cv c2=new cv();
		c1.test(10,15);
		c2.test2(10,20);
		System.out.println("Value after test  "+c1.x+" "+c1.y);
		
		System.out.println("Value after test "+c2.x+" "+c2.y);


}
}