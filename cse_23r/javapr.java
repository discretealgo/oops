import java.util.*;
class box
{
	
	double width;
	double height;
	double depth;
	double side;
	box(double w,double h,double d){
		width = w;
		height = h;
		depth = d;
	}
	double  cal(String obje){
		System.out.println("vol of"+obje+" is"+width*height*depth);
		return width*height*depth;
	}
	
}
class javapr{
	
	public static void main(String args[]){
		
		box recbox = new box(5,10,15);
		box cube = new box(10,10,10);
		System.out.println("Rectangular box");
		double rv = recbox.cal("recttangle");
		System.out.println("Cube");
		double cubev = cube.cal("cube");
		if(rv<cubev){
			System.out.println("Cube is  greater");
		}
		else{
			System.out.println("Rectangular  is greater");
		}

}		
}