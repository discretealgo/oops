
class box
{
	
	double width;
	double height;
	double depth;
	double side;
	box(){
		width = 10;
		height = 15;
		depth = 20;
	
		side = 20;
	}
	double  cal_rec(){
		System.out.println("vol of RECTANGLE is"+width*height*depth);
		return width*height*depth;
	}
	double cal_cube(){
		System.out.println("VOl of squrare is"+Math.pow(side,3));
		return Math.pow(side,3);
}
}
class boxp{
	
	public static void main(String args[]){
		
		box recbox = new box();
		box cube = new box();
		System.out.println("Rectangular box");
		double rv = recbox.cal_rec();
		System.out.println("Cube");
		double cubev = cube.cal_cube();
		if(rv<cubev){
			System.out.println("Cube is  greater");
		}
		else{
			System.out.println("Rectangular  is greater");
		}

}		
}