// Constructurs execute in the order of their execution i.e. superclass from subclass.
class A{
    A() {
        System.out.println("This is A (superclass) constructor");
    }
}

class B extends A{
    B() {
        System.out.println("This is B (sublass) constructor");
    }
}

class C extends B{
    C() {
        System.out.println("This is C (sublass 2) constructor");
    }
}

class CallingCons {
    public static void main(String[] args){
        C c = new C();
    }
}