
class primne{
	static int pro(int a){
		int count = 0;
		for(int i=1;i<=a;i++){
			if((a%i)==0){
				count  = count +1;
			}
		}
	return count;
	}
	public static void main(String args[]){
		int a;
		a = 15;
		
		int c = pro(a);
		if(c ==2){
		System.out.println("Prime no");
		}
		else{
			System.out.println("not a prime no");
		}
	}
}