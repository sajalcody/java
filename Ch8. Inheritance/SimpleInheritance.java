// package Ch8. Inheritance;

// INHERITANCE BASICS

// Superclass
class A{
    int i, j;
    void showIJ(){
        System.out.println("i: " + i + " j:" + j);
    }
}

//Subclass
class B extends A{
    int k;
    void showK(){
        System.out.println("k " + k);
    }
    void sum(){
        System.out.println("i+j+k: " + (i + j + k));
    }
}
class SimpleInheritance {
    public static void main(String[] args){
        A superObj = new A();
        B subObj = new B();
        superObj.i=10;
        superObj.j=20;
        System.out.println("Contents of superObj: ");
        superObj.showIJ();
        // Subclass has access to all members of superclass
        subObj.i=1;
        subObj.j=2;
        subObj.k=3;
        System.out.println("Contents of subObj: ");
        subObj.showIJ();
        subObj.showK();
        System.out.println("Sum of Contents of subObj: ");
        subObj.sum();
    }
}