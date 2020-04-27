class Outer{
    int outer_x=100;
    void test(){
        /* Enclosing class access members of nested class using Object
        */
        Inner inner = new Inner();
        inner.display();
        System.out.println("Method of Outer Class printing: "+inner.inner_x);
    }

    class Inner{
        int inner_x=10;

        void display() {
        /* Inner class access members of Outer class DIRECTLY
        */
            System.out.println("Method of Inner Class printing outer_x: " + outer_x);
        }
    }
}

class InnerClassDemo{
    public static void main(String[] args){
        Outer outer = new Outer();
        /* Object of Inner class can only be created in context of outer class
        */
        // Inner inner = new Inner();
        outer.test();
        // outer.display(); // --Throws error 'annot find symbol'
    }
}