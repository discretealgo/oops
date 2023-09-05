class A{
    int i,j;
    A(int x,int y){
        i=x;
        j=y;
    }
    void show(){
        System.out.println("i and j are "+i+" and  "+j);
    }
}
class B extends A{
    int k;
    B(int x,int y,int z){
        super(x,y);
        k=z;
    }
    void show(String mssg){
        System.out.println(mssg+k);
    }
}//end of B
class movr2{
    public static void main(String args[]){
        B b=new B(1,2,3);
        b.show();
        b.show("K is ");
    }
}