import java.util.*;


class con{
	static double ftoc(int a){
		return ((a-32)*5)/9;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
			
		System.out.println("Enter temperature in Farenheit");
		int a= sc.nextInt();
		System.out.println("The temperature in Celsius is "+ftoc(a));
	
}
}