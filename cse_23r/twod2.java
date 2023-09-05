import java.util.*;


abstract class twodfigure{
    
    
    
    abstract void display();
    
        
    
}
class rectang extends twodfigure{
    int length,breadth;
    public rectang(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double CALC_AREA(int length,int breadth){
        double area = length * breadth;
        
        return area;
    }
    void display(){
        double b;
        b=CALC_AREA(length,breadth);
        System.out.println(" Area is : "+b);
    }
}
class tri extends twodfigure{
    int a,b,c;
    public tri(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    double CALC_AREA(int a,int b,int c){
        int per = (a+b+c);
        double s = per/2;
        double area;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(" Area is : "+area);

        return area;
    }
    void display(){
        double bg;
        bg=CALC_AREA(a,b,c);
        System.out.println(" Area is : "+bg);
    }
}
class twod2{
    public static void main(String args[]){
        System.out.println("1.RECTANGLE \n 2.TRIANGLE \n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==1){
            int l,b;
            l=20;b=5;
            rectang r=new rectang(l,b);
            
            r.display();
        }
        else if(a==2){
            int p,q,r;
            p=5;q=9;r=6;
            tri rk=new tri(p,q,r);
            
            rk.display();
        }
        else{
            System.out.println("enter valid choice");
        }
    }
}