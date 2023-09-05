import java.util.*;
class box
{
	
	double width;
	double height;
	double depth;
	Scanner sc = new Scanner(System.in);
	void setdata(){
		/*
		width = 10;
		height = 15;
		depth = 20;
		*/
		System.out.println("Enter the height,depth , width of rectangle");
		width = sc.nextDouble();
		height= sc.nextDouble();
		depth=sc.nextDouble();
	}
	void setdata2(){
		System.out.println("Enter the side length of cube");
		width = sc.nextDouble();
		height=depth=width;
/*
		width = 10;
		height = 10;
		depth = 10;
*/
	}
	double  cal(String obje){
		System.out.println("vol of "+obje+" is"+width*height*depth);
		return width*height*depth;
	}
}
class boxx{
	
	public static void main(String args[]){
		
		box recbox = new box();
		recbox.setdata();
		
		box cube = new box();
		cube.setdata2();
		//System.out.println("Rectangular box");
		double rv = recbox.cal("rectangle");
		//System.out.println("Cube");
		double cubev = cube.cal("cube");
		if(rv<cubev){
			System.out.println("Cube is  greater");
		}
		else{
			System.out.println("Rectangular  is greater");
		}

}		
}