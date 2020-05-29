class A{
    int common;
    int i;
    A(int a, int b){
        common = a;
        i = b;
    }
    void show() {
        System.out.println("Inside A's show()'");
        System.out.println("common= "+common+" i= "+i);
    }
}

class B extends A{
    int common;
    int j;
    B(int a, int b, int c, int d){
        super(a,b);
        common = c;
        j = d;
    }
    void show() {
        System.out.println("Inside B's show()'");
        System.out.println("common= "+common+" j= "+j);
        System.out.println("A's common " + super.common);
    }
    void showB(){
        System.out.println("Inside B's show()'");
        System.out.println("common= "+common+" j= "+j);
    }
}
class C extends B{
    int common;
    int k;
    C(int a, int b, int c, int d, int e, int f){
        super(a,b,c,d);
        common = e;
        k = f;
    }
    void show() {
        System.out.println("Inside C's show()'");
        System.out.println("common= "+common+" j= "+k);
        System.out.println("B's common " + super.common);
    }
}



public class Test {
    public static void main(String[] args){
        A a = new A(-1,-2);
        B b = new B(10,11,12,13);
        C c = new C(1,2,3,4,5,6);
        A r;
        r=a;
        r.show();
        /* Following line is valid, here r is a reference variable to class A and
            it is being assigned an object of B which is subclass of A.
        */
        r=b;
        /* Here B's show is called as for Overridden methods, it is the type of object being referred to and not
           the type of variable- that determines which version of overridden method is to be called. (Dynamic Method Dispatch)
        */
        r.show();
        /*  Following is an error as it is the type of reference variable and not the type of object
            it refers to - that determines which members can be accessed. 
        */
        // System.out.println("Accessing B's j via A's reference variable" + r.j); // ERROR
        // r.showB(); // Same ERROR
        r=c;
        c.show();
    }
}