class boxd
{
	double width;
	double height;
	double depth;
}
class box{
	public static void main(String args[]){
		double volume;
		boxd mybox = new boxd();
		mybox.width =  Double.parseDouble(args[0]);
		mybox.height = Double.parseDouble(args[1]);
		mybox.depth = Double.parseDouble(args[2]);
		System.out.println("volumme ofthe box is "+(mybox.height*mybox.width*mybox.depth));
}
}