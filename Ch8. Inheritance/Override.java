class A {
    int i, j;
    A(int a, int b) {
        i=a;j=b;
    }
    void show() {
        System.out.println("i: " + i + " j: " + j);
    }
}

class B extends A{
    int k;
    B(int a, int b, int c) {
        super(a,b);
        k=c;
    }
    void show() {
        // super.show() // To call superclass's show()
        System.out.println("k: " + k);
    }
}
class Override {
    public static void main(String[] args){
        B b = new B(1,2,3);
        b.show();
    }
}