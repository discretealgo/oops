class A{
    void callme(){
        System.out.println("Inside A's call me");
    }
}
class B extends A{
    void callme(){
        System.out.println("Inside  B's call me");
    }
}
class C extends A{
    void callme(){
        System.out.println("Inside C's call me");
    }
}
class DMD{
    public static void main(String args[]){
        A a  = new A();
        B b = new B();
        C c = new C();
        A r;
        r=a;
        r.callme();
        r=b;
        r.callme();
        r=c;
        r.callme();
        
    }
}