class boxddd
{
	double width;
	double height;
	double depth;
	void cal(){
		System.out.println("vol is"+width*height*depth);
	}
}
class boxdd{
	
	public static void main(String args[]){
		//double volume;
		boxddd mybox = new boxddd();
		mybox.width =  Double.parseDouble(args[0]);
		mybox.height = Double.parseDouble(args[1]);
		mybox.depth = Double.parseDouble(args[2]);
		//System.out.println("volumme ofthe box is "));
		mybox.cal();
}
}